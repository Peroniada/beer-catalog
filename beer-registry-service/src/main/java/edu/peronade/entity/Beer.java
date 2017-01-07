package edu.peronade.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by peronade on 30.12.16.
 */

@Entity
public class Beer implements Drink {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String style;

    private String brewery;

    private double abv;

    private double blg;

    private int ibu;

    private int volume;

    private float score;

    public Beer() {
    }

    public Beer(String name, String style, String brewery, double abv, double blg, int ibu, int volume, float score) {
        this.name = name;
        this.style = style;
        this.brewery = brewery;
        this.abv = abv;
        this.blg = blg;
        this.ibu = ibu;
        this.volume = volume;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getBrewery() {
        return brewery;
    }

    public double getAbv() {
        return abv;
    }

    public double getBlg() {
        return blg;
    }

    public int getIbu() {
        return ibu;
    }

    public int getVolume() {
        return volume;
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", brewery='" + brewery + '\'' +
                ", abv=" + abv +
                ", blg=" + blg +
                ", ibu=" + ibu +
                ", volume=" + volume +
                ", score=" + score +
                '}';
    }
}
