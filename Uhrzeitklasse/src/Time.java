public class Time {
    private int totalSeconds;

    public Time() {
        this.totalSeconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
        this.totalSeconds = hours * 3600 + minutes * 60 + seconds;
    }

    public int getHours() {
        return totalSeconds / 3600;
    }

    public int getMinutes() {
        return (totalSeconds % 3600) / 60;
    }

    public int getSeconds() {
        return totalSeconds % 60;
    }

    public void setHours(int hours) {
        totalSeconds = hours * 3600 + getMinutes() * 60 + getSeconds();
    }

    public void setMinutes(int minutes) {
        totalSeconds = getHours() * 3600 + minutes * 60 + getSeconds();
    }

    public void setSeconds(int seconds) {
        totalSeconds = getHours() * 3600 + getMinutes() * 60 + seconds;
    }

    public Time addSeconds(int seconds) {
        return new Time(0, 0, totalSeconds + seconds);
    }

    public Time subtract(Time otherTime) {
        int diffSeconds = this.totalSeconds - otherTime.totalSeconds;
        return new Time(0, 0, diffSeconds);
    }

    @Override
    public String toString() {
        int hours = getHours();
        int minutes = getMinutes();
        int seconds = getSeconds();
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

}