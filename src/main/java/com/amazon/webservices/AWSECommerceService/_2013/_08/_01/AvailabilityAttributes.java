package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for AvailabilityAttributes:
{
  "enum": [],
  "type": "object",
  "properties": {
    "AvailabilityType": {
      "type": "string"
    },
    "IsPreorder": {
      "type": "boolean"
    },
    "MinimumHours": {
      "type": "integer"
    },
    "MaximumHours": {
      "type": "integer"
    }
  }
}
*/


public class AvailabilityAttributes {

	@Size(max=1)
	private String availabilityType;

	@Size(max=1)
	private boolean isPreorder;

	@Size(max=1)
	private int minimumHours;

	@Size(max=1)
	private int maximumHours;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    availabilityType = null;
	    
	    
	    
	}

	public String getAvailabilityType() {
		return availabilityType;
	}
	
	public void setAvailabilityType(String availabilityType) {
		this.availabilityType = availabilityType;
	}

	public boolean getIsPreorder() {
		return isPreorder;
	}
	
	public void setIsPreorder(boolean isPreorder) {
		this.isPreorder = isPreorder;
	}

	public int getMinimumHours() {
		return minimumHours;
	}
	
	public void setMinimumHours(int minimumHours) {
		this.minimumHours = minimumHours;
	}

	public int getMaximumHours() {
		return maximumHours;
	}
	
	public void setMaximumHours(int maximumHours) {
		this.maximumHours = maximumHours;
	}
}