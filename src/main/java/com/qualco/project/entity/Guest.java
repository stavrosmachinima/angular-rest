package com.qualco.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guests")
public class Guest {

    @Id
    @Column(name = "guest_id", nullable = false)
    private Integer guest_id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    // Constructors
    public Guest() {}

    public Guest(Integer guest_id, String name) {
        this.guest_id = guest_id;
        this.name = name;
    }

    // Getters and Setters
    public Integer getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(Integer guestId) {
        this.guest_id = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}