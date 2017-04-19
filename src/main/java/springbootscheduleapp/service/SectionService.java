package springbootscheduleapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootscheduleapp.domain.Section;
import springbootscheduleapp.repo.SectionRepo;

@Service
public class SectionService {
	@Autowired
	private SectionRepo sectionRepository;
	public List<Section> findAllSections() {
		List<Section> section = new ArrayList<>();
		section =sectionRepository.findAll();
		return section;
	}
}
