package springbootscheduleapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootscheduleapp.domain.Admin;

public interface AdminRepo  extends JpaRepository<Admin, Integer> {


}
