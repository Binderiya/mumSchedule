package springbootscheduleapp.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootscheduleapp.domain.Block;
import springbootscheduleapp.repo.BlockRepo;

@Service
public class BlockService {
	@Autowired
	private BlockRepo blockRepository;
	

	
	public List<Block> findAllBlocks() {
		List<Block> block = new ArrayList<>();
		block =blockRepository.findAll();
		return block;
	}
}
