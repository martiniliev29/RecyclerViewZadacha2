package com.example.recyclerviewzadacha;

public class Movie   {
    private String zaglavie;
    private String janr;
    private int godinaIzdavane;

    public Movie(String zaglavie, String janr, int godinaIzdavane) {
        this.zaglavie = zaglavie;
        this.janr = janr;
        this.godinaIzdavane = godinaIzdavane;
    }


    public String getZaglavie() {
        return zaglavie;
    }

    public String getJanr() {
        return janr;
    }

    public int getGodinaIzdavane() {
        return godinaIzdavane;
    }

}
