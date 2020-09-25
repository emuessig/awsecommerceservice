package com.amazon.webservices.AWSECommerceService._2013._08._01;
	
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

/*
JSON Representation for ItemAttributes:
{
  "enum": [],
  "type": "object",
  "properties": {
    "Actor": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "Artist": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "AspectRatio": {
      "type": "string"
    },
    "AudienceRating": {
      "type": "string"
    },
    "AudioFormat": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "Author": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "Binding": {
      "type": "string"
    },
    "Brand": {
      "type": "string"
    },
    "CatalogNumberList": {
      "type": "object",
      "properties": {
        "CatalogNumberListElement": {
          "minItems": 0,
          "type": "array",
          "items": {
            "type": "string"
          }
        }
      }
    },
    "Category": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "CEROAgeRating": {
      "type": "string"
    },
    "ClothingSize": {
      "type": "string"
    },
    "Color": {
      "type": "string"
    },
    "Creator": {
      "minItems": 0,
      "type": "array",
      "items": {
        "required": [
          "Role"
        ],
        "type": "object",
        "properties": {
          "value": {
            "type": "string"
          },
          "Role": {
            "type": "string"
          }
        }
      }
    },
    "Department": {
      "type": "string"
    },
    "Director": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "EAN": {
      "type": "string"
    },
    "EANList": {
      "type": "object",
      "properties": {
        "EANListElement": {
          "minItems": 0,
          "type": "array",
          "items": {
            "type": "string"
          }
        }
      }
    },
    "Edition": {
      "type": "string"
    },
    "EISBN": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "EnergyEfficiencyClass": {
      "type": "string"
    },
    "EpisodeSequence": {
      "type": "string"
    },
    "ESRBAgeRating": {
      "type": "string"
    },
    "Feature": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "Format": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "Genre": {
      "type": "string"
    },
    "HardwarePlatform": {
      "type": "string"
    },
    "HazardousMaterialType": {
      "type": "string"
    },
    "IsAdultProduct": {
      "type": "boolean"
    },
    "IsAutographed": {
      "type": "boolean"
    },
    "ISBN": {
      "type": "string"
    },
    "IsEligibleForTradeIn": {
      "type": "boolean"
    },
    "IsMemorabilia": {
      "type": "boolean"
    },
    "IssuesPerYear": {
      "type": "string"
    },
    "ItemDimensions": {
      "type": "object",
      "properties": {
        "Height": {
          "$ref": "DecimalWithUnits"
        },
        "Length": {
          "$ref": "DecimalWithUnits"
        },
        "Weight": {
          "$ref": "DecimalWithUnits"
        },
        "Width": {
          "$ref": "DecimalWithUnits"
        }
      }
    },
    "ItemPartNumber": {
      "type": "string"
    },
    "Label": {
      "type": "string"
    },
    "Languages": {
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
    },
    "LegalDisclaimer": {
      "type": "string"
    },
    "ListPrice": {
      "$ref": "Price"
    },
    "MagazineType": {
      "type": "string"
    },
    "Manufacturer": {
      "type": "string"
    },
    "ManufacturerMaximumAge": {
      "$ref": "DecimalWithUnits"
    },
    "ManufacturerMinimumAge": {
      "$ref": "DecimalWithUnits"
    },
    "ManufacturerPartsWarrantyDescription": {
      "type": "string"
    },
    "MediaType": {
      "type": "string"
    },
    "Model": {
      "type": "string"
    },
    "ModelYear": {
      "type": "integer"
    },
    "MPN": {
      "type": "string"
    },
    "NumberOfDiscs": {
      "type": "integer"
    },
    "NumberOfIssues": {
      "type": "integer"
    },
    "NumberOfItems": {
      "type": "integer"
    },
    "NumberOfPages": {
      "type": "integer"
    },
    "NumberOfTracks": {
      "type": "integer"
    },
    "OperatingSystem": {
      "type": "string"
    },
    "PackageDimensions": {
      "type": "object",
      "properties": {
        "Height": {
          "$ref": "DecimalWithUnits"
        },
        "Length": {
          "$ref": "DecimalWithUnits"
        },
        "Weight": {
          "$ref": "DecimalWithUnits"
        },
        "Width": {
          "$ref": "DecimalWithUnits"
        }
      }
    },
    "PackageQuantity": {
      "type": "integer"
    },
    "PartNumber": {
      "type": "string"
    },
    "PictureFormat": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "Platform": {
      "minItems": 0,
      "type": "array",
      "items": {
        "type": "string"
      }
    },
    "ProductGroup": {
      "type": "string"
    },
    "ProductTypeName": {
      "type": "string"
    },
    "ProductTypeSubcategory": {
      "type": "string"
    },
    "PublicationDate": {
      "type": "string"
    },
    "Publisher": {
      "type": "string"
    },
    "RegionCode": {
      "type": "string"
    },
    "ReleaseDate": {
      "type": "string"
    },
    "SeasonSequence": {
      "type": "string"
    },
    "RunningTime": {
      "$ref": "DecimalWithUnits"
    },
    "SeikodoProductCode": {
      "type": "string"
    },
    "Size": {
      "type": "string"
    },
    "SKU": {
      "type": "string"
    },
    "Studio": {
      "type": "string"
    },
    "SubscriptionLength": {
      "$ref": "NonNegativeIntegerWithUnits"
    },
    "Title": {
      "type": "string"
    },
    "TrackSequence": {
      "type": "string"
    },
    "TradeInValue": {
      "$ref": "Price"
    },
    "UPC": {
      "type": "string"
    },
    "UPCList": {
      "type": "object",
      "properties": {
        "UPCListElement": {
          "minItems": 0,
          "type": "array",
          "items": {
            "type": "string"
          }
        }
      }
    },
    "Warranty": {
      "type": "string"
    },
    "WEEETaxValue": {
      "$ref": "Price"
    }
  }
}
*/


