package com.vladimirsimek.csgo;

public class State {
    private  String state;
    private  String continent;
    private  int area;
    private  long population;
    private  long gdp;
    private  String capital;
    private  String tld;
    private  String flag;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getGdp() {
        return gdp;
    }

    public void setGdp(long gdp) {
        this.gdp = gdp;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getTld() {
        return tld;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public State(String state, String continent, int area, long population, long gdp, String capital, String tld, String flag) {
        this.state = state;
        this.continent = continent;
        this.area = area;
        this.population = population;
        this.gdp = gdp;
        this.capital = capital;
        this.tld = tld;
        this.flag = flag;
    }
}
