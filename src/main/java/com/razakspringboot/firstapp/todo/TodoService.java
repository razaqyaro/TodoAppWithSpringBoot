package com.razakspringboot.firstapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoService
{
    private static List<Todo> todos;

    static {
        todos.add(new Todo(1,
                "Abdul-Razak",
                "Learn AWS",
                LocalDate.now().plusYears(1),
                false

        ));
        todos.add(new Todo(1,
                "Mohammad Ali",
                "Learn Full Stack Development",
                LocalDate.now().plusYears(2),
                false

        ));
        todos.add(new Todo(1,
                "Agya Dan",
                "Html",
                LocalDate.now().plusYears(3),
                false

        ));
        todos.add(new Todo(1,
                "Christopher Owusu",
                "Agile Testing",
                LocalDate.now().plusYears(2),
                false

        ));
    }

    public List<Todo> findByUsername(String username)
    {
        return todos;
    }
}
