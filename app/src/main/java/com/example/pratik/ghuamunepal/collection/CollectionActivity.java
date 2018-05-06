package com.example.pratik.ghuamunepal.collection;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.pratik.ghuamunepal.utils.BottomNavigationViewHelper;
import com.example.pratik.ghuamunepal.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class CollectionActivity extends AppCompatActivity {
    private static final int ACTIVITY_NUM = 2;
    private Context mcontext = CollectionActivity.this;
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
