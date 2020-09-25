package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for NewReleases:
{
  "required": [
    "NewRelease"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "NewRelease": {
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


public class NewReleases {

	private List<NewRelease> newRelease;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    newRelease = new ArrayList<NewRelease>();
	}

	public List<NewRelease> getNewRelease() {
		return newRelease;
	}
	
	public void setNewRelease(List<NewRelease> newRelease) {
		this.newRelease = newRelease;
	}
}