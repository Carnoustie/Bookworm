package com.bookclub.bookworm;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.ArrayList;
import jakarta.persistence.CascadeType; 

@Entity
public class clubMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String location;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)  // Defining the relationship
    @JoinColumn(name = "bookclub_id")  // Foreign key column in the Book table
    private List<Book> books;

    public clubMember(String un, String loc){
        this.username = un;
        this. location = loc;
        this.books = new ArrayList<Book>();
    }
}
