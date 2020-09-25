package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for ItemSearch:
{
  "type": "object",
  "properties": {
    "MarketplaceDomain": {
      "type": "string"
    },
    "AWSAccessKeyId": {
      "type": "string"
    },
    "AssociateTag": {
      "type": "string"
    },
    "XMLEscaping": {
      "type": "string"
    },
    "Validate": {
      "type": "string"
    },
    "Shared": {
      "$ref": "ItemSearchRequest"
    },
    "Request": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "ItemSearchRequest"
      }
    }
  }
}
*/


public class ItemSearch {

	@Size(max=1)
	private String marketplaceDomain;

	@Size(max=1)
	private String aWSAccessKeyId;

	@Size(max=1)
	private String associateTag;

	@Size(max=1)
	private String xMLEscaping;

	@Size(max=1)
	private String validate;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest shared;

	@Size(max=1)
	private List<com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest> request;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    marketplaceDomain = null;
	    aWSAccessKeyId = null;
	    associateTag = null;
	    xMLEscaping = null;
	    validate = null;
	    shared = null;
	    request = new ArrayList<com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest>();
	}

	public String getMarketplaceDomain() {
		return marketplaceDomain;
	}
	
	public void setMarketplaceDomain(String marketplaceDomain) {
		this.marketplaceDomain = marketplaceDomain;
	}

	public String getAWSAccessKeyId() {
		return aWSAccessKeyId;
	}
	
	public void setAWSAccessKeyId(String aWSAccessKeyId) {
		this.aWSAccessKeyId = aWSAccessKeyId;
	}

	public String getAssociateTag() {
		return associateTag;
	}
	
	public void setAssociateTag(String associateTag) {
		this.associateTag = associateTag;
	}

	public String getXMLEscaping() {
		return xMLEscaping;
	}
	
	public void setXMLEscaping(String xMLEscaping) {
		this.xMLEscaping = xMLEscaping;
	}

	public String getValidate() {
		return validate;
	}
	
	public void setValidate(String validate) {
		this.validate = validate;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest getShared() {
		return shared;
	}
	
	public void setShared(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest shared) {
		this.shared = shared;
	}

	public List<com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest> getRequest() {
		return request;
	}
	
	public void setRequest(List<com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest> request) {
		this.request = request;
	}
}