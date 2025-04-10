package com.example.y_tdl.controller;

import com.example.y_tdl.entity.ToDoList;
import com.example.y_tdl.service.TDLService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
// @CrossOrigin(origins = "http://localhost:4000")
public class TDLController {

    private final TDLService toDoListService;

    // 모든 할 일 목록 조회
    @GetMapping("")
    public List<ToDoList> getAllToDos() {
        return toDoListService.getAllToDos();
    }

    // 상태가 false인 할 일 목록 조회
    @GetMapping("/status/false")
    public List<ToDoList> getFalseStatusToDos() {
        return toDoListService.getFalseStatusToDos();
    }

    // 상태가 true인 할 일 목록 조회
    @GetMapping("/status/true")
    public List<ToDoList> getTrueStatusToDos() {
        return toDoListService.getTrueStatusToDos();
    }
}
