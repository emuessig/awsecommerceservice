package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Merchant:
{
  "type": "object",
  "properties": {
    "Name": {
      "type": "string"
    }
  }
}
*/


public class Merchant {

	@Size(max=1)
	private String name;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    name = null;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}