package com.apradalabs.machineStateTest.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BookNotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String noteContent;
    private Long version;
    @ManyToOne
    private Book book;


}