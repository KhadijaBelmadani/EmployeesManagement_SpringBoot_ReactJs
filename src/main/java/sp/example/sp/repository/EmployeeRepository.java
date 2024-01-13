package sp.example.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.example.sp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
