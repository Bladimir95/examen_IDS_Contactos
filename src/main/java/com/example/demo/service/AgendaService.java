package com.example.demo.service;

import com.example.demo.model.Contacto;

import java.util.List;

public interface AgendaService {
    boolean agregarContacto(Contacto contacto);
    List<Contacto> recuperarContactos();
    void actualizarContacto(Contacto contacto);
    boolean eliminarContacto(int idContacto);
    Contacto buscarContacto(int idContacto);
}
