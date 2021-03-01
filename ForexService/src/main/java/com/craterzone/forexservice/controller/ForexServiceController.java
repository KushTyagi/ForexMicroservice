package com.craterzone.forexservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.craterzone.forexservice.dto.ExchangeValue;
import com.craterzone.forexservice.service.ForexServiceI;

@RestController
@RequestMapping("/api/vi/currencies")
public class ForexServiceController {

	@Autowired
	ForexServiceI forexService;
	
    @PostMapping
	public ResponseEntity<ExchangeValue> exchangeValue(@RequestBody ExchangeValue exchage) {
    	ExchangeValue exchangeValue = forexService.givenAmount_whenConversion_thenNotNull(exchage);
		return new ResponseEntity<ExchangeValue>(exchangeValue, HttpStatus.OK);
	}
}
