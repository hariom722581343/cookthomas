package Repository;

import Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	void save(Employee employee);
}

