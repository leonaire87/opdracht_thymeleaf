package be.ehb.opdracht_thymeleaf.model;

import org.springframework.data.repository.CrudRepository;

public interface StudentDAO extends CrudRepository<Student,Integer> {
}
