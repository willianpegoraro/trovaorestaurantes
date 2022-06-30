package trovao.site.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import trovao.site.model.ImageList;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private ImageList imageList;
	
	
	@GetMapping
	public String home(Model model) {
		List <String> imagesName = new ArrayList<String>();
		for (int i = 0; i < imageList.getLength(); i++) {
			imagesName.add(imageList.getNomeList(i));
			System.out.println(imagesName.get(i));
		}
		model.addAttribute("imagesName", imagesName);
		return "home";

	
	}
	
}
