package org.localiza.amigos.amigos;




import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class ControladorUsuario {

    @Autowired RepoUsuario repoUsuario;

 //Este meotod regresa todos los usuarios guardados en la BD
 @GetMapping("/usuario")
    public  List<Usuario> obtenerTodos(){

     return repoUsuario.findAll();
 }



 //Este busca por id
 @GetMapping("/usuario/{id}")
    public Usuario buscarPorId(@PathVariable String id){

     return  repoUsuario.findById(id).get();
 }
    @GetMapping("/usuario-borrar/{id}")
    public Estatus borrarPorId(@PathVariable String id){

          repoUsuario.deleteById(id);
          Estatus e=new Estatus();
          e.setMensaje("Borrado");
          e.setSuccess(true);
          return e;
    }
 //El siguiente metodo sirve para guardar y registar 
    @PostMapping("/usuario")
    public Estatus guardar(@RequestBody String json)throws  Exception{
        ObjectMapper mapper=new ObjectMapper();
        Usuario u=mapper.readValue(json, Usuario.class);
        //Ahora si lo guardamos
        repoUsuario.save(u);
        Estatus estatus=new Estatus();
        System.out.println("llego "+u );
 estatus.setSuccess(true);
 estatus.setMensaje("Usuario guardado con exito!");
        return  estatus;

    }


}
