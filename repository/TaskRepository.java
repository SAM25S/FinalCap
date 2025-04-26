package com.example.TaskManagerFinal.repository;

import com.example.TaskManagerFinal.model.Task;
import com.example.TaskManagerFinal.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByDueDateBefore(LocalDateTime date);
    List<Task> findByTitleContainingIgnoreCase(String title);
}