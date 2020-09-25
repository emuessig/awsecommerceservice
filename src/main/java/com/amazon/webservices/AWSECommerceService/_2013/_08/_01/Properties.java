package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Properties:
{
  "required": [
    "Property"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "Property": {
      "minItems": 1,
      "type": "array",
      "items": {
        "$ref": "Property"
      }
    }
  }
}
*/


public class Properties {

	private Array property;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    property = new ArrayList<Property>();
	}

	public Array getProperty() {
		return property;
	}
	
	public void setProperty(Array property) {
		this.property = property;
	}
}