package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Languages:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Language": {
      "minItems": 0,
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
          "Type": {
            "type": "string"
          },
          "AudioFormat": {
            "type": "string"
          }
        }
      }
    }
  }
}
*/


public class Languages {

	@Size(max=1)
	private List<Language> language;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    language = new ArrayList<Language>();
	}

	public List<Language> getLanguage() {
		return language;
	}
	
	public void setLanguage(List<Language> language) {
		this.language = language;
	}
}