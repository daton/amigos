package org.localiza.amigos.amigos;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorHola {

    //Aqqui adentro van los metodos!! GET POST, ETC.
    //Antes uno muuuy facil para sea su hola mundo de ARQITECTURA CON SERVICIOS REST
    @GetMapping("/hola")
    public String holaMundo(){

        return "MI PRIMER SERVICIO REST DE JAVA PARA EL MUNDO!!";
    }

}
