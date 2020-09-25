package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Image:
{
  "required": [
    "Height",
    "URL",
    "Width"
  ],
  "type": "object",
  "properties": {
    "URL": {
      "type": "string"
    },
    "Height": {
      "$ref": "DecimalWithUnits"
    },
    "Width": {
      "$ref": "DecimalWithUnits"
    },
    "IsVerified": {
      "type": "string"
    }
  }
}
*/


public class Image {

	@Size(max=1)
	@NotNull
	private String uRL;

	@Size(max=1)
	@NotNull
	private com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits height;

	@Size(max=1)
	@NotNull
	private com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits width;

	@Size(max=1)
	private String isVerified;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    uRL = org.apache.commons.lang3.StringUtils.EMPTY;
	    height = null;
	    width = null;
	    isVerified = null;
	}

	public String getURL() {
		return uRL;
	}
	
	public void setURL(String uRL) {
		this.uRL = uRL;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits getHeight() {
		return height;
	}
	
	public void setHeight(com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits height) {
		this.height = height;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits getWidth() {
		return width;
	}
	
	public void setWidth(com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits width) {
		this.width = width;
	}

	public String getIsVerified() {
		return isVerified;
	}
	
	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}
}