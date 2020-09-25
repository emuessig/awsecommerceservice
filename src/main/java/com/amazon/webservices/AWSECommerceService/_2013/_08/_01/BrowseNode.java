package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for BrowseNode:
{
  "type": "object",
  "properties": {
    "BrowseNodeId": {
      "type": "string"
    },
    "Name": {
      "type": "string"
    },
    "IsCategoryRoot": {
      "type": "boolean"
    },
    "Properties": {
      "required": [
        "Property"
      ],
      "type": "object",
      "properties": {
        "Property": {
          "minItems": 1,
          "type": "array",
          "items": {
            "$ref": "Property"
          }
        }
      }
    },
    "Children": {
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
    },
    "Ancestors": {
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
    },
    "TopSellers": {
      "$ref": "TopSellers"
    },
    "NewReleases": {
      "$ref": "NewReleases"
    },
    "TopItemSet": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "TopItemSet"
      }
    }
  }
}
*/


public class BrowseNode {

	@Size(max=1)
	private String browseNodeId;

	@Size(max=1)
	private String name;

	@Size(max=1)
	private boolean isCategoryRoot;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Properties properties;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Children children;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Ancestors ancestors;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.TopSellers topSellers;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.NewReleases newReleases;

	@Size(max=1)
	private Array topItemSet;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    browseNodeId = null;
	    name = null;
	    
	    properties = null;
	    children = null;
	    ancestors = null;
	    topSellers = null;
	    newReleases = null;
	    topItemSet = new ArrayList<TopItemSet>();
	}

	public String getBrowseNodeId() {
		return browseNodeId;
	}
	
	public void setBrowseNodeId(String browseNodeId) {
		this.browseNodeId = browseNodeId;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsCategoryRoot() {
		return isCategoryRoot;
	}
	
	public void setIsCategoryRoot(boolean isCategoryRoot) {
		this.isCategoryRoot = isCategoryRoot;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Properties getProperties() {
		return properties;
	}
	
	public void setProperties(com.amazon.webservices.AWSECommerceService._2013._08._01.Properties properties) {
		this.properties = properties;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Children getChildren() {
		return children;
	}
	
	public void setChildren(com.amazon.webservices.AWSECommerceService._2013._08._01.Children children) {
		this.children = children;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Ancestors getAncestors() {
		return ancestors;
	}
	
	public void setAncestors(com.amazon.webservices.AWSECommerceService._2013._08._01.Ancestors ancestors) {
		this.ancestors = ancestors;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.TopSellers getTopSellers() {
		return topSellers;
	}
	
	public void setTopSellers(com.amazon.webservices.AWSECommerceService._2013._08._01.TopSellers topSellers) {
		this.topSellers = topSellers;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.NewReleases getNewReleases() {
		return newReleases;
	}
	
	public void setNewReleases(com.amazon.webservices.AWSECommerceService._2013._08._01.NewReleases newReleases) {
		this.newReleases = newReleases;
	}

	public Array getTopItemSet() {
		return topItemSet;
	}
	
	public void setTopItemSet(Array topItemSet) {
		this.topItemSet = topItemSet;
	}
}