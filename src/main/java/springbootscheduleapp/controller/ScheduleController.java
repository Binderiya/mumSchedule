package springbootscheduleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springbootscheduleapp.service.BlockService;
import springbootscheduleapp.service.EntryService;
import springbootscheduleapp.service.SectionService;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {


	@Autowired
	private EntryService entryService;

	@RequestMapping(value="/entry")
	public String allEntry(Model model) {
		model.addAttribute("entry",entryService.findAllEntries());
		return "schedule";
	}
	
	@Autowired
	private BlockService blockService;

	@RequestMapping(value="/block")
	public String allBlock(Model model) {
		model.addAttribute("block",blockService.findAllBlocks());
		return "schedule";
	}
	
	@Autowired
	private SectionService sectionService;

	@RequestMapping(value="/section")
	public String allSection(Model model) {
		model.addAttribute("section", sectionService.findAllSections());
		return "schedule";
	}
	
	
	
}
