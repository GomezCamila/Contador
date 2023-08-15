package com.example.contador.Controllers;
import jakarta.servlet.http.HttpSession;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	//metodo de CLASE
private  void setContadorSesion(HttpSession sesion, int numeroVeces) {
		sesion.setAttribute("contador", numeroVeces);
	}

//prueba de cookie
private int getContadorSesion(HttpSession sesion) {
	Object valorSesion = sesion.getAttribute("contador");
	if(valorSesion == null) {
		setContadorSesion(sesion, 0);
		valorSesion = sesion.getAttribute("contador");
	
	}
	return (Integer) valorSesion;
}



	@GetMapping("/")
	public String index(HttpSession sesion) {
		System.out.println(sesion.getAttribute("contador")+"Cuanta info hay");
		int conteoActual = getContadorSesion(sesion);
		System.out.println(sesion.getAttribute("contador")+ "cuanta info hay");
		setContadorSesion(sesion, conteoActual+1);
		return "index.jsp";
	}
	@GetMapping("/contador")
	public String contador(HttpSession sesion, Model modelo) {
		modelo.addAttribute("contador, getContadorSesion(sesion");
		return "contador.jsp";
	}
	@GetMapping ("/reset")
	public String reset (HttpSession sesion1) {
		sesion1.invalidate();
		return "redirect:/contador";
		
	}
}
