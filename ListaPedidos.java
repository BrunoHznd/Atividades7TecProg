package fatecpg.br.Model;

import java.util.ArrayList;
import java.util.List;

public class ListaPedidos {

	   private List<Pedido> pedidos;

	    public ListaPedidos() {
	        this.pedidos = new ArrayList<>();
	    }

	    public void adicionarPedido(Pedido pedido) {
	        pedidos.add(pedido);
	    }

	    public void removerPedido(Pedido pedido) {
	        pedidos.remove(pedido);
	    }

	    public void exibirPedidosEmAndamento() {
	        System.out.println("Pedidos em Andamento:");
	        for (Pedido pedido : pedidos) {
	            if (pedido.getStatus().equals("Em andamento")) {
	                System.out.println("Número de Identificação: " + pedido.getNumeroIdentificacao());
	                System.out.println("Itens Pedidos: " + pedido.getItensPedidos());
	                System.out.println("Status: " + pedido.getStatus());
	                System.out.println("-------------------------");
	            }
	        }
	    }

	    public void marcarPedidoComoEntregue(int numeroIdentificacao) {
	        for (Pedido pedido : pedidos) {
	            if (pedido.getNumeroIdentificacao() == numeroIdentificacao) {
	                pedido.marcarComoEntregue();
	                return;
	            }
	        }
	        System.out.println("Pedido não encontrado.");
	    }
}
