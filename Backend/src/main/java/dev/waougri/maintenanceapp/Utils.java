package dev.waougri.maintenanceapp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String date ()
    {
        Date date = new Date(); // create a new Date object with the current date and time
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.format(date);
    }
}
