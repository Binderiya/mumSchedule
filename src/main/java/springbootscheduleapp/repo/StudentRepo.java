package springbootscheduleapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootscheduleapp.domain.Student;

public interface StudentRepo  extends JpaRepository<Student, Integer> {


}
