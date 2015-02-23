package edu.csusb.internationalstudies;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class admissionsInfo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissions_info);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_admissions_info, menu);
        return true;
    }

    public void openAdmissionsUndergrad(View view) {
        Intent intent = new Intent(this, admissionsUndergrad.class);
        startActivity(intent);
    }

    public void openAdmissionsGrad(View view) {
        Intent intent = new Intent(this, admissionsGrad.class);
        startActivity(intent);
    }

    public void openAdmissionsMBA(View view) {
        Intent intent = new Intent(this, admissionsMBA.class);
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
