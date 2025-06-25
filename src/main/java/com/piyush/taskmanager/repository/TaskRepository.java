package com.piyush.taskmanager.repository;

import com.piyush.taskmanager.entity.Task;
import com.piyush.taskmanager.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAssignedUserId(Long userId);
    List<Task> findByStatus(TaskStatus status);
}