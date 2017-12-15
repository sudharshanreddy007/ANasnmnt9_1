package com.example.user.anasnmnt9_1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //here i have created main class
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//extends is for extending a class. implements is for implementing an interface
//AppCompatActivity is a parent class

    //private member is only accessible within the same class as it is declared
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Variables, methods, and constructors, which are declared protected in a superclass can be accessed only by the subclasses
        // in other package or any class within the package of the protected members class.
        //void is a Java keyword.  Used at method declaration and definition to specify that the method does not return any type,
        // the method returns void.
        //onCreate Called when the activity is first created. This is where you should do all of your normal static set up: create views,
        // bind data to lists, etc. This method also provides you with a Bundle containing the activity's previously frozen state,
        // if there was one.Always followed by onStart().
        //Bundle is most often used for passing data through various Activities.
// This callback is called only when there is a saved instance previously saved using onSaveInstanceState().
// We restore some state in onCreate() while we can optionally restore other state here, possibly usable after onStart() has
// completed.The savedInstanceState Bundle is same as the one used in onCreate().

        super.onCreate(savedInstanceState);
        // call the super class onCreate to complete the creation of activity like the view hierarchy

        setContentView(R.layout.activity_main);
        //R means Resource
        //layout means design

        //  main is the xml you have created under res->layout->main.xml
        //  Whenever you want to change your current Look of an Activity or when you move from one Activity to another .
        // The other Activity must have a design to show . So we call this method in onCreate and this is the second statement to set
        // the design
         getSupportActionBar();
        //Android action bar was introduced to maintain a consistent navigation across the application
        //A TextView displays text to the user and optionally allows them to edit it. A TextView is a complete text editor,
        // however the basic class is configured to not allow editing.

        textView = (TextView) findViewById(R.id.text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //// Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.mymenu,menu);
        ////Menu Resource, Menu
        return true;
        //we are inflating the menu by calling the inflate() method of MenuInflater class. To perform event handling on menu items,
        // you need to override onOptionsItemSelected() method of Activity class.


    }

    @Override
    /*Android Option Menus are the primary menus of android. They can be used for settings, search, delete item etc.
    */
    public boolean onOptionsItemSelected(MenuItem item) {
        //respond to menu item selection.The system will automatically call the "onOptionsItemSelected" method when
        // the user chooses any of the options menu items.
        //switch statement executes one statement from multiple conditions
        switch (item.getItemId())
        // getItemId() method queries the ID for the selected menu item, which you should assign to each menu item
        // in XML using the android:id attribute
        {
            //Add a case statement for each item in your menu.
            case R.id.red:
                //this refers to the id which is given in layout xml file
                //setTextColor is for setting text color
                textView.setTextColor(Color.RED);
                break;
            case R.id.green:
                textView.setTextColor(Color.GREEN);
                break;
            case R.id.blue:
                textView.setTextColor(Color.BLUE);
                break;
        }

        return true;
        //super keyword is used to refer the immediate parent class object.
    }
}