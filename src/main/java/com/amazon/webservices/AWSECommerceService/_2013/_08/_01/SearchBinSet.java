package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for SearchBinSet:
{
  "required": [
    "NarrowBy"
  ],
  "type": "object",
  "properties": {
    "Bin": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "Bin"
      }
    },
    "NarrowBy": {
      "type": "string"
    }
  }
}
*/


public class SearchBinSet {

	@Size(max=1)
	private Array bin;

	@Size(max=1)
	@NotNull
	private String narrowBy;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    bin = new ArrayList<Bin>();
	    narrowBy = org.apache.commons.lang3.StringUtils.EMPTY;
	}

	public Array getBin() {
		return bin;
	}
	
	public void setBin(Array bin) {
		this.bin = bin;
	}

	public String getNarrowBy() {
		return narrowBy;
	}
	
	public void setNarrowBy(String narrowBy) {
		this.narrowBy = narrowBy;
	}
}