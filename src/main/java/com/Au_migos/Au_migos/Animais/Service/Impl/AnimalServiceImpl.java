package com.Au_migos.Au_migos.CadastroAnimais.Service.Impl;

import com.Au_migos.Au_migos.CadastroAnimais.DTO.CadastroAnimaisDTO;
import com.Au_migos.Au_migos.CadastroAnimais.Mapper.AnimaisMapper;
import com.Au_migos.Au_migos.CadastroAnimais.Molde.ModelCadastro;
import com.Au_migos.Au_migos.CadastroAnimais.Repository.RepositoryAnimal;
import com.Au_migos.Au_migos.CadastroAnimais.Service.AnimalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimalServiceImpl implements AnimalService {

    private RepositoryAnimal repository;
    private AnimaisMapper mapper;

    public AnimalServiceImpl(RepositoryAnimal repository, AnimaisMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
    @Override
    public List<CadastroAnimaisDTO> listarAnimais(){
            List<ModelCadastro> cadastros = repository.findAll();
        return cadastros.stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }
    @Override
    public CadastroAnimaisDTO listarAnimaisPorId(long id){
        Optional<ModelCadastro> cadastroId = repository.findById(id);
        return cadastroId.map(mapper::map).orElse(null);
    }
    @Override
    public CadastroAnimaisDTO criarAnimal(CadastroAnimaisDTO animaisDTO){
        ModelCadastro cadastro = new AnimaisMapper().map(animaisDTO);
        cadastro = repository.save(cadastro);
        return mapper.map(cadastro);
    }
    @Override
    public CadastroAnimaisDTO alterarDadosAnimais (Long id, CadastroAnimaisDTO CadastroAnimaisDTO){
        Optional<ModelCadastro> animaisExistente = repository.findById(id);

        if (animaisExistente.isPresent()){
            ModelCadastro animalAlterado = mapper.map(CadastroAnimaisDTO);
            animalAlterado.setId(id);
            ModelCadastro animalSalvo = repository.save(animalAlterado);
            return mapper.map(animalSalvo);
        }
        return null;
    }
    @Override
    public void deletarAnimal(long id){
        repository.deleteById(id);
    }

}
