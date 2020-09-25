package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for SearchResultsMap:
{
  "required": [
    "SearchIndex"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "SearchIndex": {
      "minItems": 1,
      "type": "array",
      "items": {
        "required": [
          "ASIN",
          "IndexName",
          "RelevanceRank"
        ],
        "type": "object",
        "properties": {
          "IndexName": {
            "type": "string"
          },
          "Results": {
            "type": "integer"
          },
          "Pages": {
            "type": "integer"
          },
          "CorrectedQuery": {
            "$ref": "CorrectedQuery"
          },
          "RelevanceRank": {
            "minimum": 0,
            "type": "integer"
          },
          "ASIN": {
            "minItems": 1,
            "type": "array",
            "items": {
              "type": "string"
            }
          }
        }
      }
    }
  }
}
*/


public class SearchResultsMap {

	private List<SearchIndex> searchIndex;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    searchIndex = new ArrayList<SearchIndex>();
	}

	public List<SearchIndex> getSearchIndex() {
		return searchIndex;
	}
	
	public void setSearchIndex(List<SearchIndex> searchIndex) {
		this.searchIndex = searchIndex;
	}
}