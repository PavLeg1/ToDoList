package com.example.ToDoList.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;


@Entity
@Table(name="tasks")
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private Date dateTime;
    private boolean isDone;

    //USER
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    //CATEGORY
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
