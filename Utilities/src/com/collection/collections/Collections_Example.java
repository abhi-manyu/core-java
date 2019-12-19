package com.collection.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Collections_Example
{
    public static void main(String[] args) {
    	
    	/*Employee[] emps_array=new Employee[3];
    	emps_array[0] = new Employee(101,"Abhi","Odisha");
    	emps_array[1] = new Employee(103,"Arabinda","Bhubaneswar");
    	emps_array[2] = new Employee(102,"Ansu","Kolkata");*/
    	
    	List<Employee> emps = new ArrayList<>();
    	emps.add(new Employee(101,"Abhi","Odisha"));
    	emps.add(new Employee(103,"Arabinda","Bhubaneswar"));
    	emps.add(new Employee(102,"Ansu","Kolkata"));
    	
    	System.out.println("the list b4 sorting is as follows : \n "+emps);
    	
    	//System.out.println(emps);
    	
    	Collections.sort(emps);
    	
    	System.out.println("the list after sorting is as follows : \n "+emps);
	}

	/*@Override
	public int compare(Employee e1, Employee e2) {
		return e1.id.compareTo
	} */ 
    
    
    
    
    
}
