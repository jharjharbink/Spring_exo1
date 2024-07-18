package org.example.exo_todo.controler;

import org.example.exo_todo.model.Todo;
import org.example.exo_todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoControler {

    private final TodoService todoService;

    public TodoControler(TodoService todoService) {  this.todoService = todoService;   }

    @RequestMapping("/todo/json")
    @ResponseBody
    public List<Todo> getTodosJson() {  return todoService.getTodos();  }

    @RequestMapping("todo/{name}/json")
    @ResponseBody
    public Todo getTodoJson(@RequestParam String name) {    return todoService.getTodo(name);   }

    @RequestMapping("/todo")
    public String getTodos(Model model) {
        model.addAttribute("todos", todoService.getTodos());
        return "todos";
    }

    @RequestMapping("todo/{name}")
    public String getTodo(@RequestParam String name, Model model) {
        model.addAttribute("todo", todoService.getTodo(name));
        return "todo";
    }
}

