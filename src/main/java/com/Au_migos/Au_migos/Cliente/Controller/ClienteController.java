package com.Au_migos.Au_migos.Cliente.Controller;

import com.Au_migos.Au_migos.Cliente.DTO.ClienteDto;
import com.Au_migos.Au_migos.Cliente.Service.ipml.ServiceClienteIpml;
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
@RequestMapping("/CadastroUsuario")
public class ControllerFuncionarios {

    private ServiceClienteIpml serviceClienteIpml;

    public ControllerFuncionarios(ServiceClienteIpml serviceClienteIpml) {
        this.serviceClienteIpml = serviceClienteIpml;
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<ClienteDto>>listarClientes(){
        List<ClienteDto> listar = serviceClienteIpml.listarCliente();
        return ResponseEntity.ok(listar);
    }
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarClientesId(@PathVariable Long id){
        return serviceClienteIpml.listarCLienteId(id);
    }
    @PostMapping("/criar")
    public ResponseEntity<?> criarCliente(@RequestBody ClienteDto clienteDto) {
        try {
            ClienteDto criado = serviceClienteIpml.criarCliente(clienteDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(criado);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> alterarDadosCliente (@PathVariable Long id, @RequestBody ClienteDto clienteDto){
        return serviceClienteIpml.alterarDadosCliente(id, clienteDto);
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarCliente(@PathVariable Long id){
        return serviceClienteIpml.deletarCliente(id);
    }
}
