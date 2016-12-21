package com.example.administrator.nihongword;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrator.nihongword.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        SwipeFlingAdapterView.onFlingListener,
        SwipeFlingAdapterView.OnItemClickListener {

    private ArrayList<Word> mList;
    private int cardWidth;
    private int cardHeight;

    private SwipeFlingAdapterView mFlingAdapterView;
    private SwipeFlingWordAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initView();
        loadData();

    }

    private void initView() {
        //获取屏幕参数
        DisplayMetrics dm = getResources().getDisplayMetrics();
        float density = dm.density;
        cardWidth = (int) (dm.widthPixels - (2 * 18 * density));
        cardHeight = (int) (dm.heightPixels - (338 * density));

        mFlingAdapterView = (SwipeFlingAdapterView) findViewById(R.id.swipe_fling_adapter_view);
        mFlingAdapterView.setFlingListener(this);
        mFlingAdapterView.setOnItemClickListener(this);
        mAdapter = new SwipeFlingWordAdapter(cardWidth, cardHeight);
        mFlingAdapterView.setAdapter(mAdapter);
    }

    private void loadData() {
        new AsyncTask<Void, Void, List<Word>>() {
            @Override
            protected List<Word> doInBackground(Void... params) {
                ArrayList<Word> list = new ArrayList<>(10);
                list = WordsLib.getFirstWords();
                return list;
            }

            @Override
            protected void onPostExecute(List<Word> words) {
                super.onPostExecute(words);
                mAdapter.addAll(words);
            }
        }.execute();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            mAdapter.randomColor();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setAdapterList(ArrayList<Word> list) {
        mAdapter.clear();
        mAdapter.addAll(list);
        mAdapter.notifyDataSetChanged();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_class_1) {
            // Handle the camera action
            setAdapterList(WordsLib.getFirstWords());
        } else if (id == R.id.nav_class_2) {
            setAdapterList(WordsLib.getSecondWords());
        } else if (id == R.id.nav_class_3) {
            setAdapterList(WordsLib.getThirdWords());
        } else if (id == R.id.nav_class_4) {
            setAdapterList(WordsLib.getFourthWords());
        } else if (id == R.id.nav_class_5) {
            setAdapterList(WordsLib.getFifthWords());
        } else if (id == R.id.nav_class_6) {
            setAdapterList(WordsLib.getSixthWords());
        } else if (id == R.id.nav_class_7) {
            setAdapterList(WordsLib.getSeventhWords());
        } else if (id == R.id.nav_class_8) {
            setAdapterList(WordsLib.getEighthWords());
        } else if (id == R.id.nav_class_9) {
            setAdapterList(WordsLib.getNinthWords());
        } else if (id == R.id.nav_class_10) {
            setAdapterList(WordsLib.getTenthWords());
        } else if (id == R.id.nav_class_11) {
            setAdapterList(WordsLib.getEleventhWords());
        }
//        else if (id == R.id.nav_class_12) {
//
//        } else if (id == R.id.nav_class_13) {
//
//        } else if (id == R.id.nav_class_14) {
//
//        } else if (id == R.id.nav_class_15) {
//
//        } else if (id == R.id.nav_class_16) {
//
//        } else if (id == R.id.nav_class_17) {
//
//        } else if (id == R.id.nav_class_18) {
//
//        } else if (id == R.id.nav_class_19) {
//
//        } else if (id == R.id.nav_class_20) {
//
//        } else if (id == R.id.nav_class_21) {
//
//        } else if (id == R.id.nav_class_22) {
//
//        } else if (id == R.id.nav_class_23) {
//
//        } else if (id == R.id.nav_class_24) {
//
//        } else if (id == R.id.nav_class_25) {
//
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onItemClicked(MotionEvent event, View v, Object dataObject) {

    }

    @Override
    public void removeFirstObjectInAdapter() {
        mAdapter.remove(0);
    }

    @Override
    public void onLeftCardExit(Object dataObject) {

    }

    @Override
    public void onRightCardExit(Object dataObject) {

    }

    @Override
    public void onAdapterAboutToEmpty(int itemsInAdapter) {

    }

    @Override
    public void onScroll(float progress, float scrollXProgress) {

    }
}
