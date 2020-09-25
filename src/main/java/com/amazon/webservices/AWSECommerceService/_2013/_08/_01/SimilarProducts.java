package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for SimilarProducts:
{
  "required": [
    "SimilarProduct"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "SimilarProduct": {
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


public class SimilarProducts {

	private List<SimilarProduct> similarProduct;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    similarProduct = new ArrayList<SimilarProduct>();
	}

	public List<SimilarProduct> getSimilarProduct() {
		return similarProduct;
	}
	
	public void setSimilarProduct(List<SimilarProduct> similarProduct) {
		this.similarProduct = similarProduct;
	}
}