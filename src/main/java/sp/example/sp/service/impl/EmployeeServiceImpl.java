package sp.example.sp.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sp.example.sp.dto.EmployeeDto;
import sp.example.sp.entity.Employee;
import sp.example.sp.mapper.EmployeeMapper;
import sp.example.sp.repository.EmployeeRepository;
import sp.example.sp.service.EmployeeService;
@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee= employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
