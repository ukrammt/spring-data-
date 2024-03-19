package org.xproce.springboot_ass.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@Table(name="course")
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Integer id;
    private String title;
    private String description;
    @OneToMany(mappedBy = "cours",fetch=FetchType.EAGER)
    private Collection<Session>sessions;
    @OneToOne(mappedBy = "course")
    private Teacher teacher;
}
