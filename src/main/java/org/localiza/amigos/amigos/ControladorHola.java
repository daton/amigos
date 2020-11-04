package org.localiza.amigos.amigos;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api")
public class ControladorHola {
@Autowired RepoHola repoHola;

//El metodo get se usa para obtener TODOS los registros guardados en la entidad en cuestion
    @GetMapping("/hola")
    public List<Hola> holaMundo(){

        return repoHola.findAll();
    }
 //El metodo get siguiente se ocupa para buscar un solo registro por su ID
 @GetMapping("/hola/{id}")
    public Hola buscarPorId (@PathVariable String id){
        Hola h=new Hola();
        if(repoHola.findById(id).isPresent()){
            h=repoHola.findById(id).get();
        }

        return  h;
 }

}
