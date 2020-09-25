package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Collections:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Collection": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "CollectionSummary": {
            "type": "object",
            "properties": {
              "LowestListPrice": {
                "$ref": "Price"
              },
              "HighestListPrice": {
                "$ref": "Price"
              },
              "LowestSalePrice": {
                "$ref": "Price"
              },
              "HighestSalePrice": {
                "$ref": "Price"
              }
            }
          },
          "CollectionParent": {
            "type": "object",
            "properties": {
              "ASIN": {
                "type": "string"
              },
              "Title": {
                "type": "string"
              }
            }
          },
          "CollectionItem": {
            "minItems": 0,
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
    }
  }
}
*/


public class Collections {

	@Size(max=1)
	private List<Collection> collection;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    collection = new ArrayList<Collection>();
	}

	public List<Collection> getCollection() {
		return collection;
	}
	
	public void setCollection(List<Collection> collection) {
		this.collection = collection;
	}
}