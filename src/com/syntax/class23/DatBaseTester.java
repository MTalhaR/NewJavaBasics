package com.syntax.class23;

public class DatBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new Oracle();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}
