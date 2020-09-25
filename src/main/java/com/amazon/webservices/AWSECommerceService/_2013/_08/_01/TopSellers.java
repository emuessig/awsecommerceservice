package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for TopSellers:
{
  "required": [
    "TopSeller"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "TopSeller": {
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


public class TopSellers {

	private List<TopSeller> topSeller;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    topSeller = new ArrayList<TopSeller>();
	}

	public List<TopSeller> getTopSeller() {
		return topSeller;
	}
	
	public void setTopSeller(List<TopSeller> topSeller) {
		this.topSeller = topSeller;
	}
}