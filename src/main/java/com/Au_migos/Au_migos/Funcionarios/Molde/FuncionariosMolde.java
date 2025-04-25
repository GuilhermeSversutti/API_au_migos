package com.Au_migos.Au_migos.CadastroUsuario.Molde;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_FUNCIONARIOS")
@Getter
@Setter
public class FuncionariosMolde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "CPF", unique = true)
    private String cpf;

    @Column(name = "DATA_NASCIMENTO", unique = true)
    private String dataNascimento;

    @Column(name = "TELEFONE")
    private String numeroTelefone;

    @Column(name = "EMAIL", unique = true)
    private String email;

    @Column(name = "ENDERECO")
    private String endereco;

    @Column(name = "CARGO")
    private String cargo;

    @Column(name = "DATAADM")
    private String dataAdm;

    @Column(name = "SALARIO")
    private double salario;

    @Column(name = "DATADM")
    private String dataDm;

    @Column(name = "OBSERVACAO")
    private String obs;

}
