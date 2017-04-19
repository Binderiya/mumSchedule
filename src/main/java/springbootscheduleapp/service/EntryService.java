package springbootscheduleapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootscheduleapp.domain.Entry;
import springbootscheduleapp.repo.EntryRepo;

@Service
public class EntryService {
	@Autowired
	private EntryRepo entryRepository;
	
	public List<Entry> findAllEntries() {
		List<Entry> entry = new ArrayList<>();
		entry =entryRepository.findAll();
		return entry;
	}
	
}
