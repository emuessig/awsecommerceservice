package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for CartClearRequest:
{
  "type": "object",
  "properties": {
    "CartId": {
      "type": "string"
    },
    "HMAC": {
      "type": "string"
    },
    "MergeCart": {
      "type": "string"
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


public class CartClearRequest {

	@Size(max=1)
	private String cartId;

	@Size(max=1)
	private String hMAC;

	@Size(max=1)
	private String mergeCart;

	@Size(max=1)
	private List<String> responseGroup;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    cartId = null;
	    hMAC = null;
	    mergeCart = null;
	    responseGroup = new ArrayList<String>();
	}

	public String getCartId() {
		return cartId;
	}
	
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public String getHMAC() {
		return hMAC;
	}
	
	public void setHMAC(String hMAC) {
		this.hMAC = hMAC;
	}

	public String getMergeCart() {
		return mergeCart;
	}
	
	public void setMergeCart(String mergeCart) {
		this.mergeCart = mergeCart;
	}

	public List<String> getResponseGroup() {
		return responseGroup;
	}
	
	public void setResponseGroup(List<String> responseGroup) {
		this.responseGroup = responseGroup;
	}
}