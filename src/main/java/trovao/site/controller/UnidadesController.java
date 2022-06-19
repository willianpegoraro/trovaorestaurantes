package trovao.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/unidades")
public class UnidadesController {
	
	@GetMapping
	public String quemSomos(Model model) {
		return"unidades";
	}
	
}