package com.onaar.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WypiekiDao {

    @Insert
    public void wstawWypiekDoBazy(Wypieki wypieki);
    @Insert
    public void wstawKilkaWypiekow(Wypieki ...wypiekis);
    @Delete
    public void usunZBazy(Wypieki wypieki);
    @Update
    public void zaaktualizuj(Wypieki wypieki);

    @Query("SELECT * from `wypieki_tabela`")
    List<Wypieki> zwrocWszystkieWypiekiZBazyDanych();

    @Query("SELECT nazwa from `wypieki_tabela` where czas_pieczenia < :czas")
    List<String> zwrocNazwyWypiekow(int czas);
}