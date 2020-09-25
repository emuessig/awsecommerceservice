package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for EditorialReviews:
{
  "enum": [],
  "type": "object",
  "properties": {
    "EditorialReview": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "EditorialReview"
      }
    }
  }
}
*/


public class EditorialReviews {

	@Size(max=1)
	private Array editorialReview;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    editorialReview = new ArrayList<EditorialReview>();
	}

	public Array getEditorialReview() {
		return editorialReview;
	}
	
	public void setEditorialReview(Array editorialReview) {
		this.editorialReview = editorialReview;
	}
}