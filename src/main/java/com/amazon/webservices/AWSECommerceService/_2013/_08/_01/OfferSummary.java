package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for OfferSummary:
{
  "enum": [],
  "type": "object",
  "properties": {
    "LowestNewPrice": {
      "$ref": "Price"
    },
    "LowestUsedPrice": {
      "$ref": "Price"
    },
    "LowestCollectiblePrice": {
      "$ref": "Price"
    },
    "LowestRefurbishedPrice": {
      "$ref": "Price"
    },
    "TotalNew": {
      "type": "string"
    },
    "TotalUsed": {
      "type": "string"
    },
    "TotalCollectible": {
      "type": "string"
    },
    "TotalRefurbished": {
      "type": "string"
    }
  }
}
*/


public class OfferSummary {

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestNewPrice;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestUsedPrice;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestCollectiblePrice;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestRefurbishedPrice;

	@Size(max=1)
	private String totalNew;

	@Size(max=1)
	private String totalUsed;

	@Size(max=1)
	private String totalCollectible;

	@Size(max=1)
	private String totalRefurbished;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    lowestNewPrice = null;
	    lowestUsedPrice = null;
	    lowestCollectiblePrice = null;
	    lowestRefurbishedPrice = null;
	    totalNew = null;
	    totalUsed = null;
	    totalCollectible = null;
	    totalRefurbished = null;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getLowestNewPrice() {
		return lowestNewPrice;
	}
	
	public void setLowestNewPrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestNewPrice) {
		this.lowestNewPrice = lowestNewPrice;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getLowestUsedPrice() {
		return lowestUsedPrice;
	}
	
	public void setLowestUsedPrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestUsedPrice) {
		this.lowestUsedPrice = lowestUsedPrice;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getLowestCollectiblePrice() {
		return lowestCollectiblePrice;
	}
	
	public void setLowestCollectiblePrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestCollectiblePrice) {
		this.lowestCollectiblePrice = lowestCollectiblePrice;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getLowestRefurbishedPrice() {
		return lowestRefurbishedPrice;
	}
	
	public void setLowestRefurbishedPrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price lowestRefurbishedPrice) {
		this.lowestRefurbishedPrice = lowestRefurbishedPrice;
	}

	public String getTotalNew() {
		return totalNew;
	}
	
	public void setTotalNew(String totalNew) {
		this.totalNew = totalNew;
	}

	public String getTotalUsed() {
		return totalUsed;
	}
	
	public void setTotalUsed(String totalUsed) {
		this.totalUsed = totalUsed;
	}

	public String getTotalCollectible() {
		return totalCollectible;
	}
	
	public void setTotalCollectible(String totalCollectible) {
		this.totalCollectible = totalCollectible;
	}

	public String getTotalRefurbished() {
		return totalRefurbished;
	}
	
	public void setTotalRefurbished(String totalRefurbished) {
		this.totalRefurbished = totalRefurbished;
	}
}