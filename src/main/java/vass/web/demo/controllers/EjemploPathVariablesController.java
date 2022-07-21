package vass.web.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploPathVariablesController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute(
                "atributo",
                "Enviar parámetros de la ruta pathvariable"
        );
        return "variables/index";
    }

    @GetMapping("/string/{texto}")
    public String variables(@PathVariable String texto, Model model){
        model.addAttribute(
                "atributo",
                "Recibir parámetros de la ruta pathvariable"
                );
        model.addAttribute(
                "resultado",
                "El texto enviado en la ruta es: " + texto
        );
        return "variables/ver";
    }

    @GetMapping("/string/{texto}/{num}")
    public String variablesconnumero(@PathVariable String texto,@PathVariable Integer num, Model model){
        model.addAttribute(
                "atributo",
                "Recibir parámetros de la ruta"
        );
        model.addAttribute(
                "resultado",
                "El texto enviado en la ruta es: " + texto +
                        "y el numero: " + num
        );
        return "variables/ver";
    }
}
