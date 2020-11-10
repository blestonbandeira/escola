package com.company;

public class AlunoNaoBolseiro extends Aluno{


    public AlunoNaoBolseiro(String nome, String numeroIdentificacaoCivil, String numeroMecanografico) {
        super(nome, numeroIdentificacaoCivil, numeroMecanografico);
    }

    public AlunoNaoBolseiro() {
        super();
    }

    public String toString() {
        return String.format(super.toString() + " Não recebe bolsa.");
    }
}
