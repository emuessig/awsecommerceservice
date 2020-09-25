package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for RentalOffer:
{
  "type": "object",
  "properties": {
    "Merchant": {
      "$ref": "Merchant"
    },
    "RentalListing": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "RentalListing"
      }
    }
  }
}
*/


public class RentalOffer {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Merchant merchant;

	@Size(max=1)
	private Array rentalListing;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    merchant = null;
	    rentalListing = new ArrayList<RentalListing>();
	}

	public com.digitalml.rest.resources.codegentest.Merchant getMerchant() {
		return merchant;
	}
	
	public void setMerchant(com.digitalml.rest.resources.codegentest.Merchant merchant) {
		this.merchant = merchant;
	}

	public Array getRentalListing() {
		return rentalListing;
	}
	
	public void setRentalListing(Array rentalListing) {
		this.rentalListing = rentalListing;
	}
}