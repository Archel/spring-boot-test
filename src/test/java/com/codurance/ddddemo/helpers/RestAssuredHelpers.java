package com.codurance.ddddemo.helpers;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import static io.restassured.http.ContentType.JSON;

public class RestAssuredHelpers {
    public static RequestSpecification givenJsonApi(int port) {
        return RestAssured.given().port(port).accept(JSON).contentType(JSON);
    }
}
