package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for AlternateVersions:
{
  "enum": [],
  "type": "object",
  "properties": {
    "AlternateVersion": {
      "minItems": 0,
      "type": "array",
      "items": {
        "required": [
          "ASIN"
        ],
        "type": "object",
        "properties": {
          "ASIN": {
            "type": "string"
          },
          "Title": {
            "type": "string"
          },
          "Binding": {
            "type": "string"
          }
        }
      }
    }
  }
}
*/


public class AlternateVersions {

	@Size(max=1)
	private List<AlternateVersion> alternateVersion;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    alternateVersion = new ArrayList<AlternateVersion>();
	}

	public List<AlternateVersion> getAlternateVersion() {
		return alternateVersion;
	}
	
	public void setAlternateVersion(List<AlternateVersion> alternateVersion) {
		this.alternateVersion = alternateVersion;
	}
}