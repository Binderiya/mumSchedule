package springbootscheduleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootscheduleapp.service.BlockService;
import springbootscheduleapp.service.CourseService;
import springbootscheduleapp.service.EntryService;
import springbootscheduleapp.service.SectionService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private EntryService entryService;
	
	@Autowired
	private BlockService blockService;
	
	@Autowired
	private SectionService sectionService;

	
	@RequestMapping("/addCourse")
	public String showAddCourseForm() {
		
		return "admin_addCourse";
	}

	@RequestMapping(value = "/viewCourse")
	public String allUser(Model model) {
		model.addAttribute("entries", entryService.findAllEntries());
		model.addAttribute("blocks", blockService.findAllBlocks());
		model.addAttribute("sections", sectionService.findAllSections());
		model.addAttribute("courses", courseService.findAllCourses());
		return "admin_viewCourse";
	}

	@RequestMapping(value = "/viewSchedule")
	public String viewSchedule(Model model) {
		model.addAttribute("entries", entryService.findAllEntries());
		model.addAttribute("blocks", blockService.findAllBlocks());
		model.addAttribute("sections", sectionService.findAllSections());
		model.addAttribute("courses", courseService.findAllCourses());
		return "admin_schedule";
	}
	



}
