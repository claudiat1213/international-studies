package edu.csusb.internationalstudies;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class otherResources extends ActionBarActivity {

    private ListView mDrawerList;
    private DrawerLayout mDrawerLayout;
    private ArrayAdapter<String> mAdapter;
    private ActionBarDrawerToggle mDrawerToggle;
    private String mActivityTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_resources);

        mDrawerList = (ListView)findViewById(R.id.navList);mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();

        addDrawerItems();
        setupDrawer();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    private void addDrawerItems() {
        String[] osArray = {"  About Us", "  Advising", "  Admissions", "  Study Abroad", "  Exchange Program", "  Other Resources"};
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, osArray);
        mDrawerList.setAdapter(mAdapter);

        mDrawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(otherResources.this, aboutCisp.class);
                    startActivity(intent);
                } else if (position == 1){
                    Intent intent = new Intent(otherResources.this, secondAdvise.class);
                    startActivity(intent);
                }else if (position == 2) {
                    Intent intent = new Intent(otherResources.this, admissionsInfo.class);
                    startActivity(intent);
                }else if (position == 3) {
                    Intent intent = new Intent(otherResources.this, StudyAbroad.class);
                    startActivity(intent);
                }else if (position == 4) {
                    Intent intent = new Intent(otherResources.this, exchangeProgram.class);
                    startActivity(intent);
                }else if (position == 5){
                    Intent intent = new Intent(otherResources.this, otherResources.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void setupDrawer() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close) {

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("Main");
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mActivityTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_other_resources, menu);
        return true;
    }*/

    public void openHealthInsurance (View view) {
        Intent intent = new Intent(this, healthInsurance.class);
        startActivity(intent);
    }

    public void openCampusMap (View view) {
        Intent intent = new Intent(this, campusMap.class);
        startActivity(intent);
    }

    public void openHousingPage (View view) {
        Intent intent = new Intent(this, housing.class);
        startActivity(intent);
    }

    public void openNewsAndWeather (View view) {
        Intent intent = new Intent(this, NewsAndWeather.class);
        startActivity(intent);
    }

    public void openDeadline (View view) {
        Intent intent = new Intent(this, Deadline.class);
        startActivity(intent);
    }

    public void openRegistrationPage (View view) {
        Intent intent = new Intent(this, registrationPage.class);
        startActivity(intent);
    }

    public void openEventsPage (View view) {
        Uri uri = Uri.parse("http://studentunion.csusb.edu/events");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
