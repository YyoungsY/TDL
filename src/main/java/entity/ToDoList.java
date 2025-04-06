package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ToDoList")
public class ToDoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "No", nullable = false)
    private int no;

    @Column(name = "ToDo_List", nullable = false, length = 10)
    private String toDoList;

    @Column(name = "Status", nullable = false)
    private boolean status;
}
