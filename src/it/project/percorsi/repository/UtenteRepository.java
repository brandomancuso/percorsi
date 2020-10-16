package it.project.percorsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.project.percorsi.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

	List<Utente> findByEmail(String email);

}
