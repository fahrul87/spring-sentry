package com.fahrul.springsentry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fahrul.springsentry.dto.CourierRequest;
import com.fahrul.springsentry.dto.CourierResponse;
import com.fahrul.springsentry.service.CourierService;

@SpringBootApplication
@RestController
public class SpringSentryApplication {
	
	@Autowired
	private CourierService service;
	
	@PostMapping("/processCourier")
	public CourierResponse dispacthCourier(@RequestBody CourierRequest request) {
		return service.processCourier(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSentryApplication.class, args);
	}

}