public class ItemAttributes {

	@Size(max=1)
	private List<String> actor;

	@Size(max=1)
	private List<String> artist;

	@Size(max=1)
	private String aspectRatio;

	@Size(max=1)
	private String audienceRating;

	@Size(max=1)
	private List<String> audioFormat;

	@Size(max=1)
	private List<String> author;

	@Size(max=1)
	private String binding;

	@Size(max=1)
	private String brand;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.CatalogNumberList catalogNumberList;

	@Size(max=1)
	private List<String> category;

	@Size(max=1)
	private String cEROAgeRating;

	@Size(max=1)
	private String clothingSize;

	@Size(max=1)
	private String color;

	@Size(max=1)
	private List<Creator> creator;

	@Size(max=1)
	private String department;

	@Size(max=1)
	private List<String> director;

	@Size(max=1)
	private String eAN;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.EANList eANList;

	@Size(max=1)
	private String edition;

	@Size(max=1)
	private List<String> eISBN;

	@Size(max=1)
	private String energyEfficiencyClass;

	@Size(max=1)
	private String episodeSequence;

	@Size(max=1)
	private String eSRBAgeRating;

	@Size(max=1)
	private List<String> feature;

	@Size(max=1)
	private List<String> format;

	@Size(max=1)
	private String genre;

	@Size(max=1)
	private String hardwarePlatform;

	@Size(max=1)
	private String hazardousMaterialType;

	@Size(max=1)
	private boolean isAdultProduct;

	@Size(max=1)
	private boolean isAutographed;

	@Size(max=1)
	private String iSBN;

	@Size(max=1)
	private boolean isEligibleForTradeIn;

	@Size(max=1)
	private boolean isMemorabilia;

	@Size(max=1)
	private String issuesPerYear;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.ItemDimensions itemDimensions;

	@Size(max=1)
	private String itemPartNumber;

	@Size(max=1)
	private String label;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Languages languages;

	@Size(max=1)
	private String legalDisclaimer;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price listPrice;

