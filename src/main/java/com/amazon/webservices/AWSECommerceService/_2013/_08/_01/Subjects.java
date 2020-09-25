package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Subjects:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Subject": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
*/


public class Subjects {

	@Size(max=1)
	private List<String> subject;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    subject = new ArrayList<String>();
	}

	public List<String> getSubject() {
		return subject;
	}
	
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
}