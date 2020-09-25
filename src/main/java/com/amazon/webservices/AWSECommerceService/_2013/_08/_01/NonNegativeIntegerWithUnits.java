package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for NonNegativeIntegerWithUnits:
{
  "required": [
    "Units"
  ],
  "type": "object",
  "properties": {
    "value": {
      "type": "integer"
    },
    "Units": {
      "type": "string"
    }
  }
}
*/


public class NonNegativeIntegerWithUnits {

	@Size(max=1)
	private int value;

	@Size(max=1)
	@NotNull
	private String units;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    
	    units = org.apache.commons.lang3.StringUtils.EMPTY;
	}

	public int getValue() {
		return nonNegativeInteger;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public String getUnits() {
		return units;
	}
	
	public void setUnits(String units) {
		this.units = units;
	}
}