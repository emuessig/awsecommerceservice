package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for ImageSet:
{
  "type": "object",
  "properties": {
    "SwatchImage": {
      "$ref": "Image"
    },
    "SmallImage": {
      "$ref": "Image"
    },
    "ThumbnailImage": {
      "$ref": "Image"
    },
    "TinyImage": {
      "$ref": "Image"
    },
    "MediumImage": {
      "$ref": "Image"
    },
    "LargeImage": {
      "$ref": "Image"
    },
    "HiResImage": {
      "$ref": "Image"
    },
    "Category": {
      "type": "string"
    }
  }
}
*/


public class ImageSet {

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Image swatchImage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Image smallImage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Image thumbnailImage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Image tinyImage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Image mediumImage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Image largeImage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Image hiResImage;

	@Size(max=1)
	private String category;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    swatchImage = null;
	    smallImage = null;
	    thumbnailImage = null;
	    tinyImage = null;
	    mediumImage = null;
	    largeImage = null;
	    hiResImage = null;
	    category = null;
	}

	public com.digitalml.rest.resources.codegentest.Image getSwatchImage() {
		return swatchImage;
	}
	
	public void setSwatchImage(com.digitalml.rest.resources.codegentest.Image swatchImage) {
		this.swatchImage = swatchImage;
	}

	public com.digitalml.rest.resources.codegentest.Image getSmallImage() {
		return smallImage;
	}
	
	public void setSmallImage(com.digitalml.rest.resources.codegentest.Image smallImage) {
		this.smallImage = smallImage;
	}

	public com.digitalml.rest.resources.codegentest.Image getThumbnailImage() {
		return thumbnailImage;
	}
	
	public void setThumbnailImage(com.digitalml.rest.resources.codegentest.Image thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public com.digitalml.rest.resources.codegentest.Image getTinyImage() {
		return tinyImage;
	}
	
	public void setTinyImage(com.digitalml.rest.resources.codegentest.Image tinyImage) {
		this.tinyImage = tinyImage;
	}

	public com.digitalml.rest.resources.codegentest.Image getMediumImage() {
		return mediumImage;
	}
	
	public void setMediumImage(com.digitalml.rest.resources.codegentest.Image mediumImage) {
		this.mediumImage = mediumImage;
	}

	public com.digitalml.rest.resources.codegentest.Image getLargeImage() {
		return largeImage;
	}
	
	public void setLargeImage(com.digitalml.rest.resources.codegentest.Image largeImage) {
		this.largeImage = largeImage;
	}

	public com.digitalml.rest.resources.codegentest.Image getHiResImage() {
		return hiResImage;
	}
	
	public void setHiResImage(com.digitalml.rest.resources.codegentest.Image hiResImage) {
		this.hiResImage = hiResImage;
	}

	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
}