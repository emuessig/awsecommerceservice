package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for ItemLink:
{
  "type": "object",
  "properties": {
    "Description": {
      "type": "string"
    },
    "URL": {
      "type": "string"
    }
  }
}
*/


public class ItemLink {

	@Size(max=1)
	private String description;

	@Size(max=1)
	private String uRL;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    description = null;
	    uRL = null;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getURL() {
		return uRL;
	}
	
	public void setURL(String uRL) {
		this.uRL = uRL;
	}
}