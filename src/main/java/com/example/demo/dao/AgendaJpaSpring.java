package com.example.demo.dao;

import com.example.demo.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface AgendaJpaSpring extends JpaRepository<Contacto, Integer> {
    Contacto findByTelefono(String telefono);
    @Transactional
    @Modifying
    @Query("Delete from Contacto c Where c.telefono=?1")
    void eliminarPorTelefono(String telefono);
}
