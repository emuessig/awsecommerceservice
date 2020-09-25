package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for CustomerReviews:
{
  "enum": [],
  "type": "object",
  "properties": {
    "IFrameURL": {
      "type": "string"
    },
    "HasReviews": {
      "type": "boolean"
    }
  }
}
*/


public class CustomerReviews {

	@Size(max=1)
	private String iFrameURL;

	@Size(max=1)
	private boolean hasReviews;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    iFrameURL = null;
	    
	}

	public String getIFrameURL() {
		return iFrameURL;
	}
	
	public void setIFrameURL(String iFrameURL) {
		this.iFrameURL = iFrameURL;
	}

	public boolean getHasReviews() {
		return hasReviews;
	}
	
	public void setHasReviews(boolean hasReviews) {
		this.hasReviews = hasReviews;
	}
}