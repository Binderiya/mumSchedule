package springbootscheduleapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootscheduleapp.domain.Course;


public interface CourseRepo extends JpaRepository<Course, Integer> {


}
