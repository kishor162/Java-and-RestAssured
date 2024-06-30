package Session03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PUTMethod {
	
	@Test
	public void test04()
	{ 
		
		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "Diwakar");		
		jsonData.put("job", "Tescher");
		
		RestAssured.baseURI="https://reqres.in/api/users/52";
		RestAssured.given().header("Content-type","application/json").
		contentType(ContentType.JSON).
		body(jsonData.toJSONString()).
		when().put().
		then().statusCode(200).log().all();
		
	}

}
