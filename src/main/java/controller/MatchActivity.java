package controller;

import model.ActivityTipeEnum;
import model.Wheater;

public class MatchActivity {

    public ActivityTipeEnum matchingActivity(Wheater wheater) {

        String weatherDescription = wheater.getDescriptions();

        return switch (weatherDescription) {
            case "Sunny", "Clear" -> ActivityTipeEnum.recreational;
            case "Partly cloudy" -> ActivityTipeEnum.social;
            case "Light rain", "Light rain shower", "Moderate rain", "Patchy rain nearby" -> ActivityTipeEnum.education;
            case "Mist", "Haze" -> ActivityTipeEnum.relaxation;
            case "Overcast" -> ActivityTipeEnum.busywork;
            default -> throw new RuntimeException("Weather description not exist");
        };

    }
}
