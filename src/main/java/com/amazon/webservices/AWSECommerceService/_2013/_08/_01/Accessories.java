package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Accessories:
{
  "required": [
    "Accessory"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "Accessory": {
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
          }
        }
      }
    }
  }
}
*/


public class Accessories {

	private List<Accessory> accessory;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    accessory = new ArrayList<Accessory>();
	}

	public List<Accessory> getAccessory() {
		return accessory;
	}
	
	public void setAccessory(List<Accessory> accessory) {
		this.accessory = accessory;
	}
}