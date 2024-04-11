package com.enigma.springteamsapi.entity;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trainees")
public class Trainee extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "batch", nullable = false)
    private String batch;

    @Column(name = "stacks", nullable = false)
    @OneToMany(mappedBy = "trainee")
    private List<Stack> stacks;

    @Column(name = "techs", nullable = false)
    @OneToMany(mappedBy = "trainee")
    private List<Tech> techs;
}