	@Size(max=1)
	private String magazineType;

	@Size(max=1)
	private String manufacturer;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits manufacturerMaximumAge;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits manufacturerMinimumAge;

	@Size(max=1)
	private String manufacturerPartsWarrantyDescription;

	@Size(max=1)
	private String mediaType;

	@Size(max=1)
	private String model;

	@Size(max=1)
	private int modelYear;

	@Size(max=1)
	private String mPN;

	@Size(max=1)
	private int numberOfDiscs;

	@Size(max=1)
	private int numberOfIssues;

	@Size(max=1)
	private int numberOfItems;

	@Size(max=1)
	private int numberOfPages;

	@Size(max=1)
	private int numberOfTracks;

	@Size(max=1)
	private String operatingSystem;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.PackageDimensions packageDimensions;

	@Size(max=1)
	private int packageQuantity;

	@Size(max=1)
	private String partNumber;

	@Size(max=1)
	private List<String> pictureFormat;

	@Size(max=1)
	private List<String> platform;

	@Size(max=1)
	private String productGroup;

	@Size(max=1)
	private String productTypeName;

	@Size(max=1)
	private String productTypeSubcategory;

	@Size(max=1)
	private String publicationDate;

	@Size(max=1)
	private String publisher;

	@Size(max=1)
	private String regionCode;

	@Size(max=1)
	private String releaseDate;

	@Size(max=1)
	private String seasonSequence;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits runningTime;

	@Size(max=1)
	private String seikodoProductCode;

	@Size(max=1)
	private String size;

	@Size(max=1)
	private String sKU;

	@Size(max=1)
	private String studio;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.NonNegativeIntegerWithUnits subscriptionLength;

	@Size(max=1)
	private String title;

	@Size(max=1)
	private String trackSequence;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price tradeInValue;

	@Size(max=1)
	private String uPC;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.UPCList uPCList;

	@Size(max=1)
	private String warranty;

	@Size(max=1)
	private com.amazon.webservices.AWSECommerceService._2013._08._01.Price wEEETaxValue;

	{
		initialiseDTO();
	}

	private void initialiseDTO() {
	    actor = new ArrayList<String>();
	    artist = new ArrayList<String>();
	    aspectRatio = null;
	    audienceRating = null;
	    audioFormat = new ArrayList<String>();
	    author = new ArrayList<String>();
	    binding = null;
	    brand = null;
	    catalogNumberList = null;
	    category = new ArrayList<String>();
	    cEROAgeRating = null;
	    clothingSize = null;
	    color = null;
	    creator = new ArrayList<Creator>();
	    department = null;
	    director = new ArrayList<String>();
	    eAN = null;
	    eANList = null;
	    edition = null;
	    eISBN = new ArrayList<String>();
	    energyEfficiencyClass = null;
	    episodeSequence = null;
	    eSRBAgeRating = null;
	    feature = new ArrayList<String>();
	    format = new ArrayList<String>();
	    genre = null;
	    hardwarePlatform = null;
	    hazardousMaterialType = null;
	    
	    
	    iSBN = null;
	    
	    
	    issuesPerYear = null;
	    itemDimensions = null;
	    itemPartNumber = null;
	    label = null;
	    languages = null;
	    legalDisclaimer = null;
	    listPrice = null;
	    magazineType = null;
	    manufacturer = null;
	    manufacturerMaximumAge = null;
	    manufacturerMinimumAge = null;
	    manufacturerPartsWarrantyDescription = null;
	    mediaType = null;
	    model = null;
	    
	    mPN = null;
	    
	    
	    
	    
	    
	    operatingSystem = null;
	    packageDimensions = null;
	    
	    partNumber = null;
	    pictureFormat = new ArrayList<String>();
	    platform = new ArrayList<String>();
	    productGroup = null;
	    productTypeName = null;
	    productTypeSubcategory = null;
	    publicationDate = null;
	    publisher = null;
	    regionCode = null;
	    releaseDate = null;
	    seasonSequence = null;
	    runningTime = null;
	    seikodoProductCode = null;
	    size = null;
	    sKU = null;
	    studio = null;
	    subscriptionLength = null;
	    title = null;
	    trackSequence = null;
	    tradeInValue = null;
	    uPC = null;
	    uPCList = null;
	    warranty = null;
	    wEEETaxValue = null;
	}

