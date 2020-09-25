package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for ItemSearchRequest:
{
  "type": "object",
  "properties": {
    "Actor": {
      "type": "string"
    },
    "Artist": {
      "type": "string"
    },
    "Availability": {
      "enum": [
        "Available"
      ],
      "type": "string"
    },
    "AudienceRating": {
      "minItems": 0,
      "type": "array",
      "items": {
        "$ref": "AudienceRating"
      }
    },
    "Author": {
      "type": "string"
    },
    "Brand": {
      "type": "string"
    },
    "BrowseNode": {
      "type": "string"
    },
    "Composer": {
      "type": "string"
    },
    "Condition": {
      "enum": [
        "All",
        "New",
        "Used",
        "Collectible",
        "Refurbished"
      ],
      "type": "string",
      "additionalProperties": {},
      "properties": {}
    },
    "Conductor": {
      "type": "string"
    },
    "Director": {
      "type": "string"
    },
    "ItemPage": {
      "minimum": 0,
      "type": "integer"
    },
    "Keywords": {
      "type": "string"
    },
    "Manufacturer": {
      "type": "string"
    },
    "MaximumPrice": {
      "type": "integer"
    },
    "MerchantId": {
      "type": "string"
    },
    "MinimumPrice": {
      "type": "integer"
    },
    "MinPercentageOff": {
      "type": "integer"
    },
    "MusicLabel": {
      "type": "string"
    },
    "Orchestra": {
      "type": "string"
    },
    "Power": {
      "type": "string"
    },
    "Publisher": {
      "type": "string"
    },
    "RelatedItemPage": {
      "$ref": "positiveIntegerOrAll"
    },
    "RelationshipType": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "ResponseGroup": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "SearchIndex": {
      "type": "string"
    },
    "Sort": {
      "type": "string"
    },
    "Title": {
      "type": "string"
    },
    "ReleaseDate": {
      "type": "string"
    },
    "IncludeReviewsSummary": {
      "type": "string"
    },
    "TruncateReviewsAt": {
      "type": "integer"
    }
  }
}
*/


public class ItemSearchRequest {
	public enum Availability {
		Available
	}
	public enum Condition {
		All,New,Used,Collectible,Refurbished
	}

	@Size(max=1)
	private String actor;

	@Size(max=1)
	private String artist;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest.Availability availability;

	@Size(max=1)
	private List<com.amazon.webservices.AWSECommerceService._2013._08._01.AudienceRating> audienceRating;

	@Size(max=1)
	private String author;

	@Size(max=1)
	private String brand;

	@Size(max=1)
	private String browseNode;

	@Size(max=1)
	private String composer;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest.Condition condition;

	@Size(max=1)
	private String conductor;

	@Size(max=1)
	private String director;

	@Size(max=1)
	private int itemPage;

	@Size(max=1)
	private String keywords;

	@Size(max=1)
	private String manufacturer;

	@Size(max=1)
	private int maximumPrice;

	@Size(max=1)
	private String merchantId;

	@Size(max=1)
	private int minimumPrice;

	@Size(max=1)
	private int minPercentageOff;

	@Size(max=1)
	private String musicLabel;

	@Size(max=1)
	private String orchestra;

	@Size(max=1)
	private String power;

	@Size(max=1)
	private String publisher;

	@Size(max=1)
	private com.digitalml.rest.resources.codegentest.PositiveIntegerOrAll relatedItemPage;

	@Size(max=1)
	private List<String> relationshipType;

	@Size(max=1)
	private List<String> responseGroup;

	@Size(max=1)
	private String searchIndex;

	@Size(max=1)
	private String sort;

	@Size(max=1)
	private String title;

	@Size(max=1)
	private String releaseDate;

	@Size(max=1)
	private String includeReviewsSummary;

	@Size(max=1)
	private int truncateReviewsAt;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    actor = null;
	    artist = null;
	    availability = null;
	    audienceRating = new ArrayList<com.amazon.webservices.AWSECommerceService._2013._08._01.AudienceRating>();
	    author = null;
	    brand = null;
	    browseNode = null;
	    composer = null;
	    condition = null;
	    conductor = null;
	    director = null;
	    
