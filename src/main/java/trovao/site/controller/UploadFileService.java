package trovao.site.controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileService{
    
	@Value("${contato.disco.raiz}")
	private String raiz;
	
	public void uploadFile(MultipartFile file) {
		this.upload(this.raiz, file);
	}
			
	public void upload(String diretorio, MultipartFile arquivo){
		Path diretorioPath = Paths.get(diretorio);
		Path arquivoPath = diretorioPath.resolve(arquivo.getOriginalFilename());
		
		try {
			Files.createDirectories(diretorioPath);
			arquivo.transferTo(arquivoPath.toFile());
			
		}catch (IOException e) {
			throw new RuntimeException("Erro na tentativa de salvar o arquivo.", e);
		}
		
	}
	
}
