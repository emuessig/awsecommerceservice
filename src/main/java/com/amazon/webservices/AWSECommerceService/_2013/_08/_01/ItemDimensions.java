package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for ItemDimensions:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Height": {
      "$ref": "DecimalWithUnits"
    },
    "Length": {
      "$ref": "DecimalWithUnits"
    },
    "Weight": {
      "$ref": "DecimalWithUnits"
    },
    "Width": {
      "$ref": "DecimalWithUnits"
    }
  }
}
*/


public class ItemDimensions {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits height;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits length;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits weight;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits width;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    height = null;
	    length = null;
	    weight = null;
	    width = null;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits getHeight() {
		return height;
	}
	
	public void setHeight(com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits height) {
		this.height = height;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits getLength() {
		return length;
	}
	
	public void setLength(com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits length) {
		this.length = length;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits getWeight() {
		return weight;
	}
	
	public void setWeight(com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits weight) {
		this.weight = weight;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits getWidth() {
		return width;
	}
	
	public void setWidth(com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits width) {
		this.width = width;
	}
}