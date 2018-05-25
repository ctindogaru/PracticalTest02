package ro.pub.cs.systems.eim.practicaltest02.model;

public class WeatherForecastInformation {

    private String updated;
    private String eur;
    private String usd;

    public WeatherForecastInformation() {
        this.updated = null;
        this.eur = null;
        this.usd = null;
    }

    public WeatherForecastInformation(String updated, String eur, String usd) {
        this.updated = updated;
        this.eur = eur;
        this.usd = usd;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getEur() {
        return eur;
    }

    public void setEur(String eur) {
        this.eur = eur;
    }

    public String getUsd() {
        return usd;
    }

    public void setUsd(String usd) {
        this.usd = usd;
    }

    public String eurToString() {
        return "Curs{" +
                "updated='" + updated + '\'' +
                ", eur='" + eur + '\'' +
                '}';
    }

    public String usdToString() {
        return "Curs{" +
                "updated='" + updated + '\'' +
                ", usd='" + usd + '\'' +
                '}';
    }
}
