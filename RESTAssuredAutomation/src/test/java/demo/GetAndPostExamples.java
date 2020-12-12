package demo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class GetAndPostExamples {
	
	//@Test
	public void getTest() {
		
		baseURI = "https://reqres.in/api";
		given().
			get("/users?page=2").
			then().
			statusCode(200).
			body("data[1].id", equalTo(8)).
			body("data.first_name", hasItems("Michael", "Lindsay","ABC")).
			log().all();
			
	}
	
	@Test
	public void postTest() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("\"name\"", "Raghav");
		map.put("job", "Teacher");
		
		System.out.println(map);
		
	}
	
	
	
	
	
	
	

}
