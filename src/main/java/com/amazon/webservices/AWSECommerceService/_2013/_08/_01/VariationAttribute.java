package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for VariationAttribute:
{
  "required": [
    "Name",
    "Value"
  ],
  "type": "object",
  "properties": {
    "Name": {
      "type": "string"
    },
    "Value": {
      "minItems": 1,
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
*/


public class VariationAttribute {

	@Size(max=1)
	@NotNull
	private String name;

	private List<String> value;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    name = org.apache.commons.lang3.StringUtils.EMPTY;
	    value = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getValue() {
		return value;
	}
	
	public void setValue(List<String> value) {
		this.value = value;
	}
}