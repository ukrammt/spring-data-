package org.xproce.springboot_ass.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="session")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Date date;
    private Date h_debut;
    private Date h_fin;
    @ManyToMany(mappedBy = "sessions",fetch=FetchType.EAGER)
    private Collection<Student> students=new ArrayList<>();
    @ManyToOne
    private Course cours;

}
