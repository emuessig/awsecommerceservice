package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for EANList:
{
  "enum": [],
  "type": "object",
  "properties": {
    "EANListElement": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
*/


public class EANList {

	@Size(max=1)
	private List<String> eANListElement;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    eANListElement = new ArrayList<String>();
	}

	public List<String> getEANListElement() {
		return eANListElement;
	}
	
	public void setEANListElement(List<String> eANListElement) {
		this.eANListElement = eANListElement;
	}
}