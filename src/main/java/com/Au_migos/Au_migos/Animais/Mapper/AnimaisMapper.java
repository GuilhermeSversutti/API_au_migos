    package com.Au_migos.Au_migos.CadastroAnimais.Mapper;

    import com.Au_migos.Au_migos.CadastroAnimais.DTO.CadastroAnimaisDTO;
    import com.Au_migos.Au_migos.CadastroAnimais.Molde.ModelCadastro;
    import org.springframework.stereotype.Component;

    @Component
    public class AnimaisMapper {

        public ModelCadastro map(CadastroAnimaisDTO dto){
            ModelCadastro modelCadastro = new ModelCadastro();
            modelCadastro.setId(dto.getId());
            modelCadastro.setNameAnimal(dto.getNameAnimal());
            modelCadastro.setTipoDeAnimal(dto.getTipoDeAnimal());
            modelCadastro.setRacaDoAnimal(dto.getRacaDoAnimal());
            modelCadastro.setIdadeAnimal(dto.getIdadeAnimal());
            modelCadastro.setSexoAnimal(dto.getSexoAnimal());
            modelCadastro.setPesoAnimal(dto.getPesoAnimal());
            modelCadastro.setCorAnimal(dto.getCorAnimal());
            modelCadastro.setDataDeAdoacao(dto.getDataDeAdoacao());
            modelCadastro.setVacina(dto.isVacina());
            modelCadastro.setCastrado(dto.isCastrado());
            modelCadastro.setNotaAnimal(dto.getNotaAnimal());

            return modelCadastro;
        }
        public CadastroAnimaisDTO map(ModelCadastro model){
            CadastroAnimaisDTO animaisDTO = new CadastroAnimaisDTO();
            animaisDTO.setId(model.getId());
            animaisDTO.setNameAnimal(model.getNameAnimal());
            animaisDTO.setTipoDeAnimal(model.getTipoDeAnimal());
            animaisDTO.setRacaDoAnimal(model.getRacaDoAnimal());
            animaisDTO.setIdadeAnimal(model.getIdadeAnimal());
            animaisDTO.setSexoAnimal(model.getSexoAnimal());
            animaisDTO.setPesoAnimal(model.getPesoAnimal());
            animaisDTO.setCorAnimal(model.getCorAnimal());
            animaisDTO.setDataDeAdoacao(model.getDataDeAdoacao());
            animaisDTO.setVacina(model.isVacina());
            animaisDTO.setCastrado(model.isCastrado());
            animaisDTO.setNotaAnimal(model.getNotaAnimal());

            return animaisDTO;
        }
    }
