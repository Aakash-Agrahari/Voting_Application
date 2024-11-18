package com.example.voting_system_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Option {

    private int id;

    private String desc;

    private int votes;

    @ManyToOne
    @JoinColumn(name = "poll_id")
    private Poll poll;
}
