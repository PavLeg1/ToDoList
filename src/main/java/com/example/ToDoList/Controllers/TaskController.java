package com.example.ToDoList.Controllers;

import com.example.ToDoList.Models.Task;
import com.example.ToDoList.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/")
    public void save(Task task){
        taskService.saveTask(task);
    }
}
