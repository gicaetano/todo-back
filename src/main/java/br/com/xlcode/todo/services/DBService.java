package br.com.xlcode.todo.services;

import br.com.xlcode.todo.domain.Todo;
import br.com.xlcode.todo.repositories.TodoRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    @SneakyThrows
    public void instanciaBaseDeDados() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Todo t1 = new Todo(null, "Estudar", "Estudar SpringBoot 2 e angular 11", sdf.parse("02/05/2023"), false);
        Todo t2 = new Todo(null, "Ler", "Ler SpringBoot 2 e angular 11", sdf.parse("01/05/2023"), true);
        Todo t3 = new Todo(null, "Exercicios", "Exercicios SpringBoot", sdf.parse("01/05/2023"), false);
        Todo t4 = new Todo(null, "Meditar", "Meditar angular 11", sdf.parse("22/05/2023"), true);

        todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
    }
}
