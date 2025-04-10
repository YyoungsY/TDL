package com.example.y_tdl.service;

import com.example.y_tdl.entity.ToDoList;
import com.example.y_tdl.repository.TDLRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class TDLService {

    private final TDLRepository toDoListRepository;

    // 모든 할 일 목록 조회
    public List<ToDoList> getAllToDos() {
        return toDoListRepository.findAll();
    }

    // 상태가 false인 할 일 목록 조회
    public List<ToDoList> getFalseStatusToDos() {
        return toDoListRepository.findByStatusFalse();
    }

    // 상태가 true인 할 일 목록 조회
    public List<ToDoList> getTrueStatusToDos() {
        return toDoListRepository.findByStatusTrue();
    }

    // 새로운 할 일 추가
    public ToDoList addToDo(ToDoList toDoList) {
        return toDoListRepository.save(toDoList);
    }
}
