package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Offers:
{
  "enum": [],
  "type": "object",
  "properties": {
    "TotalOffers": {
      "type": "integer"
    },
    "TotalOfferPages": {
      "type": "integer"
    },
    "MoreOffersUrl": {
      "type": "string"
    },
    "Offer": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "Offer"
      }
    }
  }
}
*/


public class Offers {

	@Size(max=1)
	private int totalOffers;

	@Size(max=1)
	private int totalOfferPages;

	@Size(max=1)
	private String moreOffersUrl;

	@Size(max=1)
	private Array offer;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    
	    
	    moreOffersUrl = null;
	    offer = new ArrayList<Offer>();
	}

	public int getTotalOffers() {
		return totalOffers;
	}
	
	public void setTotalOffers(int totalOffers) {
		this.totalOffers = totalOffers;
	}

	public int getTotalOfferPages() {
		return totalOfferPages;
	}
	
	public void setTotalOfferPages(int totalOfferPages) {
		this.totalOfferPages = totalOfferPages;
	}

	public String getMoreOffersUrl() {
		return moreOffersUrl;
	}
	
	public void setMoreOffersUrl(String moreOffersUrl) {
		this.moreOffersUrl = moreOffersUrl;
	}

	public Array getOffer() {
		return offer;
	}
	
	public void setOffer(Array offer) {
		this.offer = offer;
	}
}