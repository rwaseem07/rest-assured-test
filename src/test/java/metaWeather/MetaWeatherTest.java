package metaWeather;

import entities.LocationResponse;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MetaWeatherTest {

    private static final String CITY_NAME = "Nottingham";

    @Test
    public void testLocationWeatherUpdate() {

        SoftAssert softAssert = new SoftAssert();
        MetaWeather metaWeather = new MetaWeather();

        int locationId = metaWeather.getLocationId(CITY_NAME);

        List<LocationResponse> locationResponseList = metaWeather.getLocationWeather(locationId, null);



        for(int i = 0; i< locationResponseList.size(); i++){
            LocationResponse obj = locationResponseList.get(i);
            softAssert.assertNotNull(obj.getApplicable_date());
            softAssert.assertNotNull(obj.getAir_pressure());
            softAssert.assertNotNull(obj.getCreated());
            softAssert.assertNotNull(obj.getHumidity());
            softAssert.assertNotNull(obj.getAir_pressure());
            softAssert.assertNotNull(obj.getId());
            softAssert.assertNotNull(obj.getMax_temp());
            softAssert.assertNotNull(obj.getCreated());
            softAssert.assertNotNull(obj.getMin_temp());
            softAssert.assertNotNull(obj.getWind_direction());
            softAssert.assertNotNull(obj.getPredictability());
            softAssert.assertNotNull(obj.getWind_speed());
            softAssert.assertNotNull(obj.getWind_direction_compass());
            softAssert.assertNotNull(obj.getWeather_state_abbr());
            softAssert.assertNotNull(obj.getWeather_state_name());
        }
        softAssert.assertAll();
    }
}