package com.onaar.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "wypieki_tabela")
public class Wypieki {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nazwa;
    private String skladniki;
    @ColumnInfo(name = "temperatura_pieczenia")
    private int temperaturaPieczenia;
    @ColumnInfo(name = "czas_pieczenia")
    private int czasPieczenia;

    public Wypieki(int czasPieczenia, int temperaturaPieczenia, String skladniki, String nazwa) {
        id = 0;
        this.czasPieczenia = czasPieczenia;
        this.temperaturaPieczenia = temperaturaPieczenia;
        this.skladniki = skladniki;
        this.nazwa = nazwa;
    }

    public int getCzasPieczenia() {
        return czasPieczenia;
    }

    public void setCzasPieczenia(int czasPieczenia) {
        this.czasPieczenia = czasPieczenia;
    }

    public int getTemperaturaPieczenia() {
        return temperaturaPieczenia;
    }

    public void setTemperaturaPieczenia(int temperaturaPieczenia) {
        this.temperaturaPieczenia = temperaturaPieczenia;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
