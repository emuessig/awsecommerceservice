package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for OperationRequest:
{
  "enum": [],
  "type": "object",
  "properties": {
    "HTTPHeaders": {
      "$ref": "HTTPHeaders"
    },
    "RequestId": {
      "type": "string"
    },
    "Arguments": {
      "$ref": "Arguments"
    },
    "Errors": {
      "$ref": "Errors"
    },
    "RequestProcessingTime": {
      "type": "number",
      "format": "float"
    }
  }
}
*/


public class OperationRequest {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.HTTPHeaders hTTPHeaders;

	@Size(max=1)
	private String requestId;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Arguments arguments;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Errors errors;

	@Size(max=1)
	private Float requestProcessingTime;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    hTTPHeaders = null;
	    requestId = null;
	    arguments = null;
	    errors = null;
	    
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.HTTPHeaders getHTTPHeaders() {
		return hTTPHeaders;
	}
	
	public void setHTTPHeaders(com.amazon.webservices.AWSECommerceService._2013._08._01.HTTPHeaders hTTPHeaders) {
		this.hTTPHeaders = hTTPHeaders;
	}

	public String getRequestId() {
		return requestId;
	}
	
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Arguments getArguments() {
		return arguments;
	}
	
	public void setArguments(com.amazon.webservices.AWSECommerceService._2013._08._01.Arguments arguments) {
		this.arguments = arguments;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Errors getErrors() {
		return errors;
	}
	
	public void setErrors(com.amazon.webservices.AWSECommerceService._2013._08._01.Errors errors) {
		this.errors = errors;
	}

	public Float getRequestProcessingTime() {
		return requestProcessingTime;
	}
	
	public void setRequestProcessingTime(Float requestProcessingTime) {
		this.requestProcessingTime = requestProcessingTime;
	}
}