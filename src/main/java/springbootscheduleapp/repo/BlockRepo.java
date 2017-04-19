package springbootscheduleapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootscheduleapp.domain.Block;


public interface BlockRepo extends JpaRepository<Block, Integer> {


}
