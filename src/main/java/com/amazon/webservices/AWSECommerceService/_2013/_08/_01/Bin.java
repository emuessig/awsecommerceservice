package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Bin:
{
  "required": [
    "BinItemCount",
    "BinName"
  ],
  "type": "object",
  "properties": {
    "BinName": {
      "type": "string"
    },
    "BinItemCount": {
      "minimum": 0,
      "type": "integer"
    },
    "BinParameter": {
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


public class Bin {

	@Size(max=1)
	@NotNull
	private String binName;

	@Size(max=1)
	@NotNull
	private int binItemCount;

	@Size(max=1)
	private List<BinParameter> binParameter;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    binName = org.apache.commons.lang3.StringUtils.EMPTY;
	    
	    binParameter = new ArrayList<BinParameter>();
	}

	public String getBinName() {
		return binName;
	}
	
	public void setBinName(String binName) {
		this.binName = binName;
	}

	public int getBinItemCount() {
		return binItemCount;
	}
	
	public void setBinItemCount(int binItemCount) {
		this.binItemCount = binItemCount;
	}

	public List<BinParameter> getBinParameter() {
		return binParameter;
	}
	
	public void setBinParameter(List<BinParameter> binParameter) {
		this.binParameter = binParameter;
	}
}