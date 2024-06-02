package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Enum.EstadoDelPedido;
import com.example.demo.Pedidos.Pedido;
import com.example.demo.ServicioPedidos.ServicioPedidos;

@RestController
public class Controlador {
	@Autowired
	private ServicioPedidos servicioPedidos;
	
	@GetMapping("/GestionPedidos")
	public String welcome() {
		return "Bienvenido Usari@, aqui podras crear tus pedidos ";
	}
	
	@PostMapping("/crearPedido")
	public boolean crearPedido(@RequestBody Pedido nuevoPedido) {
		return servicioPedidos.crearPedido(nuevoPedido);
	}

	@GetMapping("/Buscarpedido")
	public Pedido buscarpedidoid(@RequestParam("id") Long id) {
		return servicioPedidos.Buscarpedido(id);
	}
	
	@PutMapping("/procesarPedido")
	public void procesarPedido(@RequestParam("id") Long id, @RequestBody EstadoDelPedido estado) {
		servicioPedidos.procesarPedido(id, estado);
	}

	@PostMapping("/borrarPedido")
	public void borrarPedido(@RequestParam("id") Long id) {
		servicioPedidos.borrarPedido(id);
	}

	@GetMapping("/Verlista")
	public List<Pedido> listaver() {
		return servicioPedidos.Verlista();
	}
}
