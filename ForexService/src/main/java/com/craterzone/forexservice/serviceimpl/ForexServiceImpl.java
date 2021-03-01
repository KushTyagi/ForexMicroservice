package com.craterzone.forexservice.serviceimpl;

import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;
import org.javamoney.moneta.Money;
import com.craterzone.forexservice.dto.ExchangeValue;
import org.springframework.stereotype.Service;
import com.craterzone.forexservice.service.ForexServiceI;

@Service
public class ForexServiceImpl implements ForexServiceI{

	public ExchangeValue givenAmount_whenConversion_thenNotNull(ExchangeValue exchage) {  
		 int currencyAmount  = new NumComponent(exchage.getAmount()).numb.intValue();
		 final MonetaryAmount in = Money.of(currencyAmount, exchage.getFrom());
		 final ExchangeRateProvider rateProvider = MonetaryConversions.getExchangeRateProvider("IMF");
         final CurrencyConversion Conversion = rateProvider.getCurrencyConversion(exchage.getTo());
         final MonetaryAmount convertedValue = in.with(Conversion);
         exchage.setConvertedAmount(convertedValue+"$"); 
         
         return exchage;
	}
}
