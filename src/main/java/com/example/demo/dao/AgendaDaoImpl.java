package com.example.demo.dao;

import com.example.demo.model.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AgendaDaoImpl implements AgendaDao{
    @Autowired
    AgendaJpaSpring agenda;

    @Override
    public void agregarContacto(Contacto contacto) {
        agenda.save(contacto);
    }

    @Override
    public Contacto recuperarContacto(String telefono) {
        return agenda.findByTelefono(telefono);
    }

    @Override
    public void eliminarContacto(String telefono) {
        agenda.eliminarPorTelefono(telefono);
    }

    @Override
    public List<Contacto> devolverContactos() {
        return agenda.findAll();
    }

    @Override
    public void eliminarContacto(int idContacto) {
        agenda.deleteById(idContacto);
    }

    @Override
    public Contacto recuperarContacto(int idContacto) {
        return agenda.findById(idContacto).orElse(null);
    }

    @Override
    public void actualizarContacto(Contacto contacto) {
        agenda.save(contacto);
    }
}
