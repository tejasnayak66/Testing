package Steps;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.json.Json;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PUTreq {
	public static void MyPOSTReq() throws FileNotFoundException
	{
		File f=new File("../RestAssuredDemo/Existing2.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new  JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		

		Response resp=RestAssured
		.given()
		.contentType(ContentType.JSON)
		.body(jo.toString())

		.put("https://reqres.in/api/users ");

		System.out.println(resp.statusCode());
		System.out.println(resp.asString());
	}
}