package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for CartCreateRequest:
{
  "type": "object",
  "properties": {
    "MergeCart": {
      "type": "string"
    },
    "Items": {
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
              },
              "MetaData": {
                "minItems": 0,
                "type": "array",
                "items": {
                  "type": "object",
                  "properties": {
                    "Key": {
                      "type": "string"
                    },
                    "Value": {
                      "type": "string"
                    }
                  }
                }
              }
            }
          }
        }
      }
    },
    "ResponseGroup": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
*/


public class CartCreateRequest {

	@Size(max=1)
	private String mergeCart;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Items items;

	@Size(max=1)
	private List<String> responseGroup;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    mergeCart = null;
	    items = null;
	    responseGroup = new ArrayList<String>();
	}

	public String getMergeCart() {
		return mergeCart;
	}
	
	public void setMergeCart(String mergeCart) {
		this.mergeCart = mergeCart;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Items getItems() {
		return items;
	}
	
	public void setItems(com.amazon.webservices.AWSECommerceService._2013._08._01.Items items) {
		this.items = items;
	}

	public List<String> getResponseGroup() {
		return responseGroup;
	}
	
	public void setResponseGroup(List<String> responseGroup) {
		this.responseGroup = responseGroup;
	}
}