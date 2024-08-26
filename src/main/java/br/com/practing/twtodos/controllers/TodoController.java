package br.com.practing.twtodos.controllers;

import br.com.practing.twtodos.repositories.TodoRepository;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class TodoController {

    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public ModelAndView list(){
       var modelAndView = new ModelAndView("todo/list");
       modelAndView.addObject("todos", todoRepository.findAll());
       return modelAndView;
    }

}
