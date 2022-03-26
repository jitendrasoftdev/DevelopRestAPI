
package com.jsd.developRestAPI.dao;

import com.jsd.developRestAPI.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author JSD
 */
@RepositoryRestResource(collectionResourceRel = "data", path="emp")
public interface EmployeeRepogistory extends JpaRepository<Employee, Integer>{
}
