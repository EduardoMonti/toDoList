package br.com.practing.twtodos.repositories;

import br.com.practing.twtodos.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Todo, Long> {

}
