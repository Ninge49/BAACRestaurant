package com.example.baac.baacrestaurant;

import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private UserTABLE objUserTABLE;
    private FoodTABLE objFoodTABLE;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create & Connect Database
        createAndConnect();

        //Test Add New Value
        //testAdd();

        //Delete Database
        deleteAllSQLite();

    } //Main Method

    private void deleteAllSQLite() {
        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase("BAAC.db", MODE_PRIVATE, null);
        objSqLiteDatabase.delete("userTABLE",null,null);
        objSqLiteDatabase.delete("foodTABLE",null,null);
    }

    private void testAdd() {
        objUserTABLE.addNewUser("testUser","testPassword","testทดสอบชื่อภาษาไทย");
        objFoodTABLE.addNewFood("testFood","testSource","testPrice");
    }

    private void createAndConnect() {
        objUserTABLE = new UserTABLE(this);
        objFoodTABLE = new FoodTABLE(this);
    }

} //Main Class
