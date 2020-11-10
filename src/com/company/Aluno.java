package com.company;

public abstract class Aluno extends Pessoa{

    private String numeroMecanografico;

    private static final String NUMERO_MECANOGRAFICO_POR_OMISSAO = "sem numero";

    public Aluno(String nome, String numeroIdentificacaoCivil, String numeroMecanografico){
        super(nome, numeroIdentificacaoCivil);
        this.numeroMecanografico = numeroMecanografico;
    }

    public Aluno(){
        super();
        this.numeroMecanografico = NUMERO_MECANOGRAFICO_POR_OMISSAO;
    }

    public String getNumeroMecanografico() {
        return numeroMecanografico;
    }

    public String toString() {
        return String.format(super.toString() + " Tem o número mecanográfico %s.", numeroMecanografico);
    }
}
