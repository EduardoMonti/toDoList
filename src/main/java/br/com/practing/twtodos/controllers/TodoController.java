package br.com.practing.twtodos.controllers;

import br.com.practing.twtodos.repositories.TodoRepository;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HomeController {

    private TodoRepository todoRepository;

    public HomeController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public ModelAndView home(){
        var modelAndView = new ModelAndView("home");
        var movies = List.of("Star Wars: A new hope", "Star Wars: The empire strikes back", "Star Wars: Return of the Jedi");
        modelAndView.addObject("movies", movies);

        var todos = todoRepository.findAll();
        System.out.println(todos);

        return modelAndView;
    }

}
