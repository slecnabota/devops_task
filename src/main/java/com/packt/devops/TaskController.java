package com.packt.devops;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final List<String> tasks = new ArrayList<>(List.of("Learn DevOps", "Build Pipeline"));

    @GetMapping
    public List<String> getTasks() {
        return tasks;
    }

    @PostMapping
    public String addTask(@RequestBody String task) {
        tasks.add(task);
        return "Task added!";
    }
}