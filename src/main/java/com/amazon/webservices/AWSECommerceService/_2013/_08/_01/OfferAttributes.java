package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for OfferAttributes:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Condition": {
      "type": "string"
    }
  }
}
*/


public class OfferAttributes {

	@Size(max=1)
	private String condition;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    condition = null;
	}

	public String getCondition() {
		return condition;
	}
	
	public void setCondition(String condition) {
		this.condition = condition;
	}
}