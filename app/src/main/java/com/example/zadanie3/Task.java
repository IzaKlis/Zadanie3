package com.example.zadanie3;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done;
    public Task(){
        id=UUID.randomUUID();
        date=new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String toString) {
    }

    public Date getDate() {
        return date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean isChecked) {
    }
}
