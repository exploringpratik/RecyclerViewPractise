package com.example.pratik.ghuamunepal.maal;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.pratik.ghuamunepal.R;
import com.example.pratik.ghuamunepal.utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MaalActivity extends AppCompatActivity {
    private static final int ACTIVITY_NUM = 1;
    private Context mcontext = MaalActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupButtomNavigationView();
    }
    private void setupButtomNavigationView()
    {

        BottomNavigationViewEx bottomNavigationViewEx=findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.setupButtomNavigationView(bottomNavigationViewEx );
        BottomNavigationViewHelper.enableNavigation(mcontext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

}
