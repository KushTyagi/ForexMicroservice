package com.craterzone.forexservice.service;

import com.craterzone.forexservice.dto.ExchangeValue;

public interface ForexServiceI {

	public ExchangeValue givenAmount_whenConversion_thenNotNull(ExchangeValue exchage);
}
