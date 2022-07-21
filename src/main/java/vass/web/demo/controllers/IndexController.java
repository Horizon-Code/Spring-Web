package vass.web.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vass.web.demo.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {
    @Value("${texto.indexcontroller.index.title}")
    private String textoIndex;
//    @Value("${texto.indexcontroller.perfil.titulo}")
//    private String textoPerfil;
    @Value("${texto.indexcontroller.listar.titulo}")
    private String textoListar;


//    //model interface add attributes to the model
//    @GetMapping({"/index","/","/home"})
//    public String index(Model model){
//        model.addAttribute("title","hello spring");
//        return "index";
//    }

    @GetMapping({"/index", "/", "/home"})
    public String index(Model model) {
        model.addAttribute("title", textoIndex);
        return "index";
    }

    //    @GetMapping({"/perfil","/otroperfil"})
//    public String perfil(Model model){
//        Usuario usuario = new Usuario();
//        usuario.setNombre("Andrés");
//        usuario.setApellido("Sánchez");
//        usuario.setEmail("ruben@gmail.com");
//        model.addAttribute("usuario",usuario.getNombre());
//        model.addAttribute("email",usuario.getEmail());
//        return "perfil";
//    }
    @GetMapping({"/perfil", "/otroperfil"})
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andrés");
        usuario.setApellido("Sánchez");
        usuario.setEmail("ruben@gmail.com");
        model.addAttribute("usuario", usuario.getNombre());
        model.addAttribute("email", usuario.getEmail());
        return "perfil";
    }

    @GetMapping({"/listar", "/listarusuarios"})
    public String listar(Model model) {
//        List<Usuario> usuariosLista = new ArrayList<>();
//        usuariosLista.add(new Usuario("Andres","Sánchez","ruben@gmail.com"));
//        usuariosLista.add(new Usuario("Andres","Sánchez","ruben@gmail.com"));
//        usuariosLista.add(new Usuario("Andres","Sánchez","ruben@gmail.com"));
        model.addAttribute("titulo", textoListar);
        // model.addAttribute("usuariosLista",usuariosLista);
        return "listar";
    }

    //ModelAttribute es comun a todos los métodos
    @ModelAttribute("usuariosLista")
    public List<Usuario> popularUsuarios() {
        List<Usuario> usuariosLista = new ArrayList<>();
        usuariosLista.add(new Usuario("Andres", "Sánchez", "ruben@gmail.com"));
        usuariosLista.add(new Usuario("Andres", "Sánchez", "ruben@gmail.com"));
        usuariosLista.add(new Usuario("Andres", "Sánchez", "ruben@gmail.com"));
        return usuariosLista;
    }
}
