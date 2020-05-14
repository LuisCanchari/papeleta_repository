package edu.cientifica.papeleta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*@Controller: anotacion para designar una clase Controlador del patron MVC*/
@Controller
public class SeguridadController {

	/* @GetMapping: anotacion spring, asocia la peticion GET con un metodo */
	@GetMapping("/")
	public String login() {

		return "login";

	}

	/*
	 * @RequestMapping: anotacion que asocia peticiones (GET o POST) con un metodo
	 * 
	 * @RequestParam: anotacion que lee los parametros de peticiones POST
	 */
	@RequestMapping(value = "/autenticacion", method = RequestMethod.POST)
	public String autenticacion(Model model, @RequestParam(name = "usuario") String usuario,
			@RequestParam(name = "password") String password) {
		String mensaje;
		if (password.equals("clave")) {
			mensaje = "Password correcto";

		} else {
			mensaje = "Password incorrecto";
		}

		model.addAttribute("msg", mensaje);
		model.addAttribute("username", usuario);

		return "resultado";
	}
}
