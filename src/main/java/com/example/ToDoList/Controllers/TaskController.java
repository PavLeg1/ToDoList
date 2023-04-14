package com.example.ToDoList.Controllers;

import com.example.ToDoList.Models.Task;
import com.example.ToDoList.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/")
    public void save(Task task){
        taskService.saveTask(task);
    }

    @GetMapping("")
    public List<Task> getAll(){
        return taskService.getAllTask();
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Integer id) {
        taskService.deleteTaskById(id);
    }
}
