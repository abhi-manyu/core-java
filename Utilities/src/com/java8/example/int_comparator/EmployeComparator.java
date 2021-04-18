
package com.java8.example.int_comparator;

import java.util.Comparator;

public class EmployeComparator // implements Comparator<EmployeComparator>
{
	private int id;
	private String name;

	public EmployeComparator() { // TODO Auto-generated constructor stub

	}

	public EmployeComparator(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	  @Override public String toString() { return id + "---" + name + ",\n"; }
	  
	 /* // @Override //public int compare(EmployeComparator emp1, EmployeComparator
	 * emp2)
	 * 
	 * { // By comparator code
	 * 
	 * if (emp1.getId() < emp2.getId()) return -1; else if (emp1.getId() >
	 * emp2.getId()) return 1; else return 0;
	 * 
	 * // return (emp1.getId() < emp2.getId()?-1:emp1.getId() > emp2.getId()?1:0);
	 * 
	 * // by Comparable code Integer i1=emp1.getId(); Integer i2 = emp2.getId();
	 * return i1.compareTo(i2);
	 * 
	 * }
	 */

}
