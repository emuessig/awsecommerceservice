package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for HTTPHeaders:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Header": {
      "minItems": 0,
      "type": "array",
      "items": {
        "required": [
          "Name",
          "Value"
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


public class HTTPHeaders {

	@Size(max=1)
	private List<Header> header;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    header = new ArrayList<Header>();
	}

	public List<Header> getHeader() {
		return header;
	}
	
	public void setHeader(List<Header> header) {
		this.header = header;
	}
}