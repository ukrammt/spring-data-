package org.xproce.springboot_ass.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends Personne {


    private Date d_affectation;
    @OneToOne
    private Course course;

}
