package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for RelatedItems:
{
  "type": "object",
  "properties": {
    "Relationship": {
      "enum": [
        "Parents",
        "Children"
      ],
      "type": "string"
    },
    "RelationshipType": {
      "type": "string"
    },
    "RelatedItemCount": {
      "type": "integer"
    },
    "RelatedItemPageCount": {
      "type": "integer"
    },
    "RelatedItemPage": {
      "type": "integer"
    },
    "RelatedItem": {
      "$ref": "RelatedItem"
    }
  }
}
*/


public class RelatedItems {
	public enum Relationship {
		Parents,Children
	}

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.RelatedItems.Relationship relationship;

	@Size(max=1)
	private String relationshipType;

	@Size(max=1)
	private int relatedItemCount;

	@Size(max=1)
	private int relatedItemPageCount;

	@Size(max=1)
	private int relatedItemPage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.RelatedItem relatedItem;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    relationship = null;
	    relationshipType = null;
	    
	    
	    
	    relatedItem = null;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.RelatedItems.Relationship getRelationship() {
		return relationship;
	}
	
	public void setRelationship(com.amazon.webservices.AWSECommerceService._2013._08._01.RelatedItems.Relationship relationship) {
		this.relationship = relationship;
	}

	public String getRelationshipType() {
		return relationshipType;
	}
	
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	public int getRelatedItemCount() {
		return relatedItemCount;
	}
	
	public void setRelatedItemCount(int relatedItemCount) {
		this.relatedItemCount = relatedItemCount;
	}

	public int getRelatedItemPageCount() {
		return relatedItemPageCount;
	}
	
	public void setRelatedItemPageCount(int relatedItemPageCount) {
		this.relatedItemPageCount = relatedItemPageCount;
	}

	public int getRelatedItemPage() {
		return relatedItemPage;
	}
	
	public void setRelatedItemPage(int relatedItemPage) {
		this.relatedItemPage = relatedItemPage;
	}

	public com.digitalml.rest.resources.codegentest.RelatedItem getRelatedItem() {
		return relatedItem;
	}
	
	public void setRelatedItem(com.digitalml.rest.resources.codegentest.RelatedItem relatedItem) {
		this.relatedItem = relatedItem;
	}
}