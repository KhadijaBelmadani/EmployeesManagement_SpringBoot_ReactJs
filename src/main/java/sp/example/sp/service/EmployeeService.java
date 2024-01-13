package sp.example.sp.service;

import sp.example.sp.dto.EmployeeDto;
import sp.example.sp.entity.Employee;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
