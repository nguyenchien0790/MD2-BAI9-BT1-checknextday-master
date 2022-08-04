package rikkei.academy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayMouthYearTest {
    @Test
    @DisplayName("case 1/1/2021")
    void testDay1Mouth1Year2021(){

        int day = 1;
        int month = 1;
        int year = 2021;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "2/1/2021";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 31/1/2021")
    void testDay31Mouth1Year2021(){

        int day = 31;
        int month = 1;
        int year = 2021;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "1/2/2021";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 30/4/2021")
    void testDay30Mouth4Year2021(){

        int day = 30;
        int month = 4;
        int year = 2021;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "1/5/2021";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 28/2/2018")
    void testDay28Mouth2Year2018(){

        int day = 28;
        int month = 2;
        int year = 2018;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "1/3/2018";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 28/2/2020")
    void testDay28Mouth2Year2020(){

        int day = 29;
        int month = 2;
        int year = 2020;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "1/3/2020";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 31/12/2019")
    void testDay31Month12Year2019(){

        int day = 31;
        int month = 12;
        int year = 2019;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "1/1/2020";
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 07/07/2015")
    void testDay31Month12Year2020(){

        int day = 30;
        int month = 11;
        int year = 2015;
        String result = DayMouthYear.NextDay(day,month,year);
        String expected = "1/12/2015";
        assertEquals(expected,result);
    }

}