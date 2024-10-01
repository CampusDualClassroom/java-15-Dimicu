package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, Date expirationDate) {
        super(name, uniqueId, responsibleId);
        this.expirationDate = expirationDate;
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }


    @Override
    public String getSpecificData() {

        StringBuilder frase = new StringBuilder();
        frase.append("Localizacion : ");
        frase.append(this.area);
        frase.append("Caducidad : ");
        frase.append(getFormattedDate(this.expirationDate));

        return frase.toString();
    }

    public void printSpecificData() {
        this.getSpecificData();
    }

    public String getFormattedDate(Object expirationDate) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(expirationDate);
    }

    public Object getExpirationDate() {
        return this.expirationDate;
    }
}
