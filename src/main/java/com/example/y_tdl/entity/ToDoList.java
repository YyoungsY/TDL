package com.example.y_tdl.entity;

import jakarta.persistence.*;

@Entity (name = "todolist;")
@Table(name = "todolist")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num", nullable = false)
    private int no;

    @Column(name = "todolist", nullable = false, length = 10)
    private String toDoList;

    @Column(name = "status", nullable = false)
    private boolean status;
}