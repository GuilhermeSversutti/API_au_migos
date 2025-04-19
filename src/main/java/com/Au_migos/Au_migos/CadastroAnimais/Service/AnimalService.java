package com.Au_migos.Au_migos.CadastroAnimais.Service;

import com.Au_migos.Au_migos.CadastroAnimais.DTO.CadastroAnimaisDTO;

import java.util.List;

public interface AnimalService {

    List<CadastroAnimaisDTO> listarAnimais();

    CadastroAnimaisDTO listarAnimaisPorId(long id);

    CadastroAnimaisDTO criarAnimal(CadastroAnimaisDTO animaisDTO);

    CadastroAnimaisDTO alterarDadosAnimais (Long id, CadastroAnimaisDTO CadastroAnimaisDTO);

    void deletarAnimal(long id);
}
