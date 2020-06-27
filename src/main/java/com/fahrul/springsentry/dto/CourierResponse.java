package com.fahrul.springsentry.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourierResponse {
	
	private String consigmentNumber;
	private String deliveryStatus;
	private String expectedDate;

}
