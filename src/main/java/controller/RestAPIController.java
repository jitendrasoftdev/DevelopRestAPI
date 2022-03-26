
package controller;

import com.jsd.developRestAPI.dao.EmployeeRepogistory;
import com.jsd.developRestAPI.model.Employee;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;

/**
 *
 * @author JSD
 */
@RestController
@RequestMapping("/emp")
public class RestAPIController {
    
    @Autowired
    EmployeeRepogistory employeeRepogistory;
    
    @GetMapping()
    public List<Employee> list() {
        return employeeRepogistory.findAll();
    }
    
    @GetMapping("{id}")
    public Employee get(@PathVariable int id) {
        return employeeRepogistory.getById(id);
    }
    
    
    
        
    @PostMapping()
    public ResponseEntity<Employee> post(@RequestBody Employee input) {
        return new ResponseEntity<>(employeeRepogistory.save(input), HttpStatus.OK);
    }
    
    
    
}
