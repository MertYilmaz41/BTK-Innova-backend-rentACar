package com.btkAkademi.rentACar.business.dtos;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IndividualCustomerInvoiceDto {
	private int id;
	private String tcNo;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate rentDate;
	private LocalDate returnedDate;
	private double totalPrice;
	LocalDate creationDate;
	private List<AdditionalServiceListDto> additonalServices;
}
