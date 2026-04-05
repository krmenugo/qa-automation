package com.carmen.qaautomation;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserApiTest {

    @Test
    public void shouldGetUsers() {
        RestAssured.baseURI = "http://localhost:8080";

        given()
                .when()
                .get("/api/users")
                .then()
                .statusCode(200)
                .body("size()", greaterThan(0));
    }
}