/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.personas;
import com.tienda.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */
@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<personas> getAllPersona() {
        return (List<personas>)personaRepository.findAll();
    }

    @Override
    public personas getPersonaById(long id) {
        return personaRepository.findOne(id);
    }

    @Override
    public void savePersona(personas Personas) {
        personaRepository.save(Personas);
    }

    @Override
    public void delete(long id) {
        personaRepository.delete(id);
    }
    
}
