package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for SimilarViewedProducts:
{
  "required": [
    "SimilarViewedProduct"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "SimilarViewedProduct": {
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


public class SimilarViewedProducts {

	private List<SimilarViewedProduct> similarViewedProduct;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    similarViewedProduct = new ArrayList<SimilarViewedProduct>();
	}

	public List<SimilarViewedProduct> getSimilarViewedProduct() {
		return similarViewedProduct;
	}
	
	public void setSimilarViewedProduct(List<SimilarViewedProduct> similarViewedProduct) {
		this.similarViewedProduct = similarViewedProduct;
	}
}