package com.Au_migos.Au_migos.TabelaCliente.Service.ipml;

import com.Au_migos.Au_migos.TabelaCliente.DTO.ClienteDto;
import com.Au_migos.Au_migos.TabelaCliente.Mapper.ClienteMapper;
import com.Au_migos.Au_migos.TabelaCliente.Molde.ClienteMolde;
import com.Au_migos.Au_migos.TabelaCliente.Repository.RepositoryCliente;
import com.Au_migos.Au_migos.TabelaCliente.Service.ServiceCliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ServiceClienteIpml implements ServiceCliente {

    private RepositoryCliente repository;
    private ClienteMapper mapper;

    public ServiceClienteIpml(RepositoryCliente repository, ClienteMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
    @Override
    public List<ClienteDto> listarCliente(){
        List<ClienteMolde> cadastros = repository.findAll();
        return cadastros.stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }
    @Override
    public ResponseEntity<?> listarCLienteId(Long id) {
        Optional<ClienteMolde> cliente = repository.findById(id);
        if (cliente.isPresent()) {
            ClienteDto dto = mapper.map(cliente.get());
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("CLIENTE COM ID: " + id + " NÃO FOI ENCONTRADO!");
        }
    }
    @Override
    public ClienteDto criarCliente(ClienteDto clienteDto) {
        if (repository.findByEmail(clienteDto.getEmail()).isPresent()) {
            throw new RuntimeException("E-mail já cadastrado!");
        }

        if (repository.findByCpf(clienteDto.getCpf()).isPresent()) {
            throw new RuntimeException("CPF já cadastrado!");
        }

        ClienteMolde cliente = mapper.map(clienteDto);
        ClienteMolde salvo = repository.save(cliente);
        return mapper.map(salvo);
    }
    @Override
    public ResponseEntity<?> alterarDadosCliente(Long id, ClienteDto dto){
        Optional<ClienteMolde> clienteExistente = repository.findById(id);
        if (clienteExistente.isPresent()) {
            ClienteMolde clienteAlterado = mapper.map(dto);
            clienteAlterado.setId(id);
            ClienteMolde clienteSalvo = repository.save(clienteAlterado);
            return ResponseEntity.ok(clienteSalvo);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("CLIENTE COM ID " + id + " NÃO FOI ENCONTRADO!");
        }
    }
    @Override
    public ResponseEntity<?> deletarCliente(Long id){
        Optional<ClienteMolde> cliente = repository.findById(id);
        if (cliente.isPresent()){
            return ResponseEntity.ok("CLIENTE COM ID " + id + " FOI DELETADO COM SUCESSO!");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("CLIENTE COM ID " + id + " NÃO FOI ENCONTRADO!");
        }
    }
}
