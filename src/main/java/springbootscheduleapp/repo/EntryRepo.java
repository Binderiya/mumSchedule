package springbootscheduleapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import springbootscheduleapp.domain.Entry;


public interface EntryRepo extends JpaRepository<Entry, Integer> {


}

