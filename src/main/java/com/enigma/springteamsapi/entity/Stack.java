package com.enigma.springteamsapi.entity;

import com.enigma.springteamsapi.constant.Stacks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "stacks")
public class Stack extends BaseEntity {

    @Column(name = "name", unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private Stacks stacks;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "trainee_id", nullable = false)
    private Trainee trainee;
}
