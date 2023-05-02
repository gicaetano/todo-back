package br.com.xlcode.todo;

import br.com.xlcode.todo.domain.Todo;
import br.com.xlcode.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Todo t1 = new Todo(null, "Estudar", "Estudar SpringBoot 2 e angular 11", LocalDateTime.parse("02/05/2023 19:10", formatter), false);

		todoRepository.saveAll(Arrays.asList(t1));
	}
}
