package com.collection.sortingSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollTree {

	public static void main(String[] args) {
		System.out.println("main started from here");
		//Set<Employee> st=new TreeSet<Employee>();
		List<Employee> st = new ArrayList<>();
        st.add(new Employee(145,"Sumit",26));
        st.add(new Employee(146,"Sambit",29));
        st.add(new Employee(147,"Ali",35));
        st.add(new Employee(148,"Lila",46));
        System.out.println("The employee list are given below ");
        for(Employee s:st){
           System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
           
        }


	}

}
