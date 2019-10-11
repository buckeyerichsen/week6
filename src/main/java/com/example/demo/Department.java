package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String depname;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    public Set<Guest> guests;
}
