package com.digitalml.rest.resources.codegentest.service;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import com.digitalml.rest.resources.codegentest.service.AWSECommerceService.AWSECommerceServiceServiceDefaultImpl;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartAddInputParametersDTO;
import com.digitalml.rest.resources.codegentest.service.AWSECommerceServiceService.CartAddReturnDTO;
import javax.ws.rs.core.SecurityContext;

public class CartAddTests {

	@Test
	public void testOperationCartAddBasicMapping()  {
		AWSECommerceServiceServiceDefaultImpl serviceDefaultImpl = new AWSECommerceServiceServiceDefaultImpl();
		CartAddInputParametersDTO inputs = new CartAddInputParametersDTO();
		inputs.setCartAdd(null);
		CartAddReturnDTO returnValue = serviceDefaultImpl.cartAdd(fullyAutheticatedSecurityContext, inputs);
		
		assertNotNull(returnValue);
		assertNotNull(returnValue.getCartAddResponse());				
	}
	

	private SecurityContext fullyAutheticatedSecurityContext = new SecurityContext() {

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