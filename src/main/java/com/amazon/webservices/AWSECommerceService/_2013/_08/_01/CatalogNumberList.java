package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for CatalogNumberList:
{
  "enum": [],
  "type": "object",
  "properties": {
    "CatalogNumberListElement": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
*/


public class CatalogNumberList {

	@Size(max=1)
	private List<String> catalogNumberListElement;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    catalogNumberListElement = new ArrayList<String>();
	}

	public List<String> getCatalogNumberListElement() {
		return catalogNumberListElement;
	}
	
	public void setCatalogNumberListElement(List<String> catalogNumberListElement) {
		this.catalogNumberListElement = catalogNumberListElement;
	}
}