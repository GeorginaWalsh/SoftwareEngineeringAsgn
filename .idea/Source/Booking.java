public class Booking {

    private String name, date, time, location;
    private int group;

    public Booking(String name, String date, String time, String location, int group) {
        name = this.name;
        date = this.date;
        time = this.time;
        location = this.location;
        group = this.group;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public int getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
