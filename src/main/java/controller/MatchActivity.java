package controller;

import model.ActivityTipeEnum;
import model.Wheater;

public class MatchActivity {

    public ActivityTipeEnum matchingActivity(Wheater wheater){

        String weatherDescription=wheater.getDescriptions();

        if (weatherDescription.equals("Sunny")||weatherDescription.equals("clear")){

            return ActivityTipeEnum.recreational;

        } else if (weatherDescription.equals("partly cloudy")) {
            return ActivityTipeEnum.social;
        } else if (weatherDescription.equals("light rain")||weatherDescription.equals("light rain shower")||weatherDescription.equals("moderate rain")||weatherDescription.equals("patchy rain nearby")) {
            return ActivityTipeEnum.education;
        } else if (weatherDescription.equals("mist")||weatherDescription.equals("haze")) {

            return ActivityTipeEnum.relaxation;

        } else if (weatherDescription.equals("overcast")) {

            return ActivityTipeEnum.busywork;
        }else {
            throw new RuntimeException("Weather description not exist");
        }

    }

}
