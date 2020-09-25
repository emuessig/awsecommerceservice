package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Errors:
{
  "required": [
    "Error"
  ],
  "type": "object",
  "properties": {
    "Error": {
      "minItems": 1,
      "type": "array",
      "items": {
        "required": [
          "Code",
          "Message"
        ],
        "type": "object",
        "properties": {
          "Code": {
            "type": "string"
          },
          "Message": {
            "type": "string"
          }
        }
      }
    }
  }
}
*/


public class Errors {

	private List<Error> error;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    error = new ArrayList<Error>();
	}

	public List<Error> getError() {
		return error;
	}
	
	public void setError(List<Error> error) {
		this.error = error;
	}
}