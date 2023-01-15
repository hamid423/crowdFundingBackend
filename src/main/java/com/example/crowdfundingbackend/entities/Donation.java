package com.example.crowdfundingbackend.entities;

import jakarta.persistence.*;

@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    @ManyToOne
    private Campaign project;
    @ManyToOne
    private User user;
    //getters and setters
}
