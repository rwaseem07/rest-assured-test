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
            softAssert.assertNotNull(obj.getAir_pressure(),"get getAir_pressure is missing");
            softAssert.assertNotNull(obj.getCreated(),"get getCreated is missing");
            softAssert.assertNotNull(obj.getHumidity(),"get getHumidity is missing");
            softAssert.assertNotNull(obj.getAir_pressure(),"get getAir_pressure is missing");
            softAssert.assertNotNull(obj.getId(),"get getId is missing");
            softAssert.assertNotNull(obj.getMax_temp(),"get getMax_temp is missing");
            softAssert.assertNotNull(obj.getCreated(),"get getCreated is missing");
            softAssert.assertNotNull(obj.getMin_temp(),"get getMin_temp is missing");
            softAssert.assertNotNull(obj.getWind_direction(),"get getWind_direction is missing");
            softAssert.assertNotNull(obj.getPredictability(),"get getPredictability is missing");
            softAssert.assertNotNull(obj.getWind_speed(),"get getWind_speed is missing");
            softAssert.assertNotNull(obj.getWind_direction_compass(),"get getWind_direction_compass is missing");
            softAssert.assertNotNull(obj.getWeather_state_abbr(),"get getWeather_state_abbr is missing");
            softAssert.assertNotNull(obj.getWeather_state_name(),"get getWeather_state_name is missing");
        }
        softAssert.assertAll();
    }
}