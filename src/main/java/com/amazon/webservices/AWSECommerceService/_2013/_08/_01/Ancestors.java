package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Ancestors:
{
  "enum": [],
  "type": "object",
  "properties": {
    "BrowseNode": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "BrowseNode"
      }
    }
  }
}
*/


public class Ancestors {

	@Size(max=1)
	private List<com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNode> browseNode;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    browseNode = new ArrayList<com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNode>();
	}

	public List<com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNode> getBrowseNode() {
		return browseNode;
	}
	
	public void setBrowseNode(List<com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNode> browseNode) {
		this.browseNode = browseNode;
	}
}