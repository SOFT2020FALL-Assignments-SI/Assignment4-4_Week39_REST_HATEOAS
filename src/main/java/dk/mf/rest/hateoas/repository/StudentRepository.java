package dk.mf.rest.hateoas.repository;

import dk.mf.rest.hateoas.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
    // Notice, there are no methods here, but we still can use all those, which we inherit from JpaRepository
}
