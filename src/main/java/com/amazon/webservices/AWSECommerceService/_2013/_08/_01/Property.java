package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Property:
{
  "type": "object",
  "properties": {
    "Name": {
      "type": "string"
    },
    "Value": {
      "type": "string"
    }
  }
}
*/


public class Property {

	@Size(max=1)
	private String name;

	@Size(max=1)
	private String value;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    name = null;
	    value = null;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}