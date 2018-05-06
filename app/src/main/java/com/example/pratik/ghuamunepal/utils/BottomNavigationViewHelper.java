package com.example.pratik.ghuamunepal.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.pratik.ghuamunepal.maal.MaalActivity;
import com.example.pratik.ghuamunepal.personal.PersonalActivity;
import com.example.pratik.ghuamunepal.R;
import com.example.pratik.ghuamunepal.collection.CollectionActivity;
import com.example.pratik.ghuamunepal.home.HomeActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by explo on 3/2/2018.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";
    public static void setupButtomNavigationView(BottomNavigationViewEx bottomNavigationViewEx)
    {
        Log.d(TAG, "setupButtomNavigationView: ");

        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context , BottomNavigationViewEx viewEx)
    {
        viewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.ic_home:
                        Intent intent = new Intent(context, HomeActivity.class); //0
                        context.startActivity(intent);
                        break;

                    case R.id.ic_maal:
                        Intent intent1 = new Intent(context, MaalActivity.class);    //1
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_collection:
                        Intent intent2 = new Intent(context, CollectionActivity.class);    //2
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_personal:
                        Intent intent3 = new Intent(context, PersonalActivity.class);    //3
                        context.startActivity(intent3);
                        break;


                }

                return false;
            }
        });
    }
}
