import java.util.Map;

public class ModelJSON {
    private int id;
    private String name;
    private String state;
    private String country;
    private Map<String, Double> coord;
    private double lon;
    private double lat;
    private boolean isSearched = false;

    public Map<String, Double> getCoord() {
        return coord;
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

    public boolean isSearched() {
        return isSearched;
    }

    public void setSearched(boolean searched) {
        isSearched = searched;
    }

    public String toString() {
        return "{\"id\": " + id + ", \"name\": " + "\"" + name + "\"" +
                ", \"state\": " + "\"" + state + "\"" + ", \"country\": "
                + "\"" + country + "\"" +", " + coord.toString()
                .replace("{", "\"")
                .replace("lat", "\"lat")
                .replace("=", "\": ");

    }
}