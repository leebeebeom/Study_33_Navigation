package com.example.a33_navigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavAction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private NavController mNavController;
    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //NavController 객체 생성
        mNavController = Navigation.findNavController(this, R.id.nav_host_fragment_container);
        //AppBarConfiguration 객체 생성
        mAppBarConfiguration = new AppBarConfiguration.Builder(mNavController.getGraph()).build();
        //NavigationUI 설정
        NavigationUI.setupActionBarWithNavController(this, mNavController, mAppBarConfiguration);

    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(mNavController, mAppBarConfiguration) || super.onSupportNavigateUp();
    }
}