package com.utn.apirest.Repositories;

import com.utn.apirest.Entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
