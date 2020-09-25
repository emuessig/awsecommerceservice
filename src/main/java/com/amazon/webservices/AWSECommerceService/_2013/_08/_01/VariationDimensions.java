package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for VariationDimensions:
{
  "required": [
    "VariationDimension"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "VariationDimension": {
      "minItems": 1,
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
*/


public class VariationDimensions {

	private List<String> variationDimension;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    variationDimension = new ArrayList<String>();
	}

	public List<String> getVariationDimension() {
		return variationDimension;
	}
	
	public void setVariationDimension(List<String> variationDimension) {
		this.variationDimension = variationDimension;
	}
}