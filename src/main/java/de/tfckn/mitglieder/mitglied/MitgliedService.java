package de.tfckn.mitglieder.mitglied;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MitgliedService {

	public List<Mitglied> getMitglieder() {
		return List.of(
				new Mitglied(
						1,
						"Holger", 
						"Kühl",
						LocalDate.of(1982, Month.APRIL, 23),
						"standard"));
	}
}
