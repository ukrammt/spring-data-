package org.xproce.springboot_ass.dao.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.springboot_ass.dao.entities.Personne;

public interface Personnerepository extends JpaRepository<Personne,Integer> {
}
