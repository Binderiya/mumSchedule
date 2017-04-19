package springbootscheduleapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import springbootscheduleapp.domain.Block;
import springbootscheduleapp.repo.BlockRepo;


@RestController
@RequestMapping("/block")
public class BlockController {
	@Autowired
	BlockRepo rp;
	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Block> findAll(){
		return rp.findAll();
		
	}
	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}
}
