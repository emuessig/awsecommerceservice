package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Offer:
{
  "type": "object",
  "properties": {
    "Merchant": {
      "$ref": "Merchant"
    },
    "OfferAttributes": {
      "$ref": "OfferAttributes"
    },
    "OfferListing": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "OfferListing"
      }
    },
    "LoyaltyPoints": {
      "$ref": "LoyaltyPoints"
    },
    "Promotions": {
      "$ref": "Promotions"
    }
  }
}
*/


public class Offer {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Merchant merchant;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.OfferAttributes offerAttributes;

	@Size(max=1)
	private Array offerListing;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.LoyaltyPoints loyaltyPoints;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Promotions promotions;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    merchant = null;
	    offerAttributes = null;
	    offerListing = new ArrayList<OfferListing>();
	    loyaltyPoints = null;
	    promotions = null;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Merchant getMerchant() {
		return merchant;
	}
	
	public void setMerchant(com.amazon.webservices.AWSECommerceService._2013._08._01.Merchant merchant) {
		this.merchant = merchant;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.OfferAttributes getOfferAttributes() {
		return offerAttributes;
	}
	
	public void setOfferAttributes(com.amazon.webservices.AWSECommerceService._2013._08._01.OfferAttributes offerAttributes) {
		this.offerAttributes = offerAttributes;
	}

	public Array getOfferListing() {
		return offerListing;
	}
	
	public void setOfferListing(Array offerListing) {
		this.offerListing = offerListing;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.LoyaltyPoints getLoyaltyPoints() {
		return loyaltyPoints;
	}
	
	public void setLoyaltyPoints(com.amazon.webservices.AWSECommerceService._2013._08._01.LoyaltyPoints loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Promotions getPromotions() {
		return promotions;
	}
	
	public void setPromotions(com.amazon.webservices.AWSECommerceService._2013._08._01.Promotions promotions) {
		this.promotions = promotions;
	}
}