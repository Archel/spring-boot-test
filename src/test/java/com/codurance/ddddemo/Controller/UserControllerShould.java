package com.codurance.ddddemo.Controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static com.codurance.ddddemo.helpers.RestAssuredHelpers.givenJsonApi;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerShould {
    @LocalServerPort
    private int port;

    @Test
    public void
    retrieve_the_user_by_id() {
        givenJsonApi(port)
                .when()
                .get("/users/1921ef2c-d023-4a39-b01e-bba58b3e051b")
                .then()
                .statusCode(HttpStatus.OK.value())
                .assertThat()
                .body("userId", equalTo("1921ef2c-d023-4a39-b01e-bba58b3e051b"))
                .body("name", equalTo("Manolo"))
                .body("surname", equalTo("Villuela"));
    }

}



