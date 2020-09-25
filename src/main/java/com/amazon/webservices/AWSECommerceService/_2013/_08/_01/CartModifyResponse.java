package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for CartModifyResponse:
{
  "type": "object",
  "properties": {
    "OperationRequest": {
      "$ref": "OperationRequest"
    },
    "Cart": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "Cart"
      }
    }
  }
}
*/


public class CartModifyResponse {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.OperationRequest operationRequest;

	@Size(max=1)
	private Array cart;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    operationRequest = null;
	    cart = new ArrayList<Cart>();
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.OperationRequest getOperationRequest() {
		return operationRequest;
	}
	
	public void setOperationRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.OperationRequest operationRequest) {
		this.operationRequest = operationRequest;
	}

	public Array getCart() {
		return cart;
	}
	
	public void setCart(Array cart) {
		this.cart = cart;
	}
}