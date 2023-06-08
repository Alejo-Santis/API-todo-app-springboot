package com.alejosatdev.app.rest.Repository;

import com.alejosatdev.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
