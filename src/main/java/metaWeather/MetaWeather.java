package metaWeather;

import entities.LocationResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.var;
import util.Utilities;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class MetaWeather {

    public List<LocationResponse> getLocationWeather(int cityWoeid, Date date) {

        date = date == null ? new Date() : date;

        RestAssured.baseURI = "https://www.metaweather.com";
        String LOCATION_BASE_URL = "/api/location/";

        String convertedDate = Utilities.getTomorrowDate(date);

        Response response  = given()
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get(LOCATION_BASE_URL + cityWoeid + "/"+ convertedDate)
                .then()
                .statusCode(200)
                .extract()
                .response();

        List<LocationResponse> metaWeatherApiResponseList = Arrays.asList(response.getBody().as(LocationResponse[].class));

        return metaWeatherApiResponseList;
    }



    public int getLocationId(String City_Query_Param) {

        RestAssured.baseURI = "https://www.metaweather.com";
        String LOCATION_SEARCH_BASE_URL = "/api/location/search";

        var response = (List<Integer>) given()
                .queryParam("query", City_Query_Param)
                .header("Content-Type", "application/json")
                .when()
                .get(LOCATION_SEARCH_BASE_URL)
                .then()
                .assertThat().statusCode(200)
                .body("[0].title", equalTo(City_Query_Param))
                .extract()
                .path("woeid");

        return response.get(0);
    }
}
