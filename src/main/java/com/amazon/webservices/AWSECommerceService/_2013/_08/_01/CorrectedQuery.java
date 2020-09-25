package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for CorrectedQuery:
{
  "type": "object",
  "properties": {
    "Keywords": {
      "type": "string"
    },
    "Message": {
      "type": "string"
    }
  }
}
*/


public class CorrectedQuery {

	@Size(max=1)
	private String keywords;

	@Size(max=1)
	private String message;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    keywords = null;
	    message = null;
	}

	public String getKeywords() {
		return keywords;
	}
	
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}