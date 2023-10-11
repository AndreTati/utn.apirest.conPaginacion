package com.utn.apirest.Services;

import com.utn.apirest.Entities.Persona;
import com.utn.apirest.Repositories.BaseRepository;
import com.utn.apirest.Repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    @Transactional
    @Override
    public List<Persona> searchQuery(String filtro)throws Exception{
        try{
            return personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    @Transactional
    @Override
    public Page<Persona> searchQuery(String filtro, Pageable pageable)throws Exception{
        try{
            return personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    @Transactional
    @Override
    public List<Persona> searchJPQL(String filtro)throws Exception{
        try{
            return personaRepository.searchJPQL(filtro);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    @Transactional
    @Override
    public Page<Persona> searchJPQL(String filtro, Pageable pageable)throws Exception{
        try{
            return personaRepository.searchJPQL(filtro, pageable);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    @Transactional
    @Override
    public List<Persona> searchNative(String filtro)throws Exception{
        try{
            return personaRepository.searchNative(filtro);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
    @Transactional
    @Override
    public Page<Persona> searchNative(String filtro, Pageable pageable)throws Exception{
        try{
            return personaRepository.searchNative(filtro, pageable);
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
