package com.Au_migos.Au_migos.CadastroAnimais.Controller;

import com.Au_migos.Au_migos.CadastroAnimais.DTO.CadastroAnimaisDTO;
import com.Au_migos.Au_migos.CadastroAnimais.Service.Impl.AnimalServiceImpl;
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
@RequestMapping("/CadastroAnimais")
public class ControllerAnimais {

    private AnimalServiceImpl animais;

    public ControllerAnimais(AnimalServiceImpl animais) {
        this.animais = animais;
    }

    // MOSTRAR TODOS OS ANIMAIS
    @GetMapping("/listar")
    public ResponseEntity<List<CadastroAnimaisDTO>> listarAnimais() {
        List<CadastroAnimaisDTO> lista = animais.listarAnimais();
        return ResponseEntity.ok(lista);
    }

    // MOSTRAR ANIMAIS POR ID
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarAnimaisPorId(@PathVariable Long id) {
        CadastroAnimaisDTO animal = animais.listarAnimaisPorId(id);
        if (animal != null) {
            return ResponseEntity.ok(animal);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("ANIMAL COM ID: " + id + " NÃO FOI ENCONTRADO!");
        }
    }

    // ADICIONAR ANIMAL
    @PostMapping("/criar")
    public ResponseEntity<CadastroAnimaisDTO> criarAnimal(@RequestBody CadastroAnimaisDTO animaisDTO) {
        CadastroAnimaisDTO criado = animais.criarAnimal(animaisDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(criado);
    }

    // ALTERAR DADOS ANIMAIS
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> alterarAnimaisPorId(@PathVariable Long id, @RequestBody CadastroAnimaisDTO animaisAlterados) {
        if (animais.listarAnimaisPorId(id) != null) {
            CadastroAnimaisDTO atualizado = animais.alterarDadosAnimais(id, animaisAlterados);
            return ResponseEntity.ok(atualizado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("ANIMAL COM ID: " + id + " NÃO FOI ENCONTRADO!");
        }
    }

    // DELETAR ANIMAIS
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarAnimais (@PathVariable Long id){
        if (animais.listarAnimaisPorId(id) != null){
            animais.deletarAnimal(id);
            return ResponseEntity.ok("Animal com ID: " + id + " Deletado com sucesso!");
        }else
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("ANIMAL COM ID: " + id + " NÃO FOI ENCONTRADO!");
    }
}
