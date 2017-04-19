package springbootscheduleapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springbootscheduleapp.domain.Course;
import springbootscheduleapp.repo.CourseRepo;
import springbootscheduleapp.service.BlockService;
import springbootscheduleapp.service.CourseService;
import springbootscheduleapp.service.EntryService;
import springbootscheduleapp.service.SectionService;

@Controller
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseRepo rp;
	
	@Autowired
	private EntryService entryService;
	
	@Autowired
	private BlockService blockService;
	
	@Autowired
	private SectionService sectionService;

	@Autowired
	private CourseService courseService;

	@RequestMapping(value="/course")
	public String allUser(Model model) {
		model.addAttribute("entries", entryService.findAllEntries());
		model.addAttribute("blocks", blockService.findAllBlocks());
		model.addAttribute("sections", sectionService.findAllSections());
		model.addAttribute("courses",courseService.findAllCourses());
		return "viewCourse";
	}
	
	@RequestMapping("/addCourse")
	public String addCourse(Model model, @RequestParam(value = "name", required = false) String name,
			String prof) {
		model.addAttribute("entries", entryService.findAllEntries());
		model.addAttribute("blocks", blockService.findAllBlocks());
		model.addAttribute("sections", sectionService.findAllSections());
		model.addAttribute("courses", courseService.findAllCourses());
		model.addAttribute("name", name);
		model.addAttribute("prof", prof);
		System.out.println(name);
		System.out.println(prof);	
		Course c = new Course( name, prof);
		rp.saveAndFlush(c);
		
		return "admin_addCourse";
	}
}
