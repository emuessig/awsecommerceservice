package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for SimilarityLookupRequest:
{
  "type": "object",
  "properties": {
    "Condition": {
      "enum": [
        "All",
        "New",
        "Used",
        "Collectible",
        "Refurbished"
      ],
      "type": "string"
    },
    "ItemId": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "MerchantId": {
      "type": "string"
    },
    "ResponseGroup": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "SimilarityType": {
      "enum": [
        "Intersection",
        "Random"
      ],
      "type": "string"
    }
  }
}
*/


public class SimilarityLookupRequest {
	public enum Condition {
		All,New,Used,Collectible,Refurbished
	}
	public enum SimilarityType {
		Intersection,Random
	}

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookupRequest.Condition condition;

	@Size(max=1)
	private List<String> itemId;

	@Size(max=1)
	private String merchantId;

	@Size(max=1)
	private List<String> responseGroup;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookupRequest.SimilarityType similarityType;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    condition = null;
	    itemId = new ArrayList<String>();
	    merchantId = null;
	    responseGroup = new ArrayList<String>();
	    similarityType = null;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookupRequest.Condition getCondition() {
		return condition;
	}
	
	public void setCondition(com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookupRequest.Condition condition) {
		this.condition = condition;
	}

	public List<String> getItemId() {
		return itemId;
	}
	
	public void setItemId(List<String> itemId) {
		this.itemId = itemId;
	}

	public String getMerchantId() {
		return merchantId;
	}
	
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<String> getResponseGroup() {
		return responseGroup;
	}
	
	public void setResponseGroup(List<String> responseGroup) {
		this.responseGroup = responseGroup;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookupRequest.SimilarityType getSimilarityType() {
		return similarityType;
	}
	
	public void setSimilarityType(com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookupRequest.SimilarityType similarityType) {
		this.similarityType = similarityType;
	}
}