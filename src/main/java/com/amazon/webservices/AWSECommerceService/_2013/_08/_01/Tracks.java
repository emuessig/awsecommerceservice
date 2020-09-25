package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Tracks:
{
  "required": [
    "Disc"
  ],
  "enum": [],
  "type": "object",
  "properties": {
    "Disc": {
      "minItems": 1,
      "type": "array",
      "items": {
        "required": [
          "Number",
          "Track"
        ],
        "type": "object",
        "properties": {
          "Track": {
            "minItems": 1,
            "type": "array",
            "items": {
              "required": [
                "Number"
              ],
              "type": "object",
              "properties": {
                "value": {
                  "type": "string"
                },
                "Number": {
                  "minimum": 0,
                  "type": "integer"
                }
              }
            }
          },
          "Number": {
            "minimum": 0,
            "type": "integer"
          }
        }
      }
    }
  }
}
*/


public class Tracks {

	private List<Disc> disc;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    disc = new ArrayList<Disc>();
	}

	public List<Disc> getDisc() {
		return disc;
	}
	
	public void setDisc(List<Disc> disc) {
		this.disc = disc;
	}
}