package com.Au_migos.Au_migos.TabelaCliente.Mapper;

import com.Au_migos.Au_migos.TabelaCliente.DTO.ClienteDto;
import com.Au_migos.Au_migos.TabelaCliente.Molde.ClienteMolde;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public ClienteMolde map(ClienteDto dto){
        ClienteMolde clienteMolde = new ClienteMolde();
        clienteMolde.setId(dto.getId());
        clienteMolde.setNome(dto.getNome());
        clienteMolde.setCpf(dto.getCpf());
        clienteMolde.setDataNascimento(dto.getDataNascimento());
        clienteMolde.setNumeroTelefone(dto.getNumeroTelefone());
        clienteMolde.setEmail(dto.getEmail());
        clienteMolde.setEndereco(dto.getEndereco());
        clienteMolde.setCidade(dto.getCidade());
        clienteMolde.setEstado(dto.getEstado());
        clienteMolde.setCep(dto.getCep());
        clienteMolde.setDataCadastro(dto.getDataCadastro());
        clienteMolde.setObservacao(dto.getObservacao());

        return clienteMolde;
    }
    public ClienteDto map(ClienteMolde clienteMolde){
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setId(clienteMolde.getId());
        clienteDto.setNome(clienteMolde.getNome());
        clienteDto.setCpf(clienteMolde.getCpf());
        clienteDto.setDataNascimento(clienteMolde.getDataNascimento());
        clienteDto.setNumeroTelefone(clienteMolde.getNumeroTelefone());
        clienteDto.setEmail(clienteMolde.getEmail());
        clienteDto.setEndereco(clienteMolde.getEndereco());
        clienteDto.setCidade(clienteMolde.getCidade());
        clienteDto.setEstado(clienteMolde.getEstado());
        clienteDto.setCep(clienteMolde.getCep());
        clienteDto.setDataCadastro(clienteMolde.getDataCadastro());
        clienteDto.setObservacao(clienteMolde.getObservacao());

        return clienteDto;
    }
}
