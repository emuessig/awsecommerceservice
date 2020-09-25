package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Summary:
{
  "required": [
    "PromotionId"
  ],
  "type": "object",
  "properties": {
    "PromotionId": {
      "type": "string"
    },
    "Message": {
      "type": "string"
    },
    "Category": {
      "type": "string"
    },
    "StartDate": {
      "type": "string"
    },
    "EndDate": {
      "type": "string"
    },
    "EligibilityRequirementDescription": {
      "type": "string"
    },
    "BenefitDescription": {
      "type": "string"
    },
    "TermsAndConditions": {
      "type": "string"
    }
  }
}
*/


public class Summary {

	@Size(max=1)
	@NotNull
	private String promotionId;

	@Size(max=1)
	private String message;

	@Size(max=1)
	private String category;

	@Size(max=1)
	private String startDate;

	@Size(max=1)
	private String endDate;

	@Size(max=1)
	private String eligibilityRequirementDescription;

	@Size(max=1)
	private String benefitDescription;

	@Size(max=1)
	private String termsAndConditions;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    promotionId = org.apache.commons.lang3.StringUtils.EMPTY;
	    message = null;
	    category = null;
	    startDate = null;
	    endDate = null;
	    eligibilityRequirementDescription = null;
	    benefitDescription = null;
	    termsAndConditions = null;
	}

	public String getPromotionId() {
		return promotionId;
	}
	
	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEligibilityRequirementDescription() {
		return eligibilityRequirementDescription;
	}
	
	public void setEligibilityRequirementDescription(String eligibilityRequirementDescription) {
		this.eligibilityRequirementDescription = eligibilityRequirementDescription;
	}

	public String getBenefitDescription() {
		return benefitDescription;
	}
	
	public void setBenefitDescription(String benefitDescription) {
		this.benefitDescription = benefitDescription;
	}

	public String getTermsAndConditions() {
		return termsAndConditions;
	}
	
	public void setTermsAndConditions(String termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
}