package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for DecimalWithUnits:
{
  "required": [
    "Units"
  ],
  "type": "object",
  "properties": {
    "value": {
      "type": "number",
      "format": "decimal"
    },
    "Units": {
      "type": "string"
    }
  }
}
*/


public class DecimalWithUnits {

	@Size(max=1)
	private double value;

	@Size(max=1)
	@NotNull
	private String units;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    
	    units = org.apache.commons.lang3.StringUtils.EMPTY;
	}

	public double getValue() {
		return decimal;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

	public String getUnits() {
		return units;
	}
	
	public void setUnits(String units) {
		this.units = units;
	}
}