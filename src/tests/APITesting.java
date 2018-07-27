package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class APITesting {
	
	@Test
	public void testGetAPI() {
		
		RestAssured.baseURI = "https://easy.techmahindra.com/EasyLogin.aspx";
		RequestSpecification httpRequest = RestAssured.given();
		io.restassured.response.Response response = httpRequest.get();
		// Get the status code from the Response. In case of 
		// a successful interaction with the web service, we
		// should get a status code of 200.
		int statusCode = response.getStatusCode();
		System.out.println("Status Line: " + response.getStatusLine());
		System.out.println("Headers: " + response.getHeaders());
		System.out.println("Class: " +response.getClass().toString());
		// Assert that correct status code is returned.
		System.out.println(statusCode);
		Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
		
		
		
	}
	
	

}
