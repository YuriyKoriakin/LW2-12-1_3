package com.brainacad.oop.testenum1;

/**
 * Created by Yuriy on 11.03.2016.
 */
public enum MyDayOfWeek {//створюємо enum
    SUNDAY,//кожен запис є обєктом
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    public String nextDay() {

        int numberEnum = this.ordinal() + 1;
        if (numberEnum >= 7) {
            return "SUNDAY";
        } else {
            return MyDayOfWeek.values()[numberEnum].toString();
        }
    }

    }

