package RestAssuredTestCase;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test_POST {
	@Test
public void PutRequest() {
	JSONObject Json=new JSONObject();
    Json.put("name","BRYANT");
    Json.put("job", "BA");

    Response resp=RestAssured
    		.given()
    		.contentType(ContentType.JSON)
    		.body(Json.toString())

    		.post("https://reqres.in/api/users ");

    		System.out.println(resp.statusCode());
    		System.out.println(resp.asString());
	
}
}
