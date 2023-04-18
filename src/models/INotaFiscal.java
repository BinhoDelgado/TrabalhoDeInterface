package models;
public interface INotaFiscal
{
    void adicionarItem(Item item);
    double aplicarDesconto(double porcentagemDesconto);
    String gerarNota();
}