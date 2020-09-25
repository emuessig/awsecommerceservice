package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for SearchBinSets:
{
  "enum": [],
  "type": "object",
  "properties": {
    "SearchBinSet": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "SearchBinSet"
      }
    }
  }
}
*/


public class SearchBinSets {

	@Size(max=1)
	private Array searchBinSet;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    searchBinSet = new ArrayList<SearchBinSet>();
	}

	public Array getSearchBinSet() {
		return searchBinSet;
	}
	
	public void setSearchBinSet(Array searchBinSet) {
		this.searchBinSet = searchBinSet;
	}
}