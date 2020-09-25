package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for CartItem:
{
  "required": [
    "CartItemId",
    "Quantity"
  ],
  "type": "object",
  "properties": {
    "CartItemId": {
      "type": "string"
    },
    "ASIN": {
      "type": "string"
    },
    "SellerNickname": {
      "type": "string"
    },
    "Quantity": {
      "type": "string"
    },
    "Title": {
      "type": "string"
    },
    "ProductGroup": {
      "type": "string"
    },
    "MetaData": {
      "type": "object",
      "properties": {
        "KeyValuePair": {
          "minItems": 0,
          "type": "array",
          "items": {
            "required": [
              "Key",
              "Value"
            ],
            "type": "object",
            "properties": {
              "Key": {
                "type": "string"
              },
              "Value": {
                "type": "string"
              }
            }
          }
        }
      }
    },
    "Price": {
      "$ref": "Price"
    },
    "ItemTotal": {
      "$ref": "Price"
    }
  }
}
*/


public class CartItem {

	@Size(max=1)
	@NotNull
	private String cartItemId;

	@Size(max=1)
	private String aSIN;

	@Size(max=1)
	private String sellerNickname;

	@Size(max=1)
	@NotNull
	private String quantity;

	@Size(max=1)
	private String title;

	@Size(max=1)
	private String productGroup;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.MetaData metaData;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price price;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price itemTotal;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    cartItemId = org.apache.commons.lang3.StringUtils.EMPTY;
	    aSIN = null;
	    sellerNickname = null;
	    quantity = org.apache.commons.lang3.StringUtils.EMPTY;
	    title = null;
	    productGroup = null;
	    metaData = null;
	    price = null;
	    itemTotal = null;
	}

	public String getCartItemId() {
		return cartItemId;
	}
	
	public void setCartItemId(String cartItemId) {
		this.cartItemId = cartItemId;
	}

	public String getASIN() {
		return aSIN;
	}
	
	public void setASIN(String aSIN) {
		this.aSIN = aSIN;
	}

	public String getSellerNickname() {
		return sellerNickname;
	}
	
	public void setSellerNickname(String sellerNickname) {
		this.sellerNickname = sellerNickname;
	}

	public String getQuantity() {
		return quantity;
	}
	
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getProductGroup() {
		return productGroup;
	}
	
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.MetaData getMetaData() {
		return metaData;
	}
	
	public void setMetaData(com.amazon.webservices.AWSECommerceService._2013._08._01.MetaData metaData) {
		this.metaData = metaData;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getPrice() {
		return price;
	}
	
	public void setPrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price price) {
		this.price = price;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getItemTotal() {
		return itemTotal;
	}
	
	public void setItemTotal(com.amazon.webservices.AWSECommerceService._2013._08._01.Price itemTotal) {
		this.itemTotal = itemTotal;
	}
}