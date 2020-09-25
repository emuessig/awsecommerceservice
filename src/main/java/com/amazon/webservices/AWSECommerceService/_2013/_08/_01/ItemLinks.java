package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for ItemLinks:
{
  "enum": [],
  "type": "object",
  "properties": {
    "ItemLink": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "ItemLink"
      }
    }
  }
}
*/


public class ItemLinks {

	@Size(max=1)
	private Array itemLink;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    itemLink = new ArrayList<ItemLink>();
	}

	public Array getItemLink() {
		return itemLink;
	}
	
	public void setItemLink(Array itemLink) {
		this.itemLink = itemLink;
	}
}