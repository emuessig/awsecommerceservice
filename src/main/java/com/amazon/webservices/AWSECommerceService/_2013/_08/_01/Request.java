package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Request:
{
  "enum": [],
  "type": "object",
  "properties": {
    "IsValid": {
      "type": "string"
    },
    "BrowseNodeLookupRequest": {
      "$ref": "BrowseNodeLookupRequest"
    },
    "ItemSearchRequest": {
      "$ref": "ItemSearchRequest"
    },
    "ItemLookupRequest": {
      "$ref": "ItemLookupRequest"
    },
    "SimilarityLookupRequest": {
      "$ref": "SimilarityLookupRequest"
    },
    "CartGetRequest": {
      "$ref": "CartGetRequest"
    },
    "CartAddRequest": {
      "$ref": "CartAddRequest"
    },
    "CartCreateRequest": {
      "$ref": "CartCreateRequest"
    },
    "CartModifyRequest": {
      "$ref": "CartModifyRequest"
    },
    "CartClearRequest": {
      "$ref": "CartClearRequest"
    },
    "Errors": {
      "$ref": "Errors"
    }
  }
}
*/


public class Request {

	@Size(max=1)
	private String isValid;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNodeLookupRequest browseNodeLookupRequest;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest itemSearchRequest;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookupRequest itemLookupRequest;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookupRequest similarityLookupRequest;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.CartGetRequest cartGetRequest;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.CartAddRequest cartAddRequest;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.CartCreateRequest cartCreateRequest;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.CartModifyRequest cartModifyRequest;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.CartClearRequest cartClearRequest;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Errors errors;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    isValid = null;
	    browseNodeLookupRequest = null;
	    itemSearchRequest = null;
	    itemLookupRequest = null;
	    similarityLookupRequest = null;
	    cartGetRequest = null;
	    cartAddRequest = null;
	    cartCreateRequest = null;
	    cartModifyRequest = null;
	    cartClearRequest = null;
	    errors = null;
	}

	public String getIsValid() {
		return isValid;
	}
	
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNodeLookupRequest getBrowseNodeLookupRequest() {
		return browseNodeLookupRequest;
	}
	
	public void setBrowseNodeLookupRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNodeLookupRequest browseNodeLookupRequest) {
		this.browseNodeLookupRequest = browseNodeLookupRequest;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest getItemSearchRequest() {
		return itemSearchRequest;
	}
	
	public void setItemSearchRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest itemSearchRequest) {
		this.itemSearchRequest = itemSearchRequest;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookupRequest getItemLookupRequest() {
		return itemLookupRequest;
	}
	
	public void setItemLookupRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookupRequest itemLookupRequest) {
		this.itemLookupRequest = itemLookupRequest;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookupRequest getSimilarityLookupRequest() {
		return similarityLookupRequest;
	}
	
	public void setSimilarityLookupRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookupRequest similarityLookupRequest) {
		this.similarityLookupRequest = similarityLookupRequest;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.CartGetRequest getCartGetRequest() {
		return cartGetRequest;
	}
	
	public void setCartGetRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.CartGetRequest cartGetRequest) {
		this.cartGetRequest = cartGetRequest;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.CartAddRequest getCartAddRequest() {
		return cartAddRequest;
	}
	
	public void setCartAddRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.CartAddRequest cartAddRequest) {
		this.cartAddRequest = cartAddRequest;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.CartCreateRequest getCartCreateRequest() {
		return cartCreateRequest;
	}
	
	public void setCartCreateRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.CartCreateRequest cartCreateRequest) {
		this.cartCreateRequest = cartCreateRequest;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.CartModifyRequest getCartModifyRequest() {
		return cartModifyRequest;
	}
	
	public void setCartModifyRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.CartModifyRequest cartModifyRequest) {
		this.cartModifyRequest = cartModifyRequest;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.CartClearRequest getCartClearRequest() {
		return cartClearRequest;
	}
	
	public void setCartClearRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.CartClearRequest cartClearRequest) {
		this.cartClearRequest = cartClearRequest;
	}

	public com.digitalml.rest.resources.codegentest.Errors getErrors() {
		return errors;
	}
	
	public void setErrors(com.digitalml.rest.resources.codegentest.Errors errors) {
		this.errors = errors;
	}
}