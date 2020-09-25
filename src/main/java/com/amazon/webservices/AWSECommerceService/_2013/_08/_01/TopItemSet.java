package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for TopItemSet:
{
  "required": [
    "TopItem"
  ],
  "type": "object",
  "properties": {
    "Type": {
      "type": "string"
    },
    "TopItem": {
      "minItems": 1,
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "ASIN": {
            "type": "string"
          },
          "Title": {
            "type": "string"
          },
          "DetailPageURL": {
            "type": "string"
          },
          "ProductGroup": {
            "type": "string"
          },
          "Author": {
            "minItems": 0,
            "type": "array",
            "items": {
              "type": "string"
            }
          },
          "Artist": {
            "minItems": 0,
            "type": "array",
            "items": {
              "type": "string"
            }
          },
          "Actor": {
            "minItems": 0,
            "type": "array",
            "items": {
              "type": "string"
            }
          }
        }
      }
    }
  }
}
*/


public class TopItemSet {

	@Size(max=1)
	private String type;

	private List<TopItem> topItem;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    type = null;
	    topItem = new ArrayList<TopItem>();
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public List<TopItem> getTopItem() {
		return topItem;
	}
	
	public void setTopItem(List<TopItem> topItem) {
		this.topItem = topItem;
	}
}