package org.xproce.springboot_ass.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Personne{

    private String matricule;
    @ManyToMany
    private Collection<Session>sessions=new ArrayList<>();
}
