package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for BrowseNodeLookupResponse:
{
  "type": "object",
  "properties": {
    "OperationRequest": {
      "$ref": "OperationRequest"
    },
    "BrowseNodes": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "BrowseNodes"
      }
    }
  }
}
*/


public class BrowseNodeLookupResponse {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.OperationRequest operationRequest;

	@Size(max=1)
	private Array browseNodes;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    operationRequest = null;
	    browseNodes = new ArrayList<BrowseNodes>();
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.OperationRequest getOperationRequest() {
		return operationRequest;
	}
	
	public void setOperationRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.OperationRequest operationRequest) {
		this.operationRequest = operationRequest;
	}

	public Array getBrowseNodes() {
		return browseNodes;
	}
	
	public void setBrowseNodes(Array browseNodes) {
		this.browseNodes = browseNodes;
	}
}