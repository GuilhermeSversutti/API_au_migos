package com.Au_migos.Au_migos.Animais.Molde;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cadastro_Animais")
public class ModelCadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "NOME_ANIMAL")
    private String nameAnimal;

    @Column(name = "TIPO_ANIMAL")
    private String tipoDeAnimal;

    @Column(name = "RACA")
    private String racaDoAnimal;

    @Column(name = "IDADE")
    private int idadeAnimal;

    @Column(name = "SEXO")
    private char sexoAnimal;

    @Column(name = "PESO")
    private int pesoAnimal;

    @Column(name = "COR")
    private String corAnimal;

    @Column(name = "DATA_ADOACAO")
    private String dataDeAdoacao;

    @Column(name = "VACINA")
    private boolean vacina;

    @Column(name = "CASTRADO")
    private boolean castrado;

    @Column(name = "NOTA_ADD")
    private String notaAnimal;
}
