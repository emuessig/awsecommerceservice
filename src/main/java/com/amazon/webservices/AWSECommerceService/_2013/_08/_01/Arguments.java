package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Arguments:
{
  "required": [
    "Argument"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "Argument": {
      "minItems": 1,
      "type": "array",
      "items": {
        "required": [
          "Name"
        ],
        "type": "object",
        "properties": {
          "Name": {
            "type": "string"
          },
          "Value": {
            "type": "string"
          }
        }
      }
    }
  }
}
*/


public class Arguments {

	private List<Argument> argument;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    argument = new ArrayList<Argument>();
	}

	public List<Argument> getArgument() {
		return argument;
	}
	
	public void setArgument(List<Argument> argument) {
		this.argument = argument;
	}
}