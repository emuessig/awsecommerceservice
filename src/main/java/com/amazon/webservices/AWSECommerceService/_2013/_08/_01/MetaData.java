package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for MetaData:
{
  "enum": [],
  "type": "object",
  "properties": {
    "KeyValuePair": {
      "minItems": 0,
      "type": "array",
      "items": {
        "required": [
          "Key",
          "Value"
        ],
        "type": "object",
        "properties": {
          "Key": {
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


public class MetaData {

	@Size(max=1)
	private List<KeyValuePair> keyValuePair;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    keyValuePair = new ArrayList<KeyValuePair>();
	}

	public List<KeyValuePair> getKeyValuePair() {
		return keyValuePair;
	}
	
	public void setKeyValuePair(List<KeyValuePair> keyValuePair) {
		this.keyValuePair = keyValuePair;
	}
}