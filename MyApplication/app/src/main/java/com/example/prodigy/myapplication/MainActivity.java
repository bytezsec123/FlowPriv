package com.example.prodigy.myapplication;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {
    //drawerlayout is the code for the hamburger icon
    DrawerLayout drawerlayout;
    //the toolbar variable is the variable for the slide veiw itself
    Toolbar toolbar;
    //the action bar toggle is for the hamburger icon too
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerlayout =(DrawerLayout)findViewById(R.id.drawer_layout);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerlayout,toolbar
                ,R.string.drawer_open,R.string.drawer_close);


        drawerLayout.setDrawerListener(actionBarDrawerToggle);
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

}
