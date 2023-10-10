package com.utn.apirest.Services;

import com.utn.apirest.Entities.Persona;
import com.utn.apirest.Repositories.BaseRepository;
import com.utn.apirest.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
