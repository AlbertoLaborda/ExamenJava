package com.midominio.examen.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class BienvenidaController {
	@GetMapping({"/","/home",""})
	public String d(Model model) {
		String proverbioMuestra;
		List<String> proverbiosChinos = new ArrayList<>();
		
		proverbiosChinos.add("\"Si tienes una idea durante un día y yo tengo una idea durante otro día, al juntarlas tendremos dos ideas.\" (Proverbio chino sobre la colaboración y el trabajo en equipo).");
		proverbiosChinos.add("\"El que busca un amigo sin defectos se queda sin amigos.\" (Proverbio chino sobre la aceptación y la tolerancia).");
		proverbiosChinos.add("\"El que quiere sacar miel, no debe espantar a las abejas.\" (Proverbio chino sobre la paciencia y la prudencia).");
		proverbiosChinos.add("\"No temas crecer lentamente, teme solo quedarte inmóvil.\" (Proverbio chino sobre la perseverancia y el progreso).");
		proverbiosChinos.add("\"El pájaro que se atreve a salir del nido, encuentra alas.\" (Proverbio chino sobre la valentía y la superación).");
		proverbiosChinos.add("\"No le digas a los dioses lo que hacer, ellos ya lo saben.\" (Proverbio chino sobre el respeto hacia el orden natural).");
		proverbiosChinos.add("\"Aquel que se arrodilla antes de ser vencido puede levantarse de nuevo.\" (Proverbio chino sobre la humildad y la capacidad de recuperación).");
		proverbiosChinos.add("\"Si no cambias de dirección, es probable que acabes donde te diriges.\" (Proverbio chino sobre la reflexión y la toma de decisiones).");
		proverbiosChinos.add("\"Cuando soplan vientos de cambio, algunos construyen muros, mientras otros construyen molinos.\" (Proverbio chino sobre la adaptabilidad y la visión).");
		proverbiosChinos.add("\"No malgastes tu tiempo mirando el pasado, pues ya llegó y se fue; en cambio, construye un futuro mejor.\" (Proverbio chino sobre la importancia de vivir en el presente y mirar hacia adelante).");
		
		//Para generar un numero random, usamen nextInt(inicio,final+1)
		Random random = new Random();

		proverbioMuestra = proverbiosChinos.get(random.nextInt(0, 10));
			
		model.addAttribute("titulo","Pagina de las aplicaciones");
		model.addAttribute("textoItalica",proverbioMuestra);
				
		return "bienvenida";	
	}
}
