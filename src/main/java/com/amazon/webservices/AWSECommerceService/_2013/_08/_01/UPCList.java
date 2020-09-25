package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for UPCList:
{
  "enum": [],
  "type": "object",
  "properties": {
    "UPCListElement": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
*/


public class UPCList {

	@Size(max=1)
	private List<String> uPCListElement;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    uPCListElement = new ArrayList<String>();
	}

	public List<String> getUPCListElement() {
		return uPCListElement;
	}
	
	public void setUPCListElement(List<String> uPCListElement) {
		this.uPCListElement = uPCListElement;
	}
}