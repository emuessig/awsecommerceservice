package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for BrowseNodes:
{
  "type": "object",
  "properties": {
    "Request": {
      "$ref": "Request"
    },
    "BrowseNode": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "BrowseNode"
      }
    }
  }
}
*/


public class BrowseNodes {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Request request;

	@Size(max=1)
	private Array browseNode;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    request = null;
	    browseNode = new ArrayList<BrowseNode>();
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Request getRequest() {
		return request;
	}
	
	public void setRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.Request request) {
		this.request = request;
	}

	public Array getBrowseNode() {
		return browseNode;
	}
	
	public void setBrowseNode(Array browseNode) {
		this.browseNode = browseNode;
	}
}