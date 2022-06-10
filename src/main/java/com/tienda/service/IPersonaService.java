/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.personas;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IPersonaService {
    public List<personas> getAllPersona();
    public personas getPersonaById (long id);
    public void savePersona(personas Personas);
    public void delete (long id);
    
}
