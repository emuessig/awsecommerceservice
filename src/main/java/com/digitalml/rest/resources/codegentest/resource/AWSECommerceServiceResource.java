package com.digitalml.rest.resources.codegentest.resource;
        	
import java.lang.IllegalArgumentException;
import java.security.AccessControlException;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HttpMethod;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.SecurityContext;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
	
// Customer specific imports

// Service specific imports
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService;
	
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartAddReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartAddReturnDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartAddInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.BrowseNodeLookupReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.BrowseNodeLookupReturnDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.BrowseNodeLookupInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartModifyReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartModifyReturnDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartModifyInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartGetReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartGetReturnDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartGetInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartCreateReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartCreateReturnDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartCreateInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.ItemSearchReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.ItemSearchReturnDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.ItemSearchInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartClearReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartClearReturnDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartClearInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.SimilarityLookupReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.SimilarityLookupReturnDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.SimilarityLookupInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.ItemLookupReturnStatusDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.ItemLookupReturnDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.ItemLookupInputParametersDTO;
	
import com.digitalml.rest.resources.codegentest.*;
	
	/**
	 * Service: AWSECommerceService
	 * 120
	 *
	 * @author admin
	 * @version 1.0
	 *
	 */
	
	@Produces({ MediaType.TEXT_PLAIN })
	public class AWSECommerceServiceResource {
		
	private static final Logger LOGGER = LoggerFactory.getLogger(AWSECommerceServiceResource.class);
	
	@Context
	private SecurityContext securityContext;

	@Context
	private javax.ws.rs.core.Request request;

	@Context
	private HttpServletRequest httpRequest;

	private AWSECommerceServiceService delegateService;

	private String implementationClass = "com.digitalml.rest.resources.codegentest.service.AWSECommerceService.AWSECommerceServiceServiceDefaultImpl";

	public void setImplementationClass(String className) {
		implementationClass = className;
	}

	public void setImplementationClass(Class clazz) {
		if (clazz == null)
			throw new IllegalArgumentException("Parameter clazz cannot be null");

		implementationClass = clazz.getName();
	}
		
	private AWSECommerceServiceService getCurrentImplementation() {

		Object object = null;
		try {
			Class c = Class.forName(implementationClass, true, Thread.currentThread().getContextClassLoader());
			object = c.newInstance();

		} catch (ClassNotFoundException exc) {
			LOGGER.error(implementationClass + " not found");
			return null;

		} catch (IllegalAccessException exc) {
			LOGGER.error("Cannot access " + implementationClass);
			return null;

		} catch (InstantiationException exc) {
			LOGGER.error("Cannot instantiate " + implementationClass);
			return null;
		}

		if (!(object instanceof AWSECommerceServiceService)) {
			LOGGER.error(implementationClass + " is not an instance of " + AWSECommerceServiceService.class.getName());
			return null;
		}

		return (AWSECommerceServiceService)object;
	}
	
	{
		delegateService = getCurrentImplementation();
	}
	
	public void setSecurityContext(SecurityContext securityContext) {
		this.securityContext = securityContext;
	}


	/**
	Method: cartAdd
	*/
	
	@ApiOperation(nickname = "cartAdd", httpMethod = "GET", value = "CartAdd")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response cartAdd(
		 com.amazon.webservices.AWSECommerceService._2013._08._01.CartAdd cartAdd) {

		CartAddInputParametersDTO inputs = new AWSECommerceServiceService.CartAddInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setCartAdd(cartAdd);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CartAddReturnDTO returnValue = delegateService.cartAdd(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: browseNodeLookup
	*/
	
	@ApiOperation(nickname = "browseNodeLookup", httpMethod = "GET", value = "BrowseNodeLookup")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response browseNodeLookup(
		 com.amazon.webservices.AWSECommerceService._2013._08._01.BrowseNodeLookup browseNodeLookup) {

		BrowseNodeLookupInputParametersDTO inputs = new AWSECommerceServiceService.BrowseNodeLookupInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setBrowseNodeLookup(browseNodeLookup);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			BrowseNodeLookupReturnDTO returnValue = delegateService.browseNodeLookup(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: cartModify
	*/
	
	@ApiOperation(nickname = "cartModify", httpMethod = "GET", value = "CartModify")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response cartModify(
		 com.amazon.webservices.AWSECommerceService._2013._08._01.CartModify cartModify) {

		CartModifyInputParametersDTO inputs = new AWSECommerceServiceService.CartModifyInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setCartModify(cartModify);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CartModifyReturnDTO returnValue = delegateService.cartModify(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: cartGet
	*/
	
	@ApiOperation(nickname = "cartGet", httpMethod = "GET", value = "CartGet")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response cartGet(
		 com.amazon.webservices.AWSECommerceService._2013._08._01.CartGet cartGet) {

		CartGetInputParametersDTO inputs = new AWSECommerceServiceService.CartGetInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setCartGet(cartGet);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CartGetReturnDTO returnValue = delegateService.cartGet(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: cartCreate
	*/
	
	@ApiOperation(nickname = "cartCreate", httpMethod = "GET", value = "CartCreate")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response cartCreate(
		 com.amazon.webservices.AWSECommerceService._2013._08._01.CartCreate cartCreate) {

		CartCreateInputParametersDTO inputs = new AWSECommerceServiceService.CartCreateInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setCartCreate(cartCreate);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CartCreateReturnDTO returnValue = delegateService.cartCreate(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: itemSearch
	*/
	
	@ApiOperation(nickname = "itemSearch", httpMethod = "GET", value = "ItemSearch")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response itemSearch(
		 com.amazon.webservices.AWSECommerceService._2013._08._01.ItemSearch itemSearch) {

		ItemSearchInputParametersDTO inputs = new AWSECommerceServiceService.ItemSearchInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setItemSearch(itemSearch);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			ItemSearchReturnDTO returnValue = delegateService.itemSearch(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: cartClear
	*/
	
	@ApiOperation(nickname = "cartClear", httpMethod = "GET", value = "CartClear")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response cartClear(
		 com.amazon.webservices.AWSECommerceService._2013._08._01.CartClear cartClear) {

		CartClearInputParametersDTO inputs = new AWSECommerceServiceService.CartClearInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setCartClear(cartClear);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			CartClearReturnDTO returnValue = delegateService.cartClear(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: similarityLookup
	*/
	
	@ApiOperation(nickname = "similarityLookup", httpMethod = "GET", value = "SimilarityLookup")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response similarityLookup(
		 com.amazon.webservices.AWSECommerceService._2013._08._01.SimilarityLookup similarityLookup) {

		SimilarityLookupInputParametersDTO inputs = new AWSECommerceServiceService.SimilarityLookupInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setSimilarityLookup(similarityLookup);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			SimilarityLookupReturnDTO returnValue = delegateService.similarityLookup(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	
	/**
	Method: itemLookup
	*/
	
	@ApiOperation(nickname = "itemLookup", httpMethod = "GET", value = "ItemLookup")
	@ApiResponses({
	    @ApiResponse(code = 200, message = "Success"),
	    @ApiResponse(code = 403, message = "Authentication failed. The object has not been modified"),
	    @ApiResponse(code = 417, message = "Validation failed. The required fields were not present")
    })
	@GET
	public javax.ws.rs.core.Response itemLookup(
		 com.amazon.webservices.AWSECommerceService._2013._08._01.ItemLookup itemLookup) {

		ItemLookupInputParametersDTO inputs = new AWSECommerceServiceService.ItemLookupInputParametersDTO();
		// Prepare and check all input parameters

		inputs.setItemLookup(itemLookup);

		// Use JSR-303 validation annotations to ensure inputs are correct
		if (!inputs.validate()) {
			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(inputs.validateReport());
			return builder.build();
		}
	
		try {
			ItemLookupReturnDTO returnValue = delegateService.itemLookup(securityContext, inputs);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok(gson.toJson(returnValue));
			return builder.build();
			

		} catch (IllegalArgumentException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(417).entity(e.getMessage());
			return builder.build();

		} catch (AccessControlException e) {

			javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(403).entity(e.getMessage());
			return builder.build();

		} finally {
		}
	}
	

	/**
	* Generic ping method to allow callers to check if the service is up and running.
	*/
	@ApiResponses({ @ApiResponse(code = 200, message = "I'm alive!") })
	@GET
	@Path("/ping")
	public javax.ws.rs.core.Response pingAWSECommerceService() {
		javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.ok();
		return builder.build();
	}
}