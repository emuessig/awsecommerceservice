package com.digitalml.rest.resources.codegentest.resource;

import java.security.Principal;
import com.digitalml.rest.resources.codegentest.*;
import java.util.*;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

public class AWSECommerceServiceTests {

	@Test
	public void testResourceInitialisation() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		Assert.assertNotNull(resource);
	}

	@Test
	public void testResourcePing() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		Response response = resource.pingAWSECommerceService();
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCartAddNoSecurity() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(null);

		Response response = resource.cartAdd(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCartAddAuthorised() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.cartAdd(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationBrowseNodeLookupNoSecurity() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(null);

		Response response = resource.browseNodeLookup(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationBrowseNodeLookupAuthorised() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.browseNodeLookup(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCartModifyNoSecurity() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(null);

		Response response = resource.cartModify(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCartModifyAuthorised() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.cartModify(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCartGetNoSecurity() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(null);

		Response response = resource.cartGet(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCartGetAuthorised() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.cartGet(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCartCreateNoSecurity() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(null);

		Response response = resource.cartCreate(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCartCreateAuthorised() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.cartCreate(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationItemSearchNoSecurity() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(null);

		Response response = resource.itemSearch(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationItemSearchAuthorised() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.itemSearch(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationCartClearNoSecurity() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(null);

		Response response = resource.cartClear(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationCartClearAuthorised() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.cartClear(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationSimilarityLookupNoSecurity() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(null);

		Response response = resource.similarityLookup(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationSimilarityLookupAuthorised() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.similarityLookup(null);
		Assert.assertEquals(200, response.getStatus());
	}

	@Test
	public void testOperationItemLookupNoSecurity() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(null);

		Response response = resource.itemLookup(null);
		Assert.assertEquals(403, response.getStatus());
	}

	@Test
	public void testOperationItemLookupAuthorised() {
		AWSECommerceServiceResource resource = new AWSECommerceServiceResource();
		resource.setSecurityContext(fullyAutheticatedSecurityContext);

		Response response = resource.itemLookup(null);
		Assert.assertEquals(200, response.getStatus());
	}

	private SecurityContext unautheticatedSecurityContext = new SecurityContext() {

		@Override
		public boolean isUserInRole(String arg0) {
			return false;
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