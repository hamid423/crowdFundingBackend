package com.example.crowdfundingbackend.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double goal;
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Donation> donations;
    //getters and setters
}
