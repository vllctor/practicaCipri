package com.example.demo.Usuarios;

/**
 * Representa un usuario en el sistema.
 * Contiene información sobre el ID, nombre, apellido, teléfono y dirección del usuario.
 */
public class Usuario {
    private Long id;
    private String nombre;
    private String apellido;
    private Long telefono;
    private String direccion;

    /**
     * Crea una nueva instancia de Usuario.
     *
     * @param id        El identificador del usuario.
     * @param nombre    El nombre del usuario.
     * @param apellido  El apellido del usuario.
     * @param telefono  El número de teléfono del usuario.
     * @param direccion La dirección del usuario.
     */
    public Usuario(Long id, String nombre, String apellido, Long telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene el identificador del usuario.
     *
     * @return El identificador del usuario.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador del usuario.
     *
     * @param id El identificador del usuario.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre El nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     *
     * @return El apellido del usuario.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del usuario.
     *
     * @param apellido El apellido del usuario.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el número de teléfono del usuario.
     *
     * @return El número de teléfono del usuario.
     */
    public Long getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del usuario.
     *
     * @param telefono El número de teléfono del usuario.
     */
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección del usuario.
     *
     * @return La dirección del usuario.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del usuario.
     *
     * @param direccion La dirección del usuario.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve una representación en forma de cadena del usuario.
     *
     * @return Una cadena que representa al usuario.
     */
    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
                + ", direccion=" + direccion + "]";
    }
}
