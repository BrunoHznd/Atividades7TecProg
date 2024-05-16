package fatecpg.br.Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int numeroIdentificacao;
    private List<String> itensPedidos;
    private String status;

    public Pedido(int numeroIdentificacao, List<String> itensPedidos) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.itensPedidos = itensPedidos;
        this.status = "Em andamento"; 
    }

    public void marcarComoEntregue() {
        this.status = "Entregue";
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public List<String> getItensPedidos() {
        return itensPedidos;
    }

    public String getStatus() {
        return status;
    }

}
