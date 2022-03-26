
package com.jsd.developRestAPI.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author JSD
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp")
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, 
//        getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private Integer salary;
    private Boolean isActive;
}
