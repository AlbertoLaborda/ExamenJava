package com.midominio.examen.app.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.midominio.examen.app.model.Libro;

@Controller
public class LotoController {
	@GetMapping("/loto/menu")
	public String d(Model model) {

		model.addAttribute("titulo", "Las loterias son");

		return "loto/menu";
	}

	@GetMapping("/loto/genera/{finRango}/{numerosSacar}/{texto}")
	public String alemana(@PathVariable int finRango, @PathVariable int numerosSacar, @PathVariable String texto,
			Model model) {

		model.addAttribute("textoLot", "loto " + texto + " de " + numerosSacar + " de " + finRango);
		model.addAttribute("titulo", texto);
		model.addAttribute("cabecera", "Loteria " + texto);
		model.addAttribute("premiados", resultadoLoteria(numerosSacar, finRango));

		return "loto/genera/premio";

	}

	@GetMapping("/menu")
	public String as(Model model) {

		model.addAttribute("titulo", "Libros");
		model.addAttribute("cabecera", "Libros:");
		model.addAttribute("libros", Libro.getListaLibros());

		return "menu";
	}

	@GetMapping("/menu/libro/titulo/{titulo}")
	public String LibroConcreto(@PathVariable String titulo, Model model) {
		List<Libro> elLibro = new ArrayList<>();

		for (Libro libro : Libro.getListaLibros()) {
			if (titulo.equals(libro.getTitulo())) {
				System.out.println("1x");
				elLibro.add(libro);
				break;
			}
		}
		

		model.addAttribute("titulo", "Libro");
		model.addAttribute("libros", elLibro);

		return "genera/libro";
	}

	@GetMapping("/menu/libro/{genero}")
	public String LibrosAutor(@PathVariable String genero, Model model) {
		
		List<Libro> losLibros = new ArrayList<>();
		
		for (Libro libro : Libro.getListaLibros()) {

			if(genero.equals(libro.getGenero().getDescripcion())) {
				losLibros.add(libro);
			}
		}
		System.out.println(losLibros.size());
		model.addAttribute("titulo", "Libros");
		model.addAttribute("libros", losLibros);

		return "genera/libro";
	}

	public List<Integer> loteria(int finRango) {

		List<Integer> numerosLoteria = new ArrayList<>();
		for (int i = 1; i <= finRango; i++) {
			numerosLoteria.add(i);
		}
		return numerosLoteria;
	}

	public List<Integer> resultadoLoteria(int numerosSacar, int finRango) {
		List<Integer> numerosPremiados = new ArrayList<>();
		List<Integer> numerosLot = loteria(finRango);
		int premio;
		Random random = new Random();
		//Esto maneja colecciones, en este caso baraja la coleccion
		//Collections.shuffle(numerosLot);
		for (int i = 0; i < numerosSacar; i++) {
			premio = random.nextInt(0, finRango);
			numerosPremiados.add(numerosLot.get(premio));
			numerosLot.remove(premio);
		}
		//sort() es para ordenar una lista
		return numerosPremiados;
	}

}
