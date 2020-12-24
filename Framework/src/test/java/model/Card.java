package model;

public class Card {
    private String number;
    private String cvv;
    private String month;
    private String year;
    private String name;
    private String errorCode;

    public Card(String number, String cvv, String month, String year, String name, String errorCode){
        this.number = number;
        this.cvv = cvv;
        this.month = month;
        this.year = year;
        this.name = name;
        this.errorCode = errorCode;
    }

    public String getName() {
        return name;
    }

    public String getCvv() {
        return cvv;
    }

    public String getMonth() {
        return month;
    }

    public String getNumber() {
        return number;
    }

    public String getYear() {
        return year;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
