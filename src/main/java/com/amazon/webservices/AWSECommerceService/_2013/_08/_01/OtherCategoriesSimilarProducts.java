package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for OtherCategoriesSimilarProducts:
{
  "required": [
    "OtherCategoriesSimilarProduct"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "OtherCategoriesSimilarProduct": {
      "minItems": 1,
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "ASIN": {
            "type": "string"
          },
          "Title": {
            "type": "string"
          }
        }
      }
    }
  }
}
*/


public class OtherCategoriesSimilarProducts {

	private List<OtherCategoriesSimilarProduct> otherCategoriesSimilarProduct;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    otherCategoriesSimilarProduct = new ArrayList<OtherCategoriesSimilarProduct>();
	}

	public List<OtherCategoriesSimilarProduct> getOtherCategoriesSimilarProduct() {
		return otherCategoriesSimilarProduct;
	}
	
	public void setOtherCategoriesSimilarProduct(List<OtherCategoriesSimilarProduct> otherCategoriesSimilarProduct) {
		this.otherCategoriesSimilarProduct = otherCategoriesSimilarProduct;
	}
}