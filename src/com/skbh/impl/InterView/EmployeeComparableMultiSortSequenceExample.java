package com.skbh.impl.InterView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class EmpMultiComparatorList implements Comparator<Employee>{
	
	private List<Comparator<Employee>> listOfComp;
	
	@SafeVarargs
	public EmpMultiComparatorList(Comparator<Employee>... listOfComp) {
		this.listOfComp = Arrays.asList(listOfComp);
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		for (Comparator<Employee> comparator : listOfComp) {
			int result =comparator.compare(o1, o2);
			if(result!=0)	
			return result;
		}
		return 0;
	}
}

class EmpSalaryComparatorList implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getSalary()>o2.getSalary())?1 : (o1.getSalary()<o2.getSalary()) ? -1 : 0;
		
	}
}

class EmpNameComparatorList implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getName().toString().compareTo(o2.getName().toString()));
	}
}

public class EmployeeComparableMultiSortSequenceExample{
	
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		Employee ex=new Employee(1, "aakash", 20);
		Employee ex1=new Employee(2, "kandarp", 20);
		Employee ex2=new Employee(3, "sushil", 60);
		Employee ex3=new Employee(5, "abhyu", 10);
		Employee ex4=new Employee(6, "Sushant", 80);
		list.add(ex2);
		list.add(ex1);
		list.add(ex);
		list.add(ex3);
		list.add(ex4);
		System.out.println("Before#" + list);
		Collections.sort(list,new EmpMultiComparatorList(new EmpSalaryComparatorList(),new EmpNameComparatorList()));
		System.out.println("After #" + list);
		
	}

}

