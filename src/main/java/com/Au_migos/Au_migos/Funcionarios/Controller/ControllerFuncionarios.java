package com.Au_migos.Au_migos.Funcionarios.Controller;

import com.Au_migos.Au_migos.Funcionarios.DTO.FuncionariosDTO;
import com.Au_migos.Au_migos.Funcionarios.Service.ipml.FuncionariosServiceIpml;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ControllerCadastroUsuario {

    private FuncionariosServiceIpml service;

    public ControllerCadastroUsuario(FuncionariosServiceIpml service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<FuncionariosDTO>> listarFuncionarios() {
        List<FuncionariosDTO> lista = service.listarFuncionarios();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarFuncionariosId(@PathVariable Long id) {
        return service.listarFuncionariosId(id);
    }

    @PostMapping("/criar")
    public ResponseEntity<?> criarFuncionario(@RequestBody FuncionariosDTO funcionariosDTO) {
        try {
            FuncionariosDTO criado = service.criarFuncionario(funcionariosDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(criado);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> alterarDadosFuncionario(@PathVariable Long id, @RequestBody FuncionariosDTO funcionariosDTO) {
        return service.alterarDadosFuncionario(id, funcionariosDTO);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarFuncionario(@PathVariable Long id) {
        return service.deletarFuncionario(id);
    }
}
