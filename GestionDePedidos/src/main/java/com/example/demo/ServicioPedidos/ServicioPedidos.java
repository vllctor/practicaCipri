package com.example.demo.ServicioPedidos;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Enum.EstadoDelPedido;
import com.example.demo.Pedidos.Pedido;

import org.springframework.stereotype.Service;

/**
 * Servicio para gestionar los pedidos.
 * Proporciona métodos para crear, buscar, procesar, borrar y listar pedidos.
 */
@Service
public class ServicioPedidos {

    private List<Pedido> pedidos = new ArrayList<>();

    /**
     * Obtiene una lista de todos los pedidos.
     *
     * @return Una lista de todos los pedidos.
     */
    public List<Pedido> getUser() {
        return new ArrayList<Pedido>(pedidos);
    }

    /**
     * Crea un nuevo pedido y lo añade a la lista de pedidos.
     *
     * @param nuevoPedido El nuevo pedido a añadir.
     * @return true si el pedido se añadió con éxito, false en caso contrario.
     */
    public boolean crearPedido(Pedido nuevoPedido) {
        return pedidos.add(nuevoPedido);
    }

    /**
     * Busca un pedido por su identificador.
     *
     * @param id El identificador del pedido.
     * @return El pedido si se encuentra, null en caso contrario.
     */
    public Pedido Buscarpedido(Long id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getPedido() == id) {
                return pedido;
            }
        }
        return null;
    }
    
    /**
     * Procesa un pedido cambiando su estado.
     *
     * @param id     El identificador del pedido.
     * @param estado El nuevo estado del pedido.
     */
    public void procesarPedido(Long id, EstadoDelPedido estado) {
        Pedido pedido = Buscarpedido(id);
        if (pedido != null) {
            pedido.setEstado(estado);
        } else {
            System.out.println("Pedido no encontrado");
        }
    }

    /**
     * Borra un pedido si no está procesado.
     *
     * @param id El identificador del pedido.
     */
    public void borrarPedido(Long id) {
        Pedido pedido = Buscarpedido(id);
        if (pedido != null && pedido.getEstado() != EstadoDelPedido.PROCESADO) {
            pedidos.remove(pedido);
        } else {
            System.out.println("No se puede borrar el pedido");
        }
    }
    
    /**
     * Devuelve la lista completa de pedidos.
     *
     * @return La lista de todos los pedidos.
     */
    public List<Pedido> Verlista() {
        return pedidos;
    }
}

