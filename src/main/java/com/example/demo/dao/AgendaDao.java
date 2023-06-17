package com.example.demo.dao;

import com.example.demo.model.Contacto;

import java.util.List;

public interface AgendaDao {
    void agregarContacto(Contacto contacto);

    Contacto recuperarContacto(String telefono);

    void eliminarContacto(String telefono);

    List<Contacto> devolverContactos();

    void eliminarContacto(int idContacto);

    Contacto recuperarContacto(int idContacto);

    void actualizarContacto(Contacto contacto);
}
