package Session03;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Test_DeleteMethod {
	
	@Test
	public void test_Case05(){
	RestAssured.baseURI="https://reqres.in/api/users/52";
	RestAssured.given().
	when().
		delete().
	then().
		statusCode(204).
		log().all();

}
}