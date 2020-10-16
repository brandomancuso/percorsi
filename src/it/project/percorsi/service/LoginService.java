package it.project.percorsi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import it.project.percorsi.entity.Utente;
import it.project.percorsi.repository.UtenteRepository;

@Service
public class LoginService {
	
	@Autowired
	UtenteRepository userRepo;
	
	public Utente login(String email, String password, Model model) {
		Utente loggedUser = null;
		List<Utente> user = userRepo.findByEmail(email);
		if(user.isEmpty()) {
			model.addAttribute("loginMsg","Utente non trovato.");
		} else {
			loggedUser = user.get(0);
			if(!loggedUser.getPassword().equals(password)) {
				model.addAttribute("loginMsg","Password errata, riprova.");
				loggedUser = null;
			} else {
				model.addAttribute("loginMsg","Login effettuato con successo.");
			}
		}
		return loggedUser;
		
	}

}
