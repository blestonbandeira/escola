package com.company;

public class Pessoa {

    private String nome;
    private String numeroIdentificacaoCivil;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String NUMERO_IDENTIFICACAO_CIVIL_POR_OMISSAO = "sem numero";

    public Pessoa(String nome, String numeroIdentificacaoCivil){
        this.nome = nome;
        this.numeroIdentificacaoCivil = numeroIdentificacaoCivil;
    }

    public Pessoa() {
        nome = NOME_POR_OMISSAO;
        numeroIdentificacaoCivil = NUMERO_IDENTIFICACAO_CIVIL_POR_OMISSAO;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroIdentificacaoCivil() {
        return numeroIdentificacaoCivil;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroIdentificacaoCivil(String numeroIdentificacaoCivil) {
        this.numeroIdentificacaoCivil = numeroIdentificacaoCivil;
    }

    public String toString() {
        return String.format("O(A) %s tem o número de identificação civil %s.", nome, numeroIdentificacaoCivil);
    }
}
