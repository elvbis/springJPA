package pe.spring.jpa.controller;

import java.util.List;
import java.util.Optional;

import pe.spring.jpa.repository.entity.DocumentEntity;
import pe.spring.jpa.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DocumentController {


	@Autowired
	private DocumentRepository documentRepository;

	@GetMapping("/document")
	public List<DocumentEntity> getTest() {

		Optional<DocumentEntity> result = documentRepository.findById("001");
		DocumentEntity entity = result.get();
		entity.setDescripcion("124578235");
		documentRepository.saveAndFlush(entity);
		System.out.println("ok");
		return null;
	}

}
