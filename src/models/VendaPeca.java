package models;
public class VendaPeca extends Item
{
    private String nomePeca;

    public VendaPeca(double valor, int quantidade, String nomePeca)
    {
        super(valor, quantidade);
        this.nomePeca = nomePeca;
    }

    public String getNomePeca()
    {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca)
    {
        this.nomePeca = nomePeca;
    }

    @Override
    public String imprimirDetalhes()
    {
    	
    	String conteudo = ("Venda de peça: " + nomePeca + "\n");
    	conteudo += ("Valor: " + this.getValor()+ "\n");
    	conteudo += ("Quantidade: " + this.getQuantidade()+ "\n");
    	
    	return conteudo;
    }
}