	public List<String> getActor() {
		return actor;
	}
	
	public void setActor(List<String> actor) {
		this.actor = actor;
	}

	public List<String> getArtist() {
		return artist;
	}
	
	public void setArtist(List<String> artist) {
		this.artist = artist;
	}

	public String getAspectRatio() {
		return aspectRatio;
	}
	
	public void setAspectRatio(String aspectRatio) {
		this.aspectRatio = aspectRatio;
	}

	public String getAudienceRating() {
		return audienceRating;
	}
	
	public void setAudienceRating(String audienceRating) {
		this.audienceRating = audienceRating;
	}

	public List<String> getAudioFormat() {
		return audioFormat;
	}
	
	public void setAudioFormat(List<String> audioFormat) {
		this.audioFormat = audioFormat;
	}

	public List<String> getAuthor() {
		return author;
	}
	
	public void setAuthor(List<String> author) {
		this.author = author;
	}

	public String getBinding() {
		return binding;
	}
	
	public void setBinding(String binding) {
		this.binding = binding;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.CatalogNumberList getCatalogNumberList() {
		return catalogNumberList;
	}
	
	public void setCatalogNumberList(com.amazon.webservices.AWSECommerceService._2013._08._01.CatalogNumberList catalogNumberList) {
		this.catalogNumberList = catalogNumberList;
	}

	public List<String> getCategory() {
		return category;
	}
	
	public void setCategory(List<String> category) {
		this.category = category;
	}

	public String getCEROAgeRating() {
		return cEROAgeRating;
	}
	
	public void setCEROAgeRating(String cEROAgeRating) {
		this.cEROAgeRating = cEROAgeRating;
	}

	public String getClothingSize() {
		return clothingSize;
	}
	
	public void setClothingSize(String clothingSize) {
		this.clothingSize = clothingSize;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public List<Creator> getCreator() {
		return creator;
	}
	
	public void setCreator(List<Creator> creator) {
		this.creator = creator;
	}

	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	public List<String> getDirector() {
		return director;
	}
	
	public void setDirector(List<String> director) {
		this.director = director;
	}

	public String getEAN() {
		return eAN;
	}
	
	public void setEAN(String eAN) {
		this.eAN = eAN;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.EANList getEANList() {
		return eANList;
	}
	
	public void setEANList(com.amazon.webservices.AWSECommerceService._2013._08._01.EANList eANList) {
		this.eANList = eANList;
	}

	public String getEdition() {
		return edition;
	}
	
	public void setEdition(String edition) {
		this.edition = edition;
	}

	public List<String> getEISBN() {
		return eISBN;
	}
	
	public void setEISBN(List<String> eISBN) {
		this.eISBN = eISBN;
	}

	public String getEnergyEfficiencyClass() {
		return energyEfficiencyClass;
	}
	
	public void setEnergyEfficiencyClass(String energyEfficiencyClass) {
		this.energyEfficiencyClass = energyEfficiencyClass;
	}

	public String getEpisodeSequence() {
		return episodeSequence;
	}
	
	public void setEpisodeSequence(String episodeSequence) {
		this.episodeSequence = episodeSequence;
	}

	public String getESRBAgeRating() {
		return eSRBAgeRating;
	}
	
	public void setESRBAgeRating(String eSRBAgeRating) {
		this.eSRBAgeRating = eSRBAgeRating;
	}

	public List<String> getFeature() {
		return feature;
	}
	
	public void setFeature(List<String> feature) {
		this.feature = feature;
	}

	public List<String> getFormat() {
		return format;
	}
	
	public void setFormat(List<String> format) {
		this.format = format;
	}

	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getHardwarePlatform() {
		return hardwarePlatform;
	}
	
	public void setHardwarePlatform(String hardwarePlatform) {
		this.hardwarePlatform = hardwarePlatform;
	}

	public String getHazardousMaterialType() {
		return hazardousMaterialType;
	}
	
	public void setHazardousMaterialType(String hazardousMaterialType) {
		this.hazardousMaterialType = hazardousMaterialType;
	}

	public boolean getIsAdultProduct() {
		return isAdultProduct;
	}
	
	public void setIsAdultProduct(boolean isAdultProduct) {
		this.isAdultProduct = isAdultProduct;
	}

	public boolean getIsAutographed() {
		return isAutographed;
	}
	
	public void setIsAutographed(boolean isAutographed) {
		this.isAutographed = isAutographed;
	}

	public String getISBN() {
		return iSBN;
	}
	
	public void setISBN(String iSBN) {
		this.iSBN = iSBN;
	}

	public boolean getIsEligibleForTradeIn() {
		return isEligibleForTradeIn;
	}
	
	public void setIsEligibleForTradeIn(boolean isEligibleForTradeIn) {
		this.isEligibleForTradeIn = isEligibleForTradeIn;
	}

	public boolean getIsMemorabilia() {
		return isMemorabilia;
	}
	
	public void setIsMemorabilia(boolean isMemorabilia) {
		this.isMemorabilia = isMemorabilia;
	}

	public String getIssuesPerYear() {
		return issuesPerYear;
	}
	
	public void setIssuesPerYear(String issuesPerYear) {
		this.issuesPerYear = issuesPerYear;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.ItemDimensions getItemDimensions() {
		return itemDimensions;
	}
	
	public void setItemDimensions(com.amazon.webservices.AWSECommerceService._2013._08._01.ItemDimensions itemDimensions) {
		this.itemDimensions = itemDimensions;
	}

	public String getItemPartNumber() {
		return itemPartNumber;
	}
	
	public void setItemPartNumber(String itemPartNumber) {
		this.itemPartNumber = itemPartNumber;
	}

	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Languages getLanguages() {
		return languages;
	}
	
	public void setLanguages(com.amazon.webservices.AWSECommerceService._2013._08._01.Languages languages) {
		this.languages = languages;
	}

	public String getLegalDisclaimer() {
		return legalDisclaimer;
	}
	
	public void setLegalDisclaimer(String legalDisclaimer) {
		this.legalDisclaimer = legalDisclaimer;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getListPrice() {
		return listPrice;
	}
	
	public void setListPrice(com.amazon.webservices.AWSECommerceService._2013._08._01.Price listPrice) {
		this.listPrice = listPrice;
	}

	public String getMagazineType() {
		return magazineType;
	}
	
	public void setMagazineType(String magazineType) {
		this.magazineType = magazineType;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits getManufacturerMaximumAge() {
		return manufacturerMaximumAge;
	}
	
	public void setManufacturerMaximumAge(com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits manufacturerMaximumAge) {
		this.manufacturerMaximumAge = manufacturerMaximumAge;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits getManufacturerMinimumAge() {
		return manufacturerMinimumAge;
	}
	
	public void setManufacturerMinimumAge(com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits manufacturerMinimumAge) {
		this.manufacturerMinimumAge = manufacturerMinimumAge;
	}

	public String getManufacturerPartsWarrantyDescription() {
		return manufacturerPartsWarrantyDescription;
	}
	
	public void setManufacturerPartsWarrantyDescription(String manufacturerPartsWarrantyDescription) {
		this.manufacturerPartsWarrantyDescription = manufacturerPartsWarrantyDescription;
	}

	public String getMediaType() {
		return mediaType;
	}
	
	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public int getModelYear() {
		return modelYear;
	}
	
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public String getMPN() {
		return mPN;
	}
	
	public void setMPN(String mPN) {
		this.mPN = mPN;
	}

	public int getNumberOfDiscs() {
		return numberOfDiscs;
	}
	
	public void setNumberOfDiscs(int numberOfDiscs) {
		this.numberOfDiscs = numberOfDiscs;
	}

	public int getNumberOfIssues() {
		return numberOfIssues;
	}
	
	public void setNumberOfIssues(int numberOfIssues) {
		this.numberOfIssues = numberOfIssues;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}
	
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}
	
	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}
	
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.PackageDimensions getPackageDimensions() {
		return packageDimensions;
	}
	
	public void setPackageDimensions(com.amazon.webservices.AWSECommerceService._2013._08._01.PackageDimensions packageDimensions) {
		this.packageDimensions = packageDimensions;
	}

	public int getPackageQuantity() {
		return packageQuantity;
	}
	
	public void setPackageQuantity(int packageQuantity) {
		this.packageQuantity = packageQuantity;
	}

	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public List<String> getPictureFormat() {
		return pictureFormat;
	}
	
	public void setPictureFormat(List<String> pictureFormat) {
		this.pictureFormat = pictureFormat;
	}

	public List<String> getPlatform() {
		return platform;
	}
	
	public void setPlatform(List<String> platform) {
		this.platform = platform;
	}

	public String getProductGroup() {
		return productGroup;
	}
	
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	public String getProductTypeName() {
		return productTypeName;
	}
	
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public String getProductTypeSubcategory() {
		return productTypeSubcategory;
	}
	
	public void setProductTypeSubcategory(String productTypeSubcategory) {
		this.productTypeSubcategory = productTypeSubcategory;
	}

	public String getPublicationDate() {
		return publicationDate;
	}
	
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getRegionCode() {
		return regionCode;
	}
	
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSeasonSequence() {
		return seasonSequence;
	}
	
	public void setSeasonSequence(String seasonSequence) {
		this.seasonSequence = seasonSequence;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits getRunningTime() {
		return runningTime;
	}
	
	public void setRunningTime(com.amazon.webservices.AWSECommerceService._2013._08._01.DecimalWithUnits runningTime) {
		this.runningTime = runningTime;
	}

	public String getSeikodoProductCode() {
		return seikodoProductCode;
	}
	
	public void setSeikodoProductCode(String seikodoProductCode) {
		this.seikodoProductCode = seikodoProductCode;
	}

	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}

	public String getSKU() {
		return sKU;
	}
	
	public void setSKU(String sKU) {
		this.sKU = sKU;
	}

	public String getStudio() {
		return studio;
	}
	
	public void setStudio(String studio) {
		this.studio = studio;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.NonNegativeIntegerWithUnits getSubscriptionLength() {
		return subscriptionLength;
	}
	
	public void setSubscriptionLength(com.amazon.webservices.AWSECommerceService._2013._08._01.NonNegativeIntegerWithUnits subscriptionLength) {
		this.subscriptionLength = subscriptionLength;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTrackSequence() {
		return trackSequence;
	}
	
	public void setTrackSequence(String trackSequence) {
		this.trackSequence = trackSequence;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getTradeInValue() {
		return tradeInValue;
	}
	
	public void setTradeInValue(com.amazon.webservices.AWSECommerceService._2013._08._01.Price tradeInValue) {
		this.tradeInValue = tradeInValue;
	}

	public String getUPC() {
		return uPC;
	}
	
	public void setUPC(String uPC) {
		this.uPC = uPC;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.UPCList getUPCList() {
		return uPCList;
	}
	
	public void setUPCList(com.amazon.webservices.AWSECommerceService._2013._08._01.UPCList uPCList) {
		this.uPCList = uPCList;
	}

	public String getWarranty() {
		return warranty;
	}
	
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public com.amazon.webservices.AWSECommerceService._2013._08._01.Price getWEEETaxValue() {
		return wEEETaxValue;
	}
	
	public void setWEEETaxValue(com.amazon.webservices.AWSECommerceService._2013._08._01.Price wEEETaxValue) {
		this.wEEETaxValue = wEEETaxValue;
	}
}