package models;
public class ServicoPrestado extends Item
{
    private String nome;
    private int tempoTotal;

    public ServicoPrestado(double valor, int quantidade, String nome, int tempoTotal)
    {
        super(valor, quantidade);
        this.nome = nome;
        this.tempoTotal = tempoTotal;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getTempoTotal()
    {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal)
    {
        this.tempoTotal = tempoTotal;
    }

    @Override
    public String imprimirDetalhes()
    {
        String conteudo = "Serviço prestado: " + nome + "\n";
        conteudo += ("Valor: " + this.getValor() +  "\n");
        conteudo += ("Quantidade: " + this.getQuantidade() + "\n");
        conteudo += ("Tempo total: " + tempoTotal + "\n");
        
        return conteudo;
    }
}