package com.vahe;

public enum WeekDays {


    SUNDAY("kiraki"),
    MONDAY("erkushabti"),
    TUESDAY("ereqshapti"),
    FRIDAY("choreqshabt"),
    WEDNESDAY("hingshatpi"),
    THURSDAY("urbat"),
    SATURDAY("shabt");

    private final String armenianName;

    WeekDays(String name) {
        this.armenianName = name;
    }

    public String getArmenianName() {
        return this.armenianName;
    }


}
