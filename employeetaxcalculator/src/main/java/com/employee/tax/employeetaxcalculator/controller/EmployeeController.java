package com.employee.tax.employeetaxcalculator.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.tax.employeetaxcalculator.entity.Employee;
import com.employee.tax.employeetaxcalculator.entity.EmployeeVo;
import com.employee.tax.employeetaxcalculator.service.TaxService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;

@RestController
@RequestMapping("api/employeetax/")
public class EmployeeController {

	@Autowired
	TaxService taxServ;

	@PostMapping(value="taxpayers")
	public ResponseEntity<String> perssiteEmp(@Valid @RequestBody Employee emp) {
		int empId = taxServ.addEmployee(emp);
		return ResponseEntity.ok("Employee Created ID :" + empId);
	}
	
	
	@GetMapping("taxpayers/{financialYear}")
	public ResponseEntity<List<EmployeeVo>> empData(@PathVariable("financialYear") @Pattern(regexp="\\d{4}") String financialYear) {
		List<EmployeeVo> employeeVoList = taxServ.getEmpData(financialYear);
		return ResponseEntity.ok(employeeVoList);
	}


}