	    keywords = null;
	    manufacturer = null;
	    
	    merchantId = null;
	    
	    
	    musicLabel = null;
	    orchestra = null;
	    power = null;
	    publisher = null;
	    relatedItemPage = null;
	    relationshipType = new ArrayList<String>();
	    responseGroup = new ArrayList<String>();
	    searchIndex = null;
	    sort = null;
	    title = null;
	    releaseDate = null;
	    includeReviewsSummary = null;
	    
	}

	public String getActor() {
		return actor;
	}
	
	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest.Availability getAvailability() {
		return availability;
	}
	
	public void setAvailability(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest.Availability availability) {
		this.availability = availability;
	}

	public List<com.amazon.webservices.AWSECommerceService._2013._08._01.AudienceRating> getAudienceRating() {
		return audienceRating;
	}
	
	public void setAudienceRating(List<com.amazon.webservices.AWSECommerceService._2013._08._01.AudienceRating> audienceRating) {
		this.audienceRating = audienceRating;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrowseNode() {
		return browseNode;
	}
	
	public void setBrowseNode(String browseNode) {
		this.browseNode = browseNode;
	}

	public String getComposer() {
		return composer;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest.Condition getCondition() {
		return condition;
	}
	
	public void setCondition(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearchRequest.Condition condition) {
		this.condition = condition;
	}

	public String getConductor() {
		return conductor;
	}
	
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}

	public int getItemPage() {
		return itemPage;
	}
	
	public void setItemPage(int itemPage) {
		this.itemPage = itemPage;
	}

	public String getKeywords() {
		return keywords;
	}
	
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getMaximumPrice() {
		return maximumPrice;
	}
	
	public void setMaximumPrice(int maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	public String getMerchantId() {
		return merchantId;
	}
	
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public int getMinimumPrice() {
		return minimumPrice;
	}
	
	public void setMinimumPrice(int minimumPrice) {
		this.minimumPrice = minimumPrice;
	}

	public int getMinPercentageOff() {
		return minPercentageOff;
	}
	
	public void setMinPercentageOff(int minPercentageOff) {
		this.minPercentageOff = minPercentageOff;
	}

	public String getMusicLabel() {
		return musicLabel;
	}
	
	public void setMusicLabel(String musicLabel) {
		this.musicLabel = musicLabel;
	}

	public String getOrchestra() {
		return orchestra;
	}
	
	public void setOrchestra(String orchestra) {
		this.orchestra = orchestra;
	}

	public String getPower() {
		return power;
	}
	
	public void setPower(String power) {
		this.power = power;
	}

	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public com.digitalml.rest.resources.codegentest.PositiveIntegerOrAll getRelatedItemPage() {
		return relatedItemPage;
	}
	
	public void setRelatedItemPage(com.digitalml.rest.resources.codegentest.PositiveIntegerOrAll relatedItemPage) {
		this.relatedItemPage = relatedItemPage;
	}

	public List<String> getRelationshipType() {
		return relationshipType;
	}
	
	public void setRelationshipType(List<String> relationshipType) {
		this.relationshipType = relationshipType;
	}

	public List<String> getResponseGroup() {
		return responseGroup;
	}
	
	public void setResponseGroup(List<String> responseGroup) {
		this.responseGroup = responseGroup;
	}

	public String getSearchIndex() {
		return searchIndex;
	}
	
	public void setSearchIndex(String searchIndex) {
		this.searchIndex = searchIndex;
	}

	public String getSort() {
		return sort;
	}
	
	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getIncludeReviewsSummary() {
		return includeReviewsSummary;
	}
	
	public void setIncludeReviewsSummary(String includeReviewsSummary) {
		this.includeReviewsSummary = includeReviewsSummary;
	}

	public int getTruncateReviewsAt() {
		return truncateReviewsAt;
	}
	
	public void setTruncateReviewsAt(int truncateReviewsAt) {
		this.truncateReviewsAt = truncateReviewsAt;
	}
}