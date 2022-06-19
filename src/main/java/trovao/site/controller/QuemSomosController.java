package trovao.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quem-somos")
public class QuemSomosController {
	
	@GetMapping
	public String quemSomos(Model model) {
		return"quem-somos";
	}
	
}
