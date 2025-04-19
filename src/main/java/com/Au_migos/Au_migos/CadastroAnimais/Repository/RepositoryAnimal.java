package com.Au_migos.Au_migos.CadastroAnimais.Repository;


import com.Au_migos.Au_migos.CadastroAnimais.Model.ModelCadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAnimal extends JpaRepository<ModelCadastro, Long> {
}

