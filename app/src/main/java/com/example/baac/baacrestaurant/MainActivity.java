package com.example.baac.baacrestaurant;

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
        testAdd();

    } //Main Method

    private void testAdd() {
        objUserTABLE.addNewUser("testUser","testPassword","testทดสอบชื่อภาษาไทย");
        objFoodTABLE.addNewFood("testFood","testSource","testPrice");
    }

    private void createAndConnect() {
        objUserTABLE = new UserTABLE(this);
        objFoodTABLE = new FoodTABLE(this);
    }

} //Main Class
