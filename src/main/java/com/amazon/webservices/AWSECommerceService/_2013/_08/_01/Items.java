package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Items:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Item": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "ASIN": {
            "type": "string"
          },
          "OfferListingId": {
            "type": "string"
          },
          "Quantity": {
            "minimum": 0,
            "type": "integer"
          },
          "AssociateTag": {
            "type": "string"
          },
          "ListItemId": {
            "type": "string"
          }
        }
      }
    }
  }
}
*/


public class Items {

	@Size(max=1)
	private List<Item> item;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    item = new ArrayList<Item>();
	}

	public List<Item> getItem() {
		return item;
	}
	
	public void setItem(List<Item> item) {
		this.item = item;
	}
}