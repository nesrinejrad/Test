package model;

public class TimeDuration {
    private int numberOfSerconds;


    public TimeDuration(int numberOfSerconds) {
        this.numberOfSerconds = numberOfSerconds;
    }

    @Override
    public String toString() {
        int numberOfHours= numberOfSerconds div 3600;
        int numberOfMinutes= (numberOfSerconds mod 3600 )div 60;
        int numberOfSerconds= this.numberOfSerconds mod 60;
        if(this.numberOfSerconds> 3600)
        return  numberOfHours+"h "+numberOfMinutes+"m "+numberOfSerconds+"s";
        if(this.numberOfSerconds <60)
            return  numberOfMinutes+"m "+numberOfSerconds+"s";
        else
            return  numberOfSerconds+"s";
    }
}
