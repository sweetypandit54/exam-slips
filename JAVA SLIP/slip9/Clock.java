//slip 8
public class Clock 
{
    private int hours;
    private int minutes;
    private int seconds;
    private String timeMode; // AM or PM

    public Clock(int hours, int minutes, int seconds) 
    {
        setTime(hours, minutes, seconds);
    }

    public void setTime(int hours, int minutes, int seconds) 
    {
        if (isValidTime(hours, minutes, seconds)) 
        {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            this.timeMode = (hours < 12) ? "AM" : "PM";
        } else 
            System.out.println("Invalid time input.");
    }

    private boolean isValidTime(int hours, int minutes, int seconds) 
    {
        return (hours >= 0 && hours < 24) &&
               (minutes >= 0 && minutes < 60) &&
               (seconds >= 0 && seconds < 60);
    }

    public void displayTime() 
    {
        System.out.println("Time: " + String.format("%02d:%02d:%02d %s", 
        hours, minutes, seconds, timeMode));
    }

    public static void main(String[] args) 
    {
        Clock myClock = new Clock(22, 30, 45); // Example time: 2:30:45 PM
        myClock.displayTime();
    }
}
