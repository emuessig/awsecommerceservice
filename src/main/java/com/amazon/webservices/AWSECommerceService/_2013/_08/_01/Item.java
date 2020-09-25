package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for Item:
{
  "required": [
    "ASIN"
  ],
  "type": "object",
  "properties": {
    "ASIN": {
      "type": "string"
    },
    "ParentASIN": {
      "type": "string"
    },
    "Errors": {
      "$ref": "Errors"
    },
    "DetailPageURL": {
      "type": "string"
    },
    "ItemLinks": {
      "$ref": "ItemLinks"
    },
    "SalesRank": {
      "type": "string"
    },
    "SmallImage": {
      "$ref": "Image"
    },
    "MediumImage": {
      "$ref": "Image"
    },
    "LargeImage": {
      "$ref": "Image"
    },
    "ImageSets": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "object",
        "properties": {
          "ImageSet": {
            "minItems": 0,
            "type": "array",
            "items": {
              "$ref": "ImageSet"
            }
          }
        }
      }
    },
    "ItemAttributes": {
      "$ref": "ItemAttributes"
    },
    "VariationAttributes": {
      "type": "object",
      "properties": {
        "VariationAttribute": {
          "minItems": 0,
          "type": "array",
          "items": {
            "$ref": "VariationAttribute"
          }
        }
      }
    },
    "RelatedItems": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "RelatedItems"
      }
    },
    "Collections": {
      "$ref": "Collections"
    },
    "Subjects": {
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
    },
    "OfferSummary": {
      "$ref": "OfferSummary"
    },
    "Offers": {
      "$ref": "Offers"
    },
    "RentalOffers": {
      "$ref": "RentalOffers"
    },
    "VariationSummary": {
      "$ref": "VariationSummary"
    },
    "Variations": {
      "$ref": "Variations"
    },
    "CustomerReviews": {
      "$ref": "CustomerReviews"
    },
    "EditorialReviews": {
      "$ref": "EditorialReviews"
    },
    "SimilarProducts": {
      "$ref": "SimilarProducts"
    },
    "Accessories": {
      "$ref": "Accessories"
    },
    "Tracks": {
      "$ref": "Tracks"
    },
    "BrowseNodes": {
      "$ref": "BrowseNodes"
    },
    "AlternateVersions": {
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
  }
}
*/


public class Item {

	@Size(max=1)
	@NotNull
	private String aSIN;

	@Size(max=1)
	private String parentASIN;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Errors errors;

	@Size(max=1)
	private String detailPageURL;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLinks itemLinks;

	@Size(max=1)
	private String salesRank;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Image smallImage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Image mediumImage;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.Image largeImage;

	@Size(max=1)
	private List<ImageSets> imageSets;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemAttributes itemAttributes;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.VariationAttributes variationAttributes;

