package com.Au_migos.Au_migos.TabelaCliente.Repository;

import com.Au_migos.Au_migos.TabelaCliente.Molde.ClienteMolde;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepositoryCliente extends JpaRepository<ClienteMolde, Long> {

    Optional<ClienteMolde> findByEmail(String email);

    Optional<ClienteMolde> findByCpf(String cpf);

}
