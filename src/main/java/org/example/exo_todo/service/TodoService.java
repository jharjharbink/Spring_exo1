package org.example.exo_todo.service;

import org.example.exo_todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    List<Todo> todos;

    public TodoService() {

        todos = new ArrayList<Todo>();
        todos.add(new Todo("gerard", "Acheter du pain", true));
        todos.add(new Todo("lapin", "Acheter du lapin", true));
        todos.add(new Todo("bourguignon", "Sus au Bourguignon !", false));
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public Todo getTodo() {
        return todos.get(0);
    }


}
