package com.Au_migos.Au_migos.TabelaCliente.Molde;

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
@Table(name = "TabelaCliente")
public class ClienteMolde {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(unique = true, name = "CPF")
    private String cpf;

    @Column(name = "DATA_NASCIMENTO")
    private String dataNascimento;

    @Column(name = "TELEFONE")
    private String numeroTelefone;

    @Column(unique = true, name = "EMAIL")
    private String email;

    @Column(name = "ENDEREÇO")
    private String endereco;

    @Column(name = "CIDADE")
    private String cidade;

    @Column(name = "ESTADO")
    private String estado;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "DATA_CADASTRO")
    private String dataCadastro;

    @Column(name = "OBSERVACAO")
    private String observacao;
}
