package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contactos")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContacto")
    private int id;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "telefono", nullable = false, length = 45)
    private String telefono;

    @Column(name = "edad", nullable = false)
    private int edad;

    public Contacto() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}