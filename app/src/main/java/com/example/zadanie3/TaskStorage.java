package com.example.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private static final TaskStorage taskStorage=new TaskStorage();
    private final List<Task> tasks;

    public static TaskStorage getInstance(){
        return taskStorage;
    }

    public TaskStorage() {
        tasks=new ArrayList<>();
        for(int i=0;i<150;i++){
            Task task=new Task();
            task.setName("Pilne zadanie nr: "+i);
            task.setDone(i%3==0);
            tasks.add(task);
        }
    }
}
