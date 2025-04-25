package com.Au_migos.Au_migos.TabelaCliente.Service;

import com.Au_migos.Au_migos.TabelaCliente.DTO.ClienteDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ServiceCliente {

    List<ClienteDto> listarCliente();

    ResponseEntity<?> listarCLienteId(Long id);

    ClienteDto criarCliente(ClienteDto clienteDto);

    ResponseEntity<?> alterarDadosCliente(Long id, ClienteDto dto);

    ResponseEntity<?> deletarCliente(Long id);
}
