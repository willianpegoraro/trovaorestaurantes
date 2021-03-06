package trovao.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import trovao.site.service.UploadFileService;

@Controller
@RequestMapping("/paineladm")
public class PainelAdmController {
	
	@Autowired
	private UploadFileService uploadFileService;

	
	@GetMapping
	public String home(Model model) {
		return "paineladm";
	}
	
	@PostMapping
	public String uploadFile(@RequestParam MultipartFile[] files){
		for (MultipartFile file : files) {
			uploadFileService.uploadFile(file);
		}
		return "redirect:/home";
	}
}
