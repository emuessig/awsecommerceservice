package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for SavedForLaterItems:
{
  "required": [
    "SavedForLaterItem"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "SubTotal": {
      "$ref": "Price"
    },
    "SavedForLaterItem": {
      "minItems": 1,
      "type": "array",
      "items": {
        "$ref": "CartItem"
      }
    }
  }
}
*/


public class SavedForLaterItems {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price subTotal;

	private List<com.digitalml.rest.resources.codegentest.SavedForLaterItem> savedForLaterItem;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    subTotal = null;
	    savedForLaterItem = new ArrayList<com.digitalml.rest.resources.codegentest.SavedForLaterItem>();
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getSubTotal() {
		return subTotal;
	}
	
	public void setSubTotal(com.amazon.webservices.AWSECommerceService._2013._08._01.Price subTotal) {
		this.subTotal = subTotal;
	}

	public List<com.digitalml.rest.resources.codegentest.SavedForLaterItem> getSavedForLaterItem() {
		return savedForLaterItem;
	}
	
	public void setSavedForLaterItem(List<com.digitalml.rest.resources.codegentest.SavedForLaterItem> savedForLaterItem) {
		this.savedForLaterItem = savedForLaterItem;
	}
}