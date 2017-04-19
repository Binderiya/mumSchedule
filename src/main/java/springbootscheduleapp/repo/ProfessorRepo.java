package springbootscheduleapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootscheduleapp.domain.Professor;

public interface ProfessorRepo extends JpaRepository<Professor, Integer> {


}
