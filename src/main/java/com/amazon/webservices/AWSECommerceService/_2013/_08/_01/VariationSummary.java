package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for VariationSummary:
{
  "enum": [],
  "type": "object",
  "properties": {
    "LowestPrice": {
      "$ref": "Price"
    },
    "HighestPrice": {
      "$ref": "Price"
    },
    "LowestSalePrice": {
      "$ref": "Price"
    },
    "HighestSalePrice": {
      "$ref": "Price"
    }
  }
}
*/


public class VariationSummary {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestPrice;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price highestPrice;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestSalePrice;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price highestSalePrice;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    lowestPrice = null;
	    highestPrice = null;
	    lowestSalePrice = null;
	    highestSalePrice = null;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getLowestPrice() {
		return lowestPrice;
	}
	
	public void setLowestPrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getHighestPrice() {
		return highestPrice;
	}
	
	public void setHighestPrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price highestPrice) {
		this.highestPrice = highestPrice;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getLowestSalePrice() {
		return lowestSalePrice;
	}
	
	public void setLowestSalePrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestSalePrice) {
		this.lowestSalePrice = lowestSalePrice;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getHighestSalePrice() {
		return highestSalePrice;
	}
	
	public void setHighestSalePrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price highestSalePrice) {
		this.highestSalePrice = highestSalePrice;
	}
}