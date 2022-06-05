package APITests.Tests.UserTests.NegativeUserAccountTests;

import APITests.Setup.BaseSetup;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserUnauthorized extends BaseSetup {
    @Test
    public void getUser(){
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/users/" + userId)
                .then()
                .statusCode(401);
    }
}
