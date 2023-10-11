package com.utn.apirest.Services;

import com.utn.apirest.Entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {
    public List<Persona> searchQuery(String filtro)throws Exception;
    public Page<Persona> searchQuery(String filtro, Pageable pageable)throws Exception;
    public List<Persona> searchJPQL(String filtro)throws Exception;
    public Page<Persona> searchJPQL(String filtro, Pageable pageable)throws Exception;
    public List<Persona> searchNative(String filtro)throws Exception;
    public Page<Persona> searchNative(String filtro, Pageable pageable)throws Exception;

}
