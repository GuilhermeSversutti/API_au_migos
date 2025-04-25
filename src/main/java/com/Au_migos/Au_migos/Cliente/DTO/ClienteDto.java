package com.Au_migos.Au_migos.TabelaCliente.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDto {

    private Long id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String numeroTelefone;
    private String email;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String dataCadastro;
    private String observacao;
}
