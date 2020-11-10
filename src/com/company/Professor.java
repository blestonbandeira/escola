package com.company;

public class Professor extends Pessoa implements Calculavel{

    private String categoria;

    private static double extraCategoriaAssistente = 0;
    private static double extraCategoriaAdjunto = 0.2;
    private static double extraCategoriaCoordenador = 0.5;

    private static final String CATEGORIA_POR_OMISSAO = "sem categoria";
    private static final double SALARIO_BASE = 1500;

    public Professor(String nome, String numeroIdentificacaoCivil, String categoria) {
        super(nome, numeroIdentificacaoCivil);
        this.categoria = categoria;
    }

    public Professor() {
        super();
        this.categoria = CATEGORIA_POR_OMISSAO;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double calcValorMensal() {
        return SALARIO_BASE * (1+((categoria.compareTo(Categorias.ASSISTENTE) == 0)
                    ? extraCategoriaAssistente
                    : ((categoria.compareTo(Categorias.ADJUNTO) == 0 )
                        ? extraCategoriaAdjunto
                        : extraCategoriaCoordenador)));
    }

    public String toString() {
        return String.format(super.toString() + " Pertence à categoria %s.", categoria);
    }
}
