package com.digitalml.rest.resources.codegentest.service.AWSECommerceService;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Principal;

import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.ws.rs.core.SecurityContext;

import org.apache.commons.lang.StringUtils;

/**
 * Sandbox implementation for: AWSECommerceService
 * 120
 *
 * @author admin
 * @version 1.0
 *
 */

public class AWSECommerceServiceServiceSandboxImpl extends AWSECommerceServiceService {
	

    public CartAddCurrentStateDTO cartAddUseCaseStep1(CartAddCurrentStateDTO currentState) {
    

        CartAddReturnStatusDTO returnStatus = new CartAddReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public BrowseNodeLookupCurrentStateDTO browseNodeLookupUseCaseStep1(BrowseNodeLookupCurrentStateDTO currentState) {
    

        BrowseNodeLookupReturnStatusDTO returnStatus = new BrowseNodeLookupReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public CartModifyCurrentStateDTO cartModifyUseCaseStep1(CartModifyCurrentStateDTO currentState) {
    

        CartModifyReturnStatusDTO returnStatus = new CartModifyReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public CartGetCurrentStateDTO cartGetUseCaseStep1(CartGetCurrentStateDTO currentState) {
    

        CartGetReturnStatusDTO returnStatus = new CartGetReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public CartCreateCurrentStateDTO cartCreateUseCaseStep1(CartCreateCurrentStateDTO currentState) {
    

        CartCreateReturnStatusDTO returnStatus = new CartCreateReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public ItemSearchCurrentStateDTO itemSearchUseCaseStep1(ItemSearchCurrentStateDTO currentState) {
    

        ItemSearchReturnStatusDTO returnStatus = new ItemSearchReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public CartClearCurrentStateDTO cartClearUseCaseStep1(CartClearCurrentStateDTO currentState) {
    

        CartClearReturnStatusDTO returnStatus = new CartClearReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public SimilarityLookupCurrentStateDTO similarityLookupUseCaseStep1(SimilarityLookupCurrentStateDTO currentState) {
    

        SimilarityLookupReturnStatusDTO returnStatus = new SimilarityLookupReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


    public ItemLookupCurrentStateDTO itemLookupUseCaseStep1(ItemLookupCurrentStateDTO currentState) {
    

        ItemLookupReturnStatusDTO returnStatus = new ItemLookupReturnStatusDTO();
    	returnStatus.setExceptionMessage("Exception thrown in Step. The Error code is: . Description: ");
	    currentState.setErrorState(returnStatus);
	   	return currentState;
		        };


	/**
	 * Creates and returns a {@link Method} object using reflection and handles the possible exceptions.
	 * <br/>
	 * Aids with calling the process step method based on the outcome of the control logic
	 * 
	 * @param methodName
	 * @param clazz
	 * @return
	 */
	private Method getMethod(String methodName, Class clazz) {
		Method method = null;
		try {
			method = AWSECommerceServiceService.class.getMethod(methodName, clazz);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		return method;
	}
	
	/**
	 * For use when calling provider systems.
	 * <p>
	 * TODO: Implement security logic here
	 */
	protected SecurityContext securityContext = new SecurityContext() {

		@Override
		public boolean isUserInRole(String arg0) {
			return true;
		}

		@Override
		public boolean isSecure() {
			return false;
		}

		@Override
		public Principal getUserPrincipal() {
			return null;
		}

		@Override
		public String getAuthenticationScheme() {
			return null;
		}
	};
}