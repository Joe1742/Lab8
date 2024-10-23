package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomListTest {
    private CustomList list;

    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * increase the list by adding a new city
     * check if our current list contain the city that just add
     */
    @Test
    void testhasCity(){
        list = MockCityList();
        City city = new City("Regina", "Saskatchewan");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    /**
     * check there is no city in list
     * increase the list by adding a new city
     * check there is only one city in the list
     * decrease the list by delete a new city
     * check there is no city in the list
     */
    @Test
    void testdelete(){
        list = MockCityList();
        City city = new City("Regina", "Saskatchewan");
        assertEquals(0,list.getCount());
        list.addCity(city);
        assertEquals(1,list.getCount());
        list.delete(city);
        assertEquals(0,list.getCount());
    }
}