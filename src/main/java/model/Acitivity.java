package model;

import controller.MatchActivity;

public class Acitivity {

    private  String activity;

    public Acitivity(String activity){
        this.activity=activity;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "Acitivity{" +
                "activity='" + activity + '\'' +
                '}';
    }
}

