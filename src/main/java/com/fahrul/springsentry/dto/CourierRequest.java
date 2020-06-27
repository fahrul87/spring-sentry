package com.fahrul.springsentry.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourierRequest {
	
	private String consignmentNumber;
	private String source;
	private String destination;
	private int weight;
	private String senderName;
	private String senderContact;
	private String state;
	private String pin;
	private String contact;

}
