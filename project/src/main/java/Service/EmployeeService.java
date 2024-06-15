package Service;

import java.util.List;

import Entity.Employee;
import Repository.DepartmentRepository;
import Repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;
    
    public void saveEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            employeeRepository.save(employee);
        }
    }
    
    public List<Employee> getEligibleEmployees(Date date) {
        List<Employee> eligibleEmployees = new ArrayList<>();
        List<Employee> allEmployees = employeeRepository.findAll();
        for (Employee employee : allEmployees) {
            if (employee.getExitDate() == null || employee.getExitDate().after(date)) {
                eligibleEmployees.add(employee);
            }
        }
        return eligibleEmployees;
    }
}


