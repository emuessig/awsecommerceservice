package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Variations:
{
  "enum": [],
  "type": "object",
  "properties": {
    "TotalVariations": {
      "type": "integer"
    },
    "TotalVariationPages": {
      "type": "integer"
    },
    "VariationDimensions": {
      "$ref": "VariationDimensions"
    },
    "Item": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "Item"
      }
    }
  }
}
*/


public class Variations {

	@Size(max=1)
	private int totalVariations;

	@Size(max=1)
	private int totalVariationPages;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.VariationDimensions variationDimensions;

	@Size(max=1)
	private List<com.amazon.webservices.AWSECommerceService._2013._08._01.Item> item;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    
	    
	    variationDimensions = null;
	    item = new ArrayList<com.amazon.webservices.AWSECommerceService._2013._08._01.Item>();
	}

	public int getTotalVariations() {
		return totalVariations;
	}
	
	public void setTotalVariations(int totalVariations) {
		this.totalVariations = totalVariations;
	}

	public int getTotalVariationPages() {
		return totalVariationPages;
	}
	
	public void setTotalVariationPages(int totalVariationPages) {
		this.totalVariationPages = totalVariationPages;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.VariationDimensions getVariationDimensions() {
		return variationDimensions;
	}
	
	public void setVariationDimensions(com.amazon.webservices.AWSECommerceService._2013._08._01.VariationDimensions variationDimensions) {
		this.variationDimensions = variationDimensions;
	}

	public List<com.amazon.webservices.AWSECommerceService._2013._08._01.Item> getItem() {
		return item;
	}
	
	public void setItem(List<com.amazon.webservices.AWSECommerceService._2013._08._01.Item> item) {
		this.item = item;
	}
}