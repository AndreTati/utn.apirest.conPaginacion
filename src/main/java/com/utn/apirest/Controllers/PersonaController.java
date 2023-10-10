package com.utn.apirest.Controllers;

import com.utn.apirest.Entities.Persona;
import com.utn.apirest.Services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
}
