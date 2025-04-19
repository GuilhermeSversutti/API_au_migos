package com.Au_migos.Au_migos.CadastroAnimais.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CadastroAnimaisDTO {

    private Long id;
    private String nameAnimal;
    private String tipoDeAnimal;
    private String racaDoAnimal;
    private int idadeAnimal;
    private char sexoAnimal;
    private int pesoAnimal;
    private String corAnimal;
    private String dataDeAdoacao;
    private boolean vacina;
    private boolean castrado;
    private String notaAnimal;

}