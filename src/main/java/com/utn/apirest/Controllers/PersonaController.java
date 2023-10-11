package com.utn.apirest.Controllers;

import com.utn.apirest.Entities.Persona;
import com.utn.apirest.Services.PersonaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
    @GetMapping(path = "/search")
    public ResponseEntity<?> searchQuery(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchQuery(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Se produjo el siguiente error."+e+"\"}");
        }
    }
    @GetMapping(path = "/searchPaged")
    public ResponseEntity<?> searchQuery(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchQuery(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Se produjo el siguiente error."+e+"\"}");
        }
    }
    @GetMapping(path = "/searchJPQL")
    public ResponseEntity<?> searchJPQL(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchJPQL(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Se produjo el siguiente error."+e+"\"}");
        }
    }
    @GetMapping(path = "/searchJPQLPaged")
    public ResponseEntity<?> searchJPQL(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchJPQL(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Se produjo el siguiente error."+e+"\"}");
        }
    }
    @GetMapping(path = "/searchNative")
    public ResponseEntity<?> searchNative(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNative(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Se produjo el siguiente error."+e+"\"}");
        }
    }
    @GetMapping(path = "/searchNative/Paged")
    public ResponseEntity<?> searchNative(@RequestParam String filtro, Pageable pageable){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNative(filtro, pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Se produjo el siguiente error."+e+"\"}");
        }
    }
}
