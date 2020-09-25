package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for BrowseNodeLookupRequest:
{
  "type": "object",
  "properties": {
    "BrowseNodeId": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "ResponseGroup": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
*/


public class BrowseNodeLookupRequest {

	@Size(max=1)
	private List<String> browseNodeId;

	@Size(max=1)
	private List<String> responseGroup;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    browseNodeId = new ArrayList<String>();
	    responseGroup = new ArrayList<String>();
	}

	public List<String> getBrowseNodeId() {
		return browseNodeId;
	}
	
	public void setBrowseNodeId(List<String> browseNodeId) {
		this.browseNodeId = browseNodeId;
	}

	public List<String> getResponseGroup() {
		return responseGroup;
	}
	
	public void setResponseGroup(List<String> responseGroup) {
		this.responseGroup = responseGroup;
	}
}