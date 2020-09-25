package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for LoyaltyPoints:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Points": {
      "type": "integer"
    },
    "TypicalRedemptionValue": {
      "$ref": "Price"
    }
  }
}
*/


public class LoyaltyPoints {

	@Size(max=1)
	private int points;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price typicalRedemptionValue;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    
	    typicalRedemptionValue = null;
	}

	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getTypicalRedemptionValue() {
		return typicalRedemptionValue;
	}
	
	public void setTypicalRedemptionValue(com.amazon.webservices.AWSECommerceService._2013._08._01.Price typicalRedemptionValue) {
		this.typicalRedemptionValue = typicalRedemptionValue;
	}
}