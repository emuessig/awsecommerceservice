package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for RentalListing:
{
  "type": "object",
  "properties": {
    "Price": {
      "$ref": "Price"
    },
    "Period": {
      "$ref": "NonNegativeIntegerWithUnits"
    },
    "IsFulfilledByAmazon": {
      "type": "boolean"
    },
    "Disclaimer": {
      "type": "string"
    }
  }
}
*/


public class RentalListing {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price price;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.NonNegativeIntegerWithUnits period;

	@Size(max=1)
	private boolean isFulfilledByAmazon;

	@Size(max=1)
	private String disclaimer;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    price = null;
	    period = null;
	    
	    disclaimer = null;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getPrice() {
		return price;
	}
	
	public void setPrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price price) {
		this.price = price;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.NonNegativeIntegerWithUnits getPeriod() {
		return period;
	}
	
	public void setPeriod(com.amazon.webservices.AWSECommerceService._2013._08._01.NonNegativeIntegerWithUnits period) {
		this.period = period;
	}

	public boolean getIsFulfilledByAmazon() {
		return isFulfilledByAmazon;
	}
	
	public void setIsFulfilledByAmazon(boolean isFulfilledByAmazon) {
		this.isFulfilledByAmazon = isFulfilledByAmazon;
	}

	public String getDisclaimer() {
		return disclaimer;
	}
	
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}
}