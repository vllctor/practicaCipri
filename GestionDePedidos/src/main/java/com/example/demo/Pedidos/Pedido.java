package com.example.demo.Pedidos;

import java.time.LocalDate;

import com.example.demo.Enum.EstadoDelPedido;
import com.example.demo.Usuarios.Usuario;

/**
 * Representa un pedido en el sistema.
 * Contiene información sobre el pedido, su precio, estado, fecha y usuario asociado.
 */
public class Pedido {

    private int pedido;
    private double precio;
    private EstadoDelPedido estado;
    private LocalDate fecha;
    private Usuario user;

    /**
     * Crea una nueva instancia de Pedido.
     *
     * @param pedido El identificador del pedido.
     * @param precio El precio del pedido.
     * @param estado El estado del pedido.
     * @param fecha  La fecha del pedido.
     * @param user   El usuario asociado al pedido.
     */
    public Pedido(int pedido, double precio, EstadoDelPedido estado, LocalDate fecha, Usuario user) {
        super();
        this.pedido = pedido;
        this.precio = precio;
        this.estado = estado;
        this.fecha = LocalDate.now();
        this.user = user;
    }

    /**
     * Obtiene el identificador del pedido.
     *
     * @return El identificador del pedido.
     */
    public int getPedido() {
        return pedido;
    }

    /**
     * Establece el identificador del pedido.
     *
     * @param pedido El identificador del pedido.
     */
    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    /**
     * Obtiene el precio del pedido.
     *
     * @return El precio del pedido.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del pedido.
     *
     * @param precio El precio del pedido.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el estado del pedido.
     *
     * @return El estado del pedido.
     */
    public EstadoDelPedido getEstado() {
        return estado;
    }

    /**
     * Establece el estado del pedido.
     *
     * @param estado El estado del pedido.
     */
    public void setEstado(EstadoDelPedido estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la fecha del pedido.
     *
     * @return La fecha del pedido.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del pedido.
     *
     * @param fecha La fecha del pedido.
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el usuario asociado al pedido.
     *
     * @return El usuario asociado al pedido.
     */
    public Usuario getUser() {
        return user;
    }

    /**
     * Establece el usuario asociado al pedido.
     *
     * @param user El usuario asociado al pedido.
     */
    public void setUser(Usuario user) {
        this.user = user;
    }

    /**
     * Devuelve una representación en forma de cadena del pedido.
     *
     * @return Una cadena que representa el pedido.
     */
    @Override
    public String toString() {
        return "Pedido [pedido=" + pedido + ", precio=" + precio + ", estado=" + estado + ", fecha=" + fecha + ", user="
                + user + "]";
    }

}
