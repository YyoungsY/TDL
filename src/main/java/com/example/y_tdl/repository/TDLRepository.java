package com.example.y_tdl.repository;

import com.example.y_tdl.entity.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface TDLRepository extends JpaRepository<ToDoList, Integer> {
    List<ToDoList> findByStatusFalse();
    List<ToDoList> findByStatusTrue();
}
