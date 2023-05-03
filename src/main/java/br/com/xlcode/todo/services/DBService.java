package br.com.xlcode.todo.services;

import br.com.xlcode.todo.domain.Todo;
import br.com.xlcode.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void instanciaBaseDeDados() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Todo t1 = new Todo(null, "Estudar", "Estudar SpringBoot 2 e angular 11", LocalDateTime.parse("02/05/2023 19:10", formatter), false);
        Todo t2 = new Todo(null, "Ler", "Ler SpringBoot 2 e angular 11", LocalDateTime.parse("01/05/2023 10:10", formatter), true);
        Todo t3 = new Todo(null, "Exercicios", "Exercicios SpringBoot", LocalDateTime.parse("01/05/2023 09:10", formatter), false);
        Todo t4 = new Todo(null, "Meditar", "Meditar angular 11", LocalDateTime.parse("22/05/2023 18:25", formatter), true);

        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
    }
}
