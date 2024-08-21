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

    }

}
