package springbootscheduleapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootscheduleapp.domain.Section;

public interface SectionRepo  extends JpaRepository<Section, Integer> {


}
