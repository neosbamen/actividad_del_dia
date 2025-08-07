package controller;

import model.ActivityTipeEnum;
import model.Wheater;

public class MatchActivity {

    public ActivityTipeEnum matchingActivity(Wheater wheater){

        String weatherDescription=wheater.getDescriptions();

        if (weatherDescription.equals("Sunny")||weatherDescription.equals("clear")){

            return ActivityTipeEnum.recreational;

        } else if (weatherDescription.equals("Partly cloudy")) {
            return ActivityTipeEnum.social;
        } else if (weatherDescription.equals("Light rain")||weatherDescription.equals("Light rain shower")||weatherDescription.equals("Moderate rain")||weatherDescription.equals("Patchy rain nearby")) {
            return ActivityTipeEnum.education;
        } else if (weatherDescription.equals("Mist")||weatherDescription.equals("Haze")) {

            return ActivityTipeEnum.relaxation;

        } else if (weatherDescription.equals("Overcast")) {

            return ActivityTipeEnum.busywork;
        }else {
            throw new RuntimeException("Weather description not exist");
        }

    }

}
