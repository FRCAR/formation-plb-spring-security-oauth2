package fr.formation.formation.sprgsecurity.web.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Annotée par @Controller, cette classe va être considérée par Spring MVC pour
 * traiter des requêtes.
 */
@Controller
public class ControleurDeBase {

	
	/**
	 * Intercepte les requêtes /salut , effectue des instructions (ici un simple
	 * System.out) puis renvoie vers la vue salut.
	 * 
	 * @return
	 */
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String showIndex() {
		System.out.println("Utilisateur : " + SecurityContextHolder.getContext().getAuthentication());
		return "index";
	}

}