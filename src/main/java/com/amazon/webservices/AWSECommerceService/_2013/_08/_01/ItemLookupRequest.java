package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for ItemLookupRequest:
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
    "IdType": {
      "enum": [
        "ASIN",
        "UPC",
        "SKU",
        "EAN",
        "ISBN"
      ],
      "type": "string"
    },
    "MerchantId": {
      "type": "string"
    },
    "ItemId": {
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
    },
    "SearchIndex": {
      "type": "string"
    },
    "VariationPage": {
      "$ref": "positiveIntegerOrAll"
    },
    "RelatedItemPage": {
      "$ref": "positiveIntegerOrAll"
    },
    "RelationshipType": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "IncludeReviewsSummary": {
      "type": "string"
    },
    "TruncateReviewsAt": {
      "type": "integer"
    }
  }
}
*/


public class ItemLookupRequest {
	public enum Condition {
		All,New,Used,Collectible,Refurbished
	}
	public enum IdType {
		ASIN,UPC,SKU,EAN,ISBN
	}

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookupRequest.Condition condition;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookupRequest.IdType idType;

	@Size(max=1)
	private String merchantId;

	@Size(max=1)
	private List<String> itemId;

	@Size(max=1)
	private List<String> responseGroup;

	@Size(max=1)
	private String searchIndex;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.PositiveIntegerOrAll variationPage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.PositiveIntegerOrAll relatedItemPage;

	@Size(max=1)
	private List<String> relationshipType;

	@Size(max=1)
	private String includeReviewsSummary;

	@Size(max=1)
	private int truncateReviewsAt;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    condition = null;
	    idType = null;
	    merchantId = null;
	    itemId = new ArrayList<String>();
	    responseGroup = new ArrayList<String>();
	    searchIndex = null;
	    variationPage = null;
	    relatedItemPage = null;
	    relationshipType = new ArrayList<String>();
	    includeReviewsSummary = null;
	    
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookupRequest.Condition getCondition() {
		return condition;
	}
	
	public void setCondition(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookupRequest.Condition condition) {
		this.condition = condition;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookupRequest.IdType getIdType() {
		return idType;
	}
	
	public void setIdType(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookupRequest.IdType idType) {
		this.idType = idType;
	}

	public String getMerchantId() {
		return merchantId;
	}
	
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public List<String> getItemId() {
		return itemId;
	}
	
	public void setItemId(List<String> itemId) {
		this.itemId = itemId;
	}

	public List<String> getResponseGroup() {
		return responseGroup;
	}
	
	public void setResponseGroup(List<String> responseGroup) {
		this.responseGroup = responseGroup;
	}

	public String getSearchIndex() {
		return searchIndex;
	}
	
	public void setSearchIndex(String searchIndex) {
		this.searchIndex = searchIndex;
	}

	public com.digitalml.rest.resources.codegentest.PositiveIntegerOrAll getVariationPage() {
		return variationPage;
	}
	
	public void setVariationPage(com.digitalml.rest.resources.codegentest.PositiveIntegerOrAll variationPage) {
		this.variationPage = variationPage;
	}

	public com.digitalml.rest.resources.codegentest.PositiveIntegerOrAll getRelatedItemPage() {
		return relatedItemPage;
	}
	
	public void setRelatedItemPage(com.digitalml.rest.resources.codegentest.PositiveIntegerOrAll relatedItemPage) {
		this.relatedItemPage = relatedItemPage;
	}

	public List<String> getRelationshipType() {
		return relationshipType;
	}
	
	public void setRelationshipType(List<String> relationshipType) {
		this.relationshipType = relationshipType;
	}

	public String getIncludeReviewsSummary() {
		return includeReviewsSummary;
	}
	
	public void setIncludeReviewsSummary(String includeReviewsSummary) {
		this.includeReviewsSummary = includeReviewsSummary;
	}

	public int getTruncateReviewsAt() {
		return truncateReviewsAt;
	}
	
	public void setTruncateReviewsAt(int truncateReviewsAt) {
		this.truncateReviewsAt = truncateReviewsAt;
	}
}