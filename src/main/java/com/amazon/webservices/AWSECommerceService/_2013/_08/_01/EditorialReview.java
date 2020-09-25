package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for EditorialReview:
{
  "type": "object",
  "properties": {
    "Source": {
      "type": "string"
    },
    "Content": {
      "type": "string"
    },
    "IsLinkSuppressed": {
      "type": "boolean"
    }
  }
}
*/


public class EditorialReview {

	@Size(max=1)
	private String source;

	@Size(max=1)
	private String content;

	@Size(max=1)
	private boolean isLinkSuppressed;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    source = null;
	    content = null;
	    
	}

	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}

	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}

	public boolean getIsLinkSuppressed() {
		return isLinkSuppressed;
	}
	
	public void setIsLinkSuppressed(boolean isLinkSuppressed) {
		this.isLinkSuppressed = isLinkSuppressed;
	}
}