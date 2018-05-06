package com.example.pratik.ghuamunepal.home;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.example.pratik.ghuamunepal.utils.BottomNavigationViewHelper;
import com.example.pratik.ghuamunepal.R;
import com.example.pratik.ghuamunepal.utils.RecyclerViewDataAdapter;
import com.example.pratik.ghuamunepal.utils.SectionDataModel;
import com.example.pratik.ghuamunepal.utils.SingleItemModel;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private static final int ACTIVITY_NUM = 0;
    private ArrayList<SectionDataModel> allSampleData;
    private Context mcontext = HomeActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        allSampleData = new ArrayList<>();

        setupButtomNavigationView();
        setRecyclerView();
        createData();

    }
   private void setRecyclerView() {
       RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
       recyclerView.setHasFixedSize(true);
       RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(allSampleData, this);
       recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
       recyclerView.setAdapter(adapter);
   }
   private void setupButtomNavigationView() {
        BottomNavigationViewEx bottomNavigationViewEx=findViewById(R.id.bottomNavView);
        BottomNavigationViewHelper.setupButtomNavigationView(bottomNavigationViewEx );
        BottomNavigationViewHelper.enableNavigation(mcontext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
    private void createData(){
        for (int i = 1; i <= 20; i++) {
            SectionDataModel dm = new SectionDataModel();
            dm.setHeaderTitle("Topic  " +i);
            ArrayList<SingleItemModel> singleItemModels= new ArrayList<>();
            for (int j = 1; j <= 20; j++) {
                if(i==1)
                    singleItemModels.add(new SingleItemModel("ABC " +i+j, "Annapurna Area","Time: 1week, Difficulty: Beginner",R.raw.nearbymeimage));
                else if(i==2)
                    singleItemModels.add(new SingleItemModel("Poon Hill " +i+j, "Pokhara","Time: 3 days, Difficulty: Beginner",R.raw.poonhill));
                else if(i==3)
                    singleItemModels.add(new SingleItemModel("Rara " +i+j, "Mugu","Time: 5 days, Difficulty: Beginner",R.raw.rara));
                else
                    singleItemModels.add(new SingleItemModel("Mt. Everest " +i+j, "Solukhumbhu","Time: 1 Months, Difficulty: Sure Marxas Fucche",R.raw.mteverest));
            }
            dm.setAllItemInSection(singleItemModels);
            allSampleData.add(dm);
        }
    }
}
