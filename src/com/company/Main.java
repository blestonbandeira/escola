package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        a) Construa objetos de cada uma das classes instanciáveis e
        guarde-os num contentor do tipo array;
         */

        Pessoa[] pessoas = new Pessoa[10];

        Professor p1 = new Professor("ze", "111eee", Categorias.ADJUNTO);
        AlunoNaoBolseiro anb1 = new AlunoNaoBolseiro("joana", "222aaa", "abc");
        AlunoBolseiro ab1 = new AlunoBolseiro("tiago", "333ccc", "def", 250);

        pessoas[0] = p1;
        pessoas[1] = anb1;
        pessoas[2] = ab1;

        /*
        b) Liste o nome e categoria dos professores armazenado no contentor;
         */

        for (Pessoa obj : pessoas) {
            if (obj != null && obj instanceof Professor)
                System.out.println(String.format("O professor %s " +
                        "tem a categoria %s.", obj.getNome(), ((Professor) obj).getCategoria()));
        }

        /*
        c) Liste o número mecanográfico de todos os alunos que não são bolseiros;
         */

        for (Pessoa obj : pessoas) {
            if (obj != null && obj instanceof AlunoNaoBolseiro) {
                System.out.println(String.format("O aluno não bolseiro %s tem o número mecanográfico %s.",
                        obj.getNome(), ((Aluno) obj).getNumeroMecanografico()));
            }
        }

        /*
        d) Liste os nomes dos professores e alunos,
        armazenados no contentor. A listagem deve incluir,
        para cada objeto, a designação da classe;
         */

        for (Pessoa obj : pessoas) {
            if (obj != null) {
                System.out.println(String.format("A pessoa com o nome %s, pertence à classe %s.", obj.getNome(),
                        obj.getClass().getSimpleName()));
            }
        }

        /*
        e) Liste os nomes e valores dos salários dos professores armazenados no contentor;
         */

        for (Pessoa obj : pessoas) {
            if (obj != null && obj instanceof Professor) {
                System.out.println(String.format("O professor %s tem como salário o valor %.1f.",
                        obj.getNome(), ((Professor) obj).calcValorMensal()));
            }
        }

        /*
        f) Liste os nomes e valores das bolsas dos alunos bolseiros armazenados no contentor;
         */
        for (Pessoa obj : pessoas) {
            if (obj != null && obj instanceof AlunoBolseiro) {
                System.out.println(String.format("O aluno bolseiro %s recebe de bolsa o valor %.1f.",
                        obj.getNome(), ((AlunoBolseiro) obj).calcValorMensal()));
            }
        }

        /*
        g) Mostre os valores totais dos encargos com: professores e
        alunos bolseiros. O total dos encargos da escola deve também ser apresentado.
         */

        double soma = 0;
        for (Pessoa obj : pessoas) {
            if (obj != null && obj instanceof Professor || obj instanceof AlunoBolseiro) {
                soma += ((Calculavel) obj).calcValorMensal();
            }
        }

        System.out.println(String.format("O encargo total de encargos com alunos bolseiros e " +
                "professores é de %.2f.", soma));

    }
}
