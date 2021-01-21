public class City {
    private int id;
    private String name;
    private String state;
    private String country;
    private double lon;
    private double lat;

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public City(int id, String name, String state, String country) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public String toString() {
        return "{" + "\"id\": " + id + ", \"name\": " + "\"" + name + "\"" +
                ", \"state\": " + "\"" + state + "\"" + ", \"country\": "
                + "\"" + country + "\"" + ", " + "\"lon\": " + lon + ", " + "\"lat\": " + lat + "}";
    }
}