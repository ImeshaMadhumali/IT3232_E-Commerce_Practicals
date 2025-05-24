package model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;


@Entity
public class Employee extends Person {
	private String jobPosition;
	
	 @ManyToMany
	    @JoinTable(
	        name = "employee_canteen",
	        joinColumns = @JoinColumn(name = "employee_id"),
	        inverseJoinColumns = @JoinColumn(name = "canteen_id")
	    )
	    private List<Canteen> canteens;
}
