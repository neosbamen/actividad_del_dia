package model;

public class Activity {

    private  String activity;

    public Activity(String activity){
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

