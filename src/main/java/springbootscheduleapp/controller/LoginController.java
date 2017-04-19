package springbootscheduleapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springbootscheduleapp.domain.Admin;
import springbootscheduleapp.domain.Course;
import springbootscheduleapp.domain.Professor;
import springbootscheduleapp.domain.Student;
import springbootscheduleapp.repo.AdminRepo;
import springbootscheduleapp.repo.ProfessorRepo;
import springbootscheduleapp.repo.StudentRepo;
import springbootscheduleapp.service.BlockService;
import springbootscheduleapp.service.CourseService;
import springbootscheduleapp.service.EntryService;
import springbootscheduleapp.service.SectionService;

@Controller
public class LoginController extends WebMvcConfigurerAdapter {

	@Autowired
	AdminRepo ar;
	
	@Autowired
	StudentRepo sr;
	
	@Autowired
	ProfessorRepo pr;

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private EntryService entryService;
	
	@Autowired
	private BlockService blockService;
	
	@Autowired
	private SectionService sectionService;

	
	 @RequestMapping("/")
	 public String showLoginForm() {
	 return "login";
	 }
	@RequestMapping(value = "/login")
	public String login(Model model, @RequestParam(value = "username", required = false) String username,
			String password) {
		List<Admin> admins = ar.findAll();
		List<Professor> professors = pr.findAll();
		List<Student> students = sr.findAll();
		
		for (int i = 0; i < admins.size(); i ++){
			if(admins.get(i).getPassword().equals(password)&& admins.get(i).getUsername().equals(username)){

						model.addAttribute("entries", entryService.findAllEntries());
						model.addAttribute("blocks", blockService.findAllBlocks());
						model.addAttribute("sections", sectionService.findAllSections());
						model.addAttribute("courses", courseService.findAllCourses());
						List<Course> courseList =  courseService.findAllCourses();
						for(int k = 0; k<courseList.size(); k++){
							
						}
						return "admin_schedule";
		
			}
		}
		for (int i = 0; i < professors.size(); i ++){
			if(professors.get(i).getPassword().equals(password)&& professors.get(i).getUsername().equals(username)){

						model.addAttribute("entries", entryService.findAllEntries());
						model.addAttribute("blocks", blockService.findAllBlocks());
						model.addAttribute("sections", sectionService.findAllSections());
						model.addAttribute("courses", courseService.findAllCourses());
						return "prof_schedule";
		
			}
		}
		for (int i = 0; i < students.size(); i ++){
			if(students.get(i).getPassword().equals(password)&& students.get(i).getUsername().equals(username)){

						model.addAttribute("entries", entryService.findAllEntries());
						model.addAttribute("blocks", blockService.findAllBlocks());
						model.addAttribute("sections", sectionService.findAllSections());
						model.addAttribute("courses", courseService.findAllCourses());
						return "student_schedule";
		
			}
		}
		
		
		return "login";
	}

}
