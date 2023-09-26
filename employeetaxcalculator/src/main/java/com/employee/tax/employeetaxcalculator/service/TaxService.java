package com.employee.tax.employeetaxcalculator.service;

import java.util.List;

import com.employee.tax.employeetaxcalculator.entity.Employee;
import com.employee.tax.employeetaxcalculator.entity.EmployeeVo;

public interface TaxService {
	
	
	
 public int addEmployee(Employee emp);
	 
	 public List<EmployeeVo> getEmpData(String financialYear);

}
