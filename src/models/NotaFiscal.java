package models;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal implements INotaFiscal
{
    private List<Item> itens;
    private double total;
    private double desconto;

    public NotaFiscal()
    {
        itens = new ArrayList<Item>();
        total = 0;
        desconto = 0;
    }
    public void adicionarItem(Item item) 
   {
        itens.add(item);
        total += item.getValor() * item.getQuantidade();
    }

    public double aplicarDesconto(double porcentagemDesconto)
    {
    	return desconto = total * (porcentagemDesconto / 100);
		
    }
    
    public String gerarNota()
    {
        String conteudo = "----Nota Fiscal---- \n";
        for (Item item : itens) {
            conteudo += item.imprimirDetalhes();
        }
        conteudo += "------------------------------- \n";
        conteudo += ("Total: " + total + "\n");
        if (desconto > 0) {
            conteudo += ("Desconto: " + desconto + "\n");
        }
        conteudo += ("Valor do desconto: " + this.aplicarDesconto(10) + "\n");
        conteudo += "Valor Total com Desconto: " + (total - desconto);
        return conteudo;
	}
}
