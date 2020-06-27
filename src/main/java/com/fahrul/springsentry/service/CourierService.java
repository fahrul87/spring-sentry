package com.fahrul.springsentry.service;

import java.util.Random;
import java.util.UUID;

import javax.management.ServiceNotFoundException;

import org.springframework.stereotype.Service;
import org.springframework.web.server.NotAcceptableStatusException;

import com.fahrul.springsentry.dto.CourierRequest;
import com.fahrul.springsentry.dto.CourierResponse;

import io.sentry.Sentry;

@Service
public class CourierService {

	public CourierResponse processCourier(CourierRequest request) {
		
		CourierResponse response = null;
		
		Sentry.init("https://f877724ec877431b8d5161b742048c20@o412585.ingest.sentry.io/5289903");
		try {
			if(!isServiceAvailable(request.getPin())) {
				throw new ServiceNotFoundException("service not available for your location " + request.getPin());
			}
			if (request.getWeight() > 2) {
				throw new NotAcceptableStatusException("weight shouldn't be more than 1.5 kg");
			}
		} catch (Exception e) {
			Sentry.capture(e);
			return response = new CourierResponse("**", "failure", "couldn't process");
		}
		response = new CourierResponse(UUID.randomUUID().toString(), "process", "21/12/2018");
		return response;
		
	}
	
	public boolean isServiceAvailable(String pin) {
		return new Random().nextBoolean();
	}
}
