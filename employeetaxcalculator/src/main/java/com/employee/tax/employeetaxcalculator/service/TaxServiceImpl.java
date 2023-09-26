package com.employee.tax.employeetaxcalculator.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.tax.employeetaxcalculator.entity.Employee;
import com.employee.tax.employeetaxcalculator.entity.EmployeeVo;
import com.employee.tax.employeetaxcalculator.repository.EmployeeRepo;
import com.employee.tax.employeetaxcalculator.utility.TaxUtility;

@Service
public class TaxServiceImpl implements TaxService {
	
	

	@Autowired
	EmployeeRepo repo;
	
	@Autowired
	TaxUtility taxUtil;

	
	@Override
	public int addEmployee(Employee emp) {

		return repo.save(emp).getId();
	}

	
	@Override
	public List<EmployeeVo> getEmpData(String fromYear) {

		List<EmployeeVo> employVoList = new ArrayList<EmployeeVo>();

		String toYear = String.valueOf(Integer.parseInt(fromYear) + 1);
		/* tax financial year from April 01 to March 31 of next year
		 * 
		 */
		Optional<List<Employee>> employee = repo.getEmployeeData(fromYear + "-04-01", toYear + "-03-31");
		if (employee.isPresent()) {
			
			//int employeeCode, String firstName, String lastName, double yearlSalary, double tax,
			//Double cess
			
			employVoList=employee.get().stream().map(emp-> new EmployeeVo(
					emp.getId(),emp.getFirstName(),emp.getLastName(),(emp.getSal() * 12),taxUtil.taxApplicable(emp.getSal(), emp.getDoj(),fromYear + "-04-01"),
					taxUtil.cessApplied(emp.getSal() * 12)
					)).collect(Collectors.toList());
				
		}

		return employVoList;
	}



}
