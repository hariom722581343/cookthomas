package Controller;

@RestController
@RequestMapping("/tci")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    @PostMapping("/employee-bonus")
    public ResponseEntity<Void> saveEmployees(@RequestBody List<Employee> employees) {
        employeeService.saveEmployees(employees);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/employee-bonus")
    public ResponseEntity<List<Employee>> getEligibleEmployees(@RequestParam("date") Date date) {
        List<Employee> eligibleEmployees = employeeService.getEligibleEmployees(date);
        return ResponseEntity.ok(eligibleEmployees);
    }
}

