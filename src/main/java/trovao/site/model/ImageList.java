package trovao.site.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ImageList {

	List<Image> images = new ArrayList<>();
	
	public String getNomeList(int ind) {
		return images.get(ind).getNome();
	}

	public void setNomeList(Image image) {
		images.add(image);
		
	}
	
	public int getLength() {
		int length = this.images.size();
		return length;
	}
}
