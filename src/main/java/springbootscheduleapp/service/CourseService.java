package springbootscheduleapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootscheduleapp.domain.Course;
import springbootscheduleapp.repo.CourseRepo;

@Service
public class CourseService {
	@Autowired
	private CourseRepo courseRepository;
	

	
	public List<Course> findAllCourses() {
		List<Course> course = new ArrayList<>();

		course =courseRepository.findAll();
		return course;
	}
}
