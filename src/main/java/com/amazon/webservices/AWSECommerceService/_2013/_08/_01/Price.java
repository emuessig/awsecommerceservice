package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Price:
{
  "required": [
    "FormattedPrice"
  ],
  "type": "object",
  "properties": {
    "Amount": {
      "type": "integer"
    },
    "CurrencyCode": {
      "type": "string"
    },
    "FormattedPrice": {
      "type": "string"
    }
  }
}
*/


public class Price {

	@Size(max=1)
	private int amount;

	@Size(max=1)
	private String currencyCode;

	@Size(max=1)
	@NotNull
	private String formattedPrice;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    
	    currencyCode = null;
	    formattedPrice = org.apache.commons.lang3.StringUtils.EMPTY;
	}

	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}
	
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getFormattedPrice() {
		return formattedPrice;
	}
	
	public void setFormattedPrice(String formattedPrice) {
		this.formattedPrice = formattedPrice;
	}
}