package org.gso.brinder.match.model;

public class Coordonnee {
    private double longitude;
    private double latitude;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Coordonnee(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        String str="";
        str = str + "longitude: " + this.longitude + ' ';
        str = str + "latitude: " + this.latitude  ;
        return  str;
    }
}
