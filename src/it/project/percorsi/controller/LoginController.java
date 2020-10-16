package it.project.percorsi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.project.percorsi.entity.Utente;
import it.project.percorsi.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login() {
		System.out.println("Redirect..");
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest req, HttpSession session, Model model) {
		Utente logged = loginService.login(req.getParameter("email"), req.getParameter("password"), model);
		if(logged != null) {
			session.setAttribute("user", logged);
		}
		return "login";
	}
	
	
	
}
