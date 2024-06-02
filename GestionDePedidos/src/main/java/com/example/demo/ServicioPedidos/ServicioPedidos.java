package com.example.demo.ServicioPedidos;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Enum.EstadoDelPedido;
import com.example.demo.Pedidos.Pedido;

import org.springframework.stereotype.Service;

@Service
public class ServicioPedidos {

	private List<Pedido> pedidos = new ArrayList<>();

	public List<Pedido> getUser() {
		return new ArrayList<Pedido>(pedidos);
	}

	public boolean crearPedido(Pedido nuevoPedido) {
		return pedidos.add(nuevoPedido);
	}

	public Pedido Buscarpedido(Long id) {
		for (Pedido pedido : pedidos) {
			if (pedido.getPedido() == id) {
				return pedido;
			}
		}
		return null;
	}
	
	public void procesarPedido(Long id, EstadoDelPedido estado) {
		Pedido pedido = Buscarpedido(id);
		if (pedido != null) {
			pedido.setEstado(estado);

		} else {
			System.out.println("Pedido no encontrado ");
		}
	}

	public void borrarPedido(Long id) {
		Pedido pedido = Buscarpedido(id);
		if (pedido != null && pedido.getEstado() != EstadoDelPedido.PROCESADO) {
			pedidos.remove(pedido);
		} else {
			System.out.println("No se puede borrar el pedido");
		}
	}
	
	public List<Pedido> Verlista() {
		return pedidos;
	}
}
