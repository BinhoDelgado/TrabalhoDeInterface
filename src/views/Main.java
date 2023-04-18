package views;

import models.ServicoPrestado;
import models.VendaPeca;
import models.NotaFiscal;

public class Main {
    public static void main(String[] args) {
        
    	NotaFiscal notaFiscal = new NotaFiscal();
        
        ServicoPrestado servico1 = new ServicoPrestado(50.0, 1, "Troca de óleo", 60);
        VendaPeca peca1 = new VendaPeca(100.0, 2, "Disco de Freio");
        VendaPeca peca2 = new VendaPeca(50.0, 4, "Pastilha de Freio");
        
        notaFiscal.adicionarItem(peca1);
        notaFiscal.adicionarItem(servico1);
        notaFiscal.adicionarItem(peca2);
        
        String imprimindoNota = notaFiscal.gerarNota();
        
        System.out.println(imprimindoNota);
    }
}
