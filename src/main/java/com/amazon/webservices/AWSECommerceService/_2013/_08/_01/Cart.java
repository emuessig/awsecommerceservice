package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Cart:
{
  "required": [
    "CartId",
    "HMAC",
    "URLEncodedHMAC"
  ],
  "type": "object",
  "properties": {
    "Request": {
      "$ref": "Request"
    },
    "CartId": {
      "type": "string"
    },
    "HMAC": {
      "type": "string"
    },
    "URLEncodedHMAC": {
      "type": "string"
    },
    "PurchaseURL": {
      "type": "string"
    },
    "MobileCartURL": {
      "type": "string"
    },
    "SubTotal": {
      "$ref": "Price"
    },
    "CartItems": {
      "$ref": "CartItems"
    },
    "SavedForLaterItems": {
      "$ref": "SavedForLaterItems"
    },
    "SimilarProducts": {
      "$ref": "SimilarProducts"
    },
    "TopSellers": {
      "$ref": "TopSellers"
    },
    "NewReleases": {
      "$ref": "NewReleases"
    },
    "SimilarViewedProducts": {
      "$ref": "SimilarViewedProducts"
    },
    "OtherCategoriesSimilarProducts": {
      "$ref": "OtherCategoriesSimilarProducts"
    }
  }
}
*/


public class Cart {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Request request;

	@Size(max=1)
	@NotNull
	private String cartId;

	@Size(max=1)
	@NotNull
	private String hMAC;

	@Size(max=1)
	@NotNull
	private String uRLEncodedHMAC;

	@Size(max=1)
	private String purchaseURL;

	@Size(max=1)
	private String mobileCartURL;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price subTotal;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.CartItems cartItems;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.SavedForLaterItems savedForLaterItems;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarProducts similarProducts;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.TopSellers topSellers;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.NewReleases newReleases;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarViewedProducts similarViewedProducts;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.OtherCategoriesSimilarProducts otherCategoriesSimilarProducts;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    request = null;
	    cartId = org.apache.commons.lang3.StringUtils.EMPTY;
	    hMAC = org.apache.commons.lang3.StringUtils.EMPTY;
	    uRLEncodedHMAC = org.apache.commons.lang3.StringUtils.EMPTY;
	    purchaseURL = null;
	    mobileCartURL = null;
	    subTotal = null;
	    cartItems = null;
	    savedForLaterItems = null;
	    similarProducts = null;
	    topSellers = null;
	    newReleases = null;
	    similarViewedProducts = null;
	    otherCategoriesSimilarProducts = null;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Request getRequest() {
		return request;
	}
	
	public void setRequest(com.amazon.webservices.AWSECommerceService._2013._08._01.Request request) {
		this.request = request;
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

	public String getURLEncodedHMAC() {
		return uRLEncodedHMAC;
	}
	
	public void setURLEncodedHMAC(String uRLEncodedHMAC) {
		this.uRLEncodedHMAC = uRLEncodedHMAC;
	}

	public String getPurchaseURL() {
		return purchaseURL;
	}
	
	public void setPurchaseURL(String purchaseURL) {
		this.purchaseURL = purchaseURL;
	}

	public String getMobileCartURL() {
		return mobileCartURL;
	}
	
	public void setMobileCartURL(String mobileCartURL) {
		this.mobileCartURL = mobileCartURL;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getSubTotal() {
		return subTotal;
	}
	
	public void setSubTotal(com.amazon.webservices.AWSECommerceService._2013._08._01.Price subTotal) {
		this.subTotal = subTotal;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.CartItems getCartItems() {
		return cartItems;
	}
	
	public void setCartItems(com.amazon.webservices.AWSECommerceService._2013._08._01.CartItems cartItems) {
		this.cartItems = cartItems;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.SavedForLaterItems getSavedForLaterItems() {
		return savedForLaterItems;
	}
	
	public void setSavedForLaterItems(com.amazon.webservices.AWSECommerceService._2013._08._01.SavedForLaterItems savedForLaterItems) {
		this.savedForLaterItems = savedForLaterItems;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarProducts getSimilarProducts() {
		return similarProducts;
	}
	
	public void setSimilarProducts(com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarProducts similarProducts) {
		this.similarProducts = similarProducts;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.TopSellers getTopSellers() {
		return topSellers;
	}
	
	public void setTopSellers(com.amazon.webservices.AWSECommerceService._2013._08._01.TopSellers topSellers) {
		this.topSellers = topSellers;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.NewReleases getNewReleases() {
		return newReleases;
	}
	
	public void setNewReleases(com.amazon.webservices.AWSECommerceService._2013._08._01.NewReleases newReleases) {
		this.newReleases = newReleases;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarViewedProducts getSimilarViewedProducts() {
		return similarViewedProducts;
	}
	
	public void setSimilarViewedProducts(com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarViewedProducts similarViewedProducts) {
		this.similarViewedProducts = similarViewedProducts;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.OtherCategoriesSimilarProducts getOtherCategoriesSimilarProducts() {
		return otherCategoriesSimilarProducts;
	}
	
	public void setOtherCategoriesSimilarProducts(com.amazon.webservices.AWSECommerceService._2013._08._01.OtherCategoriesSimilarProducts otherCategoriesSimilarProducts) {
		this.otherCategoriesSimilarProducts = otherCategoriesSimilarProducts;
	}
}