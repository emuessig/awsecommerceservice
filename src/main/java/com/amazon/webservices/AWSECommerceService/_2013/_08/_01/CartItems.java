package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for CartItems:
{
  "required": [
    "CartItem"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "SubTotal": {
      "$ref": "Price"
    },
    "CartItem": {
      "minItems": 1,
      "type": "array",
      "items": {
        "$ref": "CartItem"
      }
    }
  }
}
*/


public class CartItems {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price subTotal;

	private List<com.amazon.webservices.AWSECommerceService._2013._08._01.CartItem> cartItem;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    subTotal = null;
	    cartItem = new ArrayList<com.amazon.webservices.AWSECommerceService._2013._08._01.CartItem>();
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getSubTotal() {
		return subTotal;
	}
	
	public void setSubTotal(com.amazon.webservices.AWSECommerceService._2013._08._01.Price subTotal) {
		this.subTotal = subTotal;
	}

	public List<com.amazon.webservices.AWSECommerceService._2013._08._01.CartItem> getCartItem() {
		return cartItem;
	}
	
	public void setCartItem(List<com.amazon.webservices.AWSECommerceService._2013._08._01.CartItem> cartItem) {
		this.cartItem = cartItem;
	}
}