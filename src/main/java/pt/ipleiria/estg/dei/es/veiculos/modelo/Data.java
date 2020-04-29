/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipleiria.estg.dei.es.veiculos.modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author luis
 */
public class Data {
    Calendar calendar;

    public Data(int dia, int mes, int ano)
    {
        calendar = new GregorianCalendar(
            ano,
            mes - 1,
            dia
        );
    }

    public static Data parse(String data)
        throws IllegalArgumentException, NumberFormatException
    {
        String[] splitted = data.split("/");
        if (splitted.length != 3) {
            throw new IllegalArgumentException("Data invalida");
        }

        return new Data(Integer.parseInt(splitted[0]), Integer.parseInt(splitted[1]) - 1, Integer.parseInt(splitted[2]));
    }

    public Calendar getCalendar()
    {
        return this.calendar;
    }

    public String toString()
    {
        return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)) + "/"
                + String.valueOf(calendar.get(Calendar.MONTH) + 1) + "/"
                + String.valueOf(calendar.get(Calendar.YEAR));
    }
}
