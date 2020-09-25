package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for VariationAttributes:
{
  "enum": [],
  "type": "object",
  "properties": {
    "VariationAttribute": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "VariationAttribute"
      }
    }
  }
}
*/


public class VariationAttributes {

	@Size(max=1)
	private Array variationAttribute;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    variationAttribute = new ArrayList<VariationAttribute>();
	}

	public Array getVariationAttribute() {
		return variationAttribute;
	}
	
	public void setVariationAttribute(Array variationAttribute) {
		this.variationAttribute = variationAttribute;
	}
}