package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Promotions:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Promotion": {
      "$ref": "Promotion"
    }
  }
}
*/


public class Promotions {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Promotion promotion;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    promotion = null;
	}

	public com.digitalml.rest.resources.codegentest.Promotion getPromotion() {
		return promotion;
	}
	
	public void setPromotion(com.digitalml.rest.resources.codegentest.Promotion promotion) {
		this.promotion = promotion;
	}
}