package com.example.demo.Usuarios;

public class Usuario {
	private Long id;
	private String nombre;
	private String apellido;
	private Long Telefono;
	private String direccion;

	public Usuario(Long id, String nombre, String apellido, Long telefono, String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		Telefono = telefono;
		this.direccion = direccion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getTelefono() {
		return Telefono;
	}

	public void setTelefono(Long telefono) {
		Telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", Telefono=" + Telefono
				+ ", direccion=" + direccion + "]";
	}
}
