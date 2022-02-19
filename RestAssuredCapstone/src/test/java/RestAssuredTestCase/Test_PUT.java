package RestAssuredTestCase;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test_PUT {
    
	@Test
	public void putRequest() {
		JSONObject Json=new JSONObject();
		Json.put("name","Raj");
		Json.put("job","QA");



		Response resp=RestAssured
		.given()
		.contentType(ContentType.JSON)
		.body(Json.toString())

		.put("https://reqres.in/api/users ");

		System.out.println(resp.statusCode());
		System.out.println(resp.asString());
	}
}
