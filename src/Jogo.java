import java.util.Scanner;

public class Jogo {

    private String titulo;
    private int classificacaoEtaria;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void aplicarDesconto(int percentualDesconto) {
        double desconto = preco * (percentualDesconto / 100);
        preco -= desconto;
    }

    public void aumentarPreco(int percentualAumento) {
        double aumento = percentualAumento / 100;
        preco += aumento;
    }

    public void atualizarClassificacao(int novaClassificacao) {
        classificacaoEtaria = novaClassificacao;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("MENU\n\n" +
                "1. ADICIONAR NOVO JOGO\n" +
                "2. APLICAR DESCONTO NO JOGO\n" +
                "3. AUMENTAR PRECO DO JOGO\n" +
                "4. ATUALIZAR CLASSIFICACAO ETARIA DO JOGO\n" +
                "5. MOSTRAR DETALHES DOS JOGOS\n" +
                "6. SAIR");


        in.close();
    }

}
