package com.company;

public class AlunoBolseiro extends Aluno implements Calculavel {

    private double bolsa;

    private static final double BOLSA_POR_OMISSAO = 100.0;

    public AlunoBolseiro(String nome, String numeroIdentificacaoCivil, String numeroMecanografico, double bolsa) {
        super(nome, numeroIdentificacaoCivil, numeroMecanografico);
        this.bolsa = bolsa;
    }

    public AlunoBolseiro() {
        super();
        this.bolsa = BOLSA_POR_OMISSAO;
    }

    @Override
    public double calcValorMensal() {
        return bolsa;
    }

    public String toString() {
        return String.format(super.toString() + " Recebe de bolsa mensal %d euros.", bolsa);
    }
}
