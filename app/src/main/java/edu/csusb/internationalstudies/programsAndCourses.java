package edu.csusb.internationalstudies;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
//import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class programsAndCourses extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs_and_courses);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_programs_and_sources, menu);
        return true;
    }
    public void startcispProgramBrochures(View view) {
        Intent intent = new Intent(this, cispProgramBrochures.class);
        startActivity(intent);
    }
    public void startCourseListingsWebsite(View view) {
        Uri uri = Uri.parse("https://acsweb.csusb.edu/schedule/astra/schedule.jsp");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void openGeCourses(View view) {
        Uri uri = Uri.parse("https://acsweb.csusb.edu/schedule/astra/schedule.jsp");
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

        return super.onOptionsItemSelected(item);
    }


}
