package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for RentalOffers:
{
  "enum": [],
  "type": "object",
  "properties": {
    "RentalOffer": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "RentalOffer"
      }
    }
  }
}
*/


public class RentalOffers {

	@Size(max=1)
	private Array rentalOffer;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    rentalOffer = new ArrayList<RentalOffer>();
	}

	public Array getRentalOffer() {
		return rentalOffer;
	}
	
	public void setRentalOffer(Array rentalOffer) {
		this.rentalOffer = rentalOffer;
	}
}