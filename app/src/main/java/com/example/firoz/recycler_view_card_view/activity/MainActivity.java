package com.example.firoz.recycler_view_card_view.activity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firoz.recycler_view_card_view.BanglaActivity;
import com.example.firoz.recycler_view_card_view.EnglishActivity;
import com.example.firoz.recycler_view_card_view.R;
import com.example.firoz.recycler_view_card_view.adapter.MCqAdapter;
import com.example.firoz.recycler_view_card_view.adapter.MCqAdapter;
import com.example.firoz.recycler_view_card_view.model.Mcq;
import com.example.firoz.recycler_view_card_view.model.Mcq;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



private CardView bangla,english,math,ict;

    private List<Mcq> mcqList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initViews();
        preparedData();
        bangla.setOnClickListener(this);
      english.setOnClickListener(this);
      math.setOnClickListener(this);
      ict.setOnClickListener(this);
    }

    // ---- here init all views
    private void initViews() {
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        /*bangla=bangla.findViewById(R.id.banglaId);
        english=english.findViewById(R.id.englishId);
        math=math.findViewById(R.id.mathId);
        ict=ict.findViewById(R.id.ictId);
*/



        // --- set LinearLayoutManager as vertical
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);   // by default this is vertical
        recyclerView.setLayoutManager(layoutManager);



        /*

        // --- set LinearLayoutManager as horizontal
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        */


        /*
        // --- set GridLayoutManager as vertical
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);   // by default this is vertical
        recyclerView.setLayoutManager(layoutManager);
       */


        /*
        // --- set GridLayoutManager as horizontal
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        */


        /*
       //   --- set StaggeredGridLayoutManager as vertical
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        */

        /*
        //   --- set StaggeredGridLayoutManager as horizontal
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        */

    }


    private void preparedData() {

        String[] names = getResources().getStringArray(R.array.mcq_name);    //  get all cricker names from string.xml
        TypedArray images = getResources().obtainTypedArray(R.array.mcq_logo);  // get all cricketer images from string.xml


        // --- add all cricker name with their image into the list
        for (int i = 0; i < names.length; i++) {

            mcqList.add(new Mcq(images.getResourceId(i, -1), names[i]));
        }

        // --- now create adapter object and set it into the recyclerview
        MCqAdapter mCqAdapter = new MCqAdapter(this, mcqList);
        recyclerView.setAdapter(mCqAdapter);


    }



   /* @Override
    public void onClick(View view) {

    }
*/


    @Override
    public void onClick(View view) {


        if(view.getId()==R.id.banglaId) {
            Intent intent=new Intent(MainActivity.this,BanglaActivity.class);
            startActivity(intent);


        }
        else if(view.getId()==R.id.englishId)
        {
            Intent intent=new Intent(MainActivity.this,EnglishActivity.class);
            startActivity(intent);

        }

    }
}