	@Size(max=1)
	private Array relatedItems;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Collections collections;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Subjects subjects;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.OfferSummary offerSummary;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Offers offers;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.RentalOffers rentalOffers;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.VariationSummary variationSummary;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Variations variations;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.CustomerReviews customerReviews;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.EditorialReviews editorialReviews;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarProducts similarProducts;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Accessories accessories;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Tracks tracks;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNodes browseNodes;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.AlternateVersions alternateVersions;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    aSIN = org.apache.commons.lang3.StringUtils.EMPTY;
	    parentASIN = null;
	    errors = null;
	    detailPageURL = null;
	    itemLinks = null;
	    salesRank = null;
	    smallImage = null;
	    mediumImage = null;
	    largeImage = null;
	    imageSets = new ArrayList<ImageSets>();
	    itemAttributes = null;
	    variationAttributes = null;
	    relatedItems = new ArrayList<RelatedItems>();
	    collections = null;
	    subjects = null;
	    offerSummary = null;
	    offers = null;
	    rentalOffers = null;
	    variationSummary = null;
	    variations = null;
	    customerReviews = null;
	    editorialReviews = null;
	    similarProducts = null;
	    accessories = null;
	    tracks = null;
	    browseNodes = null;
	    alternateVersions = null;
	}

	public String getASIN() {
		return aSIN;
	}
	
	public void setASIN(String aSIN) {
		this.aSIN = aSIN;
	}

	public String getParentASIN() {
		return parentASIN;
	}
	
	public void setParentASIN(String parentASIN) {
		this.parentASIN = parentASIN;
	}

	public com.digitalml.rest.resources.codegentest.Errors getErrors() {
		return errors;
	}
	
	public void setErrors(com.digitalml.rest.resources.codegentest.Errors errors) {
		this.errors = errors;
	}

	public String getDetailPageURL() {
		return detailPageURL;
	}
	
	public void setDetailPageURL(String detailPageURL) {
		this.detailPageURL = detailPageURL;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLinks getItemLinks() {
		return itemLinks;
	}
	
	public void setItemLinks(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLinks itemLinks) {
		this.itemLinks = itemLinks;
	}

	public String getSalesRank() {
		return salesRank;
	}
	
	public void setSalesRank(String salesRank) {
		this.salesRank = salesRank;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Image getSmallImage() {
		return smallImage;
	}
	
	public void setSmallImage(com.amazon.webservices.AWSECommerceService._2013._08._01.Image smallImage) {
		this.smallImage = smallImage;
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

	public List<ImageSets> getImageSets() {
		return imageSets;
	}
	
	public void setImageSets(List<ImageSets> imageSets) {
		this.imageSets = imageSets;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemAttributes getItemAttributes() {
		return itemAttributes;
	}
	
	public void setItemAttributes(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemAttributes itemAttributes) {
		this.itemAttributes = itemAttributes;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.VariationAttributes getVariationAttributes() {
		return variationAttributes;
	}
	
	public void setVariationAttributes(com.amazon.webservices.AWSECommerceService._2013._08._01.VariationAttributes variationAttributes) {
		this.variationAttributes = variationAttributes;
	}

	public Array getRelatedItems() {
		return relatedItems;
	}
	
	public void setRelatedItems(Array relatedItems) {
		this.relatedItems = relatedItems;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Collections getCollections() {
		return collections;
	}
	
	public void setCollections(com.amazon.webservices.AWSECommerceService._2013._08._01.Collections collections) {
		this.collections = collections;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Subjects getSubjects() {
		return subjects;
	}
	
	public void setSubjects(com.amazon.webservices.AWSECommerceService._2013._08._01.Subjects subjects) {
		this.subjects = subjects;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.OfferSummary getOfferSummary() {
		return offerSummary;
	}
	
	public void setOfferSummary(com.amazon.webservices.AWSECommerceService._2013._08._01.OfferSummary offerSummary) {
		this.offerSummary = offerSummary;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Offers getOffers() {
		return offers;
	}
	
	public void setOffers(com.amazon.webservices.AWSECommerceService._2013._08._01.Offers offers) {
		this.offers = offers;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.RentalOffers getRentalOffers() {
		return rentalOffers;
	}
	
	public void setRentalOffers(com.amazon.webservices.AWSECommerceService._2013._08._01.RentalOffers rentalOffers) {
		this.rentalOffers = rentalOffers;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.VariationSummary getVariationSummary() {
		return variationSummary;
	}
	
	public void setVariationSummary(com.amazon.webservices.AWSECommerceService._2013._08._01.VariationSummary variationSummary) {
		this.variationSummary = variationSummary;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Variations getVariations() {
		return variations;
	}
	
	public void setVariations(com.amazon.webservices.AWSECommerceService._2013._08._01.Variations variations) {
		this.variations = variations;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.CustomerReviews getCustomerReviews() {
		return customerReviews;
	}
	
	public void setCustomerReviews(com.amazon.webservices.AWSECommerceService._2013._08._01.CustomerReviews customerReviews) {
		this.customerReviews = customerReviews;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.EditorialReviews getEditorialReviews() {
		return editorialReviews;
	}
	
	public void setEditorialReviews(com.amazon.webservices.AWSECommerceService._2013._08._01.EditorialReviews editorialReviews) {
		this.editorialReviews = editorialReviews;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarProducts getSimilarProducts() {
		return similarProducts;
	}
	
	public void setSimilarProducts(com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarProducts similarProducts) {
		this.similarProducts = similarProducts;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Accessories getAccessories() {
		return accessories;
	}
	
	public void setAccessories(com.amazon.webservices.AWSECommerceService._2013._08._01.Accessories accessories) {
		this.accessories = accessories;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Tracks getTracks() {
		return tracks;
	}
	
	public void setTracks(com.amazon.webservices.AWSECommerceService._2013._08._01.Tracks tracks) {
		this.tracks = tracks;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNodes getBrowseNodes() {
		return browseNodes;
	}
	
	public void setBrowseNodes(com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNodes browseNodes) {
		this.browseNodes = browseNodes;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.AlternateVersions getAlternateVersions() {
		return alternateVersions;
	}
	
	public void setAlternateVersions(com.amazon.webservices.AWSECommerceService._2013._08._01.AlternateVersions alternateVersions) {
		this.alternateVersions = alternateVersions;
	}
}