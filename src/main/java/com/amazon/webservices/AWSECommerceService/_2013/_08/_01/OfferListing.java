package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for OfferListing:
{
  "type": "object",
  "properties": {
    "OfferListingId": {
      "type": "string"
    },
    "PricePerUnit": {
      "type": "string"
    },
    "Price": {
      "$ref": "Price"
    },
    "SalePrice": {
      "$ref": "Price"
    },
    "AmountSaved": {
      "$ref": "Price"
    },
    "PercentageSaved": {
      "type": "integer"
    },
    "Availability": {
      "type": "string"
    },
    "AvailabilityAttributes": {
      "type": "object",
      "properties": {
        "AvailabilityType": {
          "type": "string"
        },
        "IsPreorder": {
          "type": "boolean"
        },
        "MinimumHours": {
          "type": "integer"
        },
        "MaximumHours": {
          "type": "integer"
        }
      }
    },
    "IsEligibleForSuperSaverShipping": {
      "type": "boolean"
    },
    "IsEligibleForPrimeFreeDigitalVideo": {
      "type": "boolean"
    },
    "IsEligibleForPrime": {
      "type": "boolean"
    }
  }
}
*/


public class OfferListing {

	@Size(max=1)
	private String offerListingId;

	@Size(max=1)
	private String pricePerUnit;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price price;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price salePrice;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price amountSaved;

	@Size(max=1)
	private int percentageSaved;

	@Size(max=1)
	private String availability;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.AvailabilityAttributes availabilityAttributes;

	@Size(max=1)
	private boolean isEligibleForSuperSaverShipping;

	@Size(max=1)
	private boolean isEligibleForPrimeFreeDigitalVideo;

	@Size(max=1)
	private boolean isEligibleForPrime;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    offerListingId = null;
	    pricePerUnit = null;
	    price = null;
	    salePrice = null;
	    amountSaved = null;
	    
	    availability = null;
	    availabilityAttributes = null;
	    
	    
	    
	}

	public String getOfferListingId() {
		return offerListingId;
	}
	
	public void setOfferListingId(String offerListingId) {
		this.offerListingId = offerListingId;
	}

	public String getPricePerUnit() {
		return pricePerUnit;
	}
	
	public void setPricePerUnit(String pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getPrice() {
		return price;
	}
	
	public void setPrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price price) {
		this.price = price;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getSalePrice() {
		return salePrice;
	}
	
	public void setSalePrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price salePrice) {
		this.salePrice = salePrice;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getAmountSaved() {
		return amountSaved;
	}
	
	public void setAmountSaved(com.amazon.webservices.AWSECommerceService._2013._08._01.Price amountSaved) {
		this.amountSaved = amountSaved;
	}

	public int getPercentageSaved() {
		return percentageSaved;
	}
	
	public void setPercentageSaved(int percentageSaved) {
		this.percentageSaved = percentageSaved;
	}

	public String getAvailability() {
		return availability;
	}
	
	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.AvailabilityAttributes getAvailabilityAttributes() {
		return availabilityAttributes;
	}
	
	public void setAvailabilityAttributes(com.amazon.webservices.AWSECommerceService._2013._08._01.AvailabilityAttributes availabilityAttributes) {
		this.availabilityAttributes = availabilityAttributes;
	}

	public boolean getIsEligibleForSuperSaverShipping() {
		return isEligibleForSuperSaverShipping;
	}
	
	public void setIsEligibleForSuperSaverShipping(boolean isEligibleForSuperSaverShipping) {
		this.isEligibleForSuperSaverShipping = isEligibleForSuperSaverShipping;
	}

	public boolean getIsEligibleForPrimeFreeDigitalVideo() {
		return isEligibleForPrimeFreeDigitalVideo;
	}
	
	public void setIsEligibleForPrimeFreeDigitalVideo(boolean isEligibleForPrimeFreeDigitalVideo) {
		this.isEligibleForPrimeFreeDigitalVideo = isEligibleForPrimeFreeDigitalVideo;
	}

	public boolean getIsEligibleForPrime() {
		return isEligibleForPrime;
	}
	
	public void setIsEligibleForPrime(boolean isEligibleForPrime) {
		this.isEligibleForPrime = isEligibleForPrime;
	}
}