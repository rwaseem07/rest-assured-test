package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder


public class LocationResponse {
    private String id;
    private String weather_state_name;
    private String weather_state_abbr;
    private String wind_direction_compass;
    private String created;
    private String applicable_date;
    private String min_temp;
    private String max_temp;
    private String the_temp;
    private String wind_speed;
    private String wind_direction;
    private String air_pressure;
    private String humidity;
    private String visibility;
    private String predictability;

}
