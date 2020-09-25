package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for SimilarityLookupResponse:
{
  "type": "object",
  "properties": {
    "OperationRequest": {
      "$ref": "OperationRequest"
    },
    "Items": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "Items"
      }
    }
  }
}
*/


public class SimilarityLookupResponse {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.OperationRequest operationRequest;

	@Size(max=1)
	private Array items;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    operationRequest = null;
	    items = new ArrayList<Items>();
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.OperationRequest getOperationRequest() {
		return operationRequest;
	}
	
	public void setOperationRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.OperationRequest operationRequest) {
		this.operationRequest = operationRequest;
	}

	public Array getItems() {
		return items;
	}
	
	public void setItems(Array items) {
		this.items = items;
	}
}