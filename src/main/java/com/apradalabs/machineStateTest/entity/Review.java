package com.apradalabs.machineStateTest.entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private int rating;

    @ManyToOne
    private Book book;


}
