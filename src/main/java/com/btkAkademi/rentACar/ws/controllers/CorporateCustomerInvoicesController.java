package com.btkAkademi.rentACar.ws.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btkAkademi.rentACar.business.abstracts.CorporateCustomerInvoiceService;
import com.btkAkademi.rentACar.business.dtos.CorporateCustomerInvoiceDto;
import com.btkAkademi.rentACar.business.requests.corporateCustomerInvoiceRequests.CreateCorporateCustomerInvoiceRequest;
import com.btkAkademi.rentACar.business.requests.corporateCustomerInvoiceRequests.UpdateCorporateCustomerInvoiceRequest;
import com.btkAkademi.rentACar.core.utilities.results.DataResult;
import com.btkAkademi.rentACar.core.utilities.results.Result;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/corporatecustomerinvoices")
@CrossOrigin
public class CorporateCustomerInvoicesController {
	private CorporateCustomerInvoiceService corporateCustomerInvoiceService;
	
	@Autowired
	public CorporateCustomerInvoicesController(CorporateCustomerInvoiceService corporateCustomerInvoiceService) {
		super();
		this.corporateCustomerInvoiceService = corporateCustomerInvoiceService;
	}
	
	@GetMapping("getall")
	public DataResult<List<CorporateCustomerInvoiceDto>> getAll()
	{
		return this.corporateCustomerInvoiceService.getAll();
	}
	
	@GetMapping("getinvoiceforcorporatecustomer/{rentalId}")
	public DataResult<CorporateCustomerInvoiceDto> getInvoiceForCorporateCustomer(@PathVariable int rentalId) {
		return this.corporateCustomerInvoiceService.getInvoiceForCorporateCustomer(rentalId);
	}
	
	@PostMapping("add")
	public Result add(@RequestBody @Valid CreateCorporateCustomerInvoiceRequest createCorporateCustomerInvoiceRequest) {

		return this.corporateCustomerInvoiceService.add(createCorporateCustomerInvoiceRequest);
	}
	
	@PostMapping("update")
	public Result update(@RequestBody @Valid UpdateCorporateCustomerInvoiceRequest updateCorporateCustomerInvoiceRequest) 
	{
		return this.corporateCustomerInvoiceService.update(updateCorporateCustomerInvoiceRequest);
	}
	
	@DeleteMapping("delete/{id}")
	public Result delete(@Valid @PathVariable int id) {
		return this.corporateCustomerInvoiceService.delete(id);
	}
}
