package springbootscheduleapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootscheduleapp.domain.User;

public interface UserRepo extends JpaRepository<User, Integer> {


}
