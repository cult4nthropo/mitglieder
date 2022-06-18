package de.tfckn.mitglieder.mitglied;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/mitglied")
public class MitgliedController {
	
	private final MitgliedService mitgliedService;
	
	@Autowired
	public MitgliedController(MitgliedService mitgliedService) {
		this.mitgliedService = mitgliedService;
	}
	
	@GetMapping
	public List<Mitglied> getMitglieder() {
		return mitgliedService.getMitglieder();
	}

}
