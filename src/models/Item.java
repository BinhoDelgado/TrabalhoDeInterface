package models;
public abstract class Item
{
    private double valor;
    private int quantidade;

    public Item(double valor, int quantidade)
    {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }

    public abstract String imprimirDetalhes();
}