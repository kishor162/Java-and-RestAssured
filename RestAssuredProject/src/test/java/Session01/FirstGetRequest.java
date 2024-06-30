package Session01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstGetRequest {
	
	@Test
	public void testacse01()
	{
		Response res = RestAssured.get("https://reqres.in/api/users");
		System.out.println(res);
		
		System.out.println(res.getStatusCode());
	}

}
