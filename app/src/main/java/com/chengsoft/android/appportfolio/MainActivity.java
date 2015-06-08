package com.chengsoft.android.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Opens spotify streamer app
     * @param view the view
     */
    public void openSpotifyStreamer(View view) {
        makeToast("Open Spotify Streamer");
    }

    /**
     * Opens Scores App
     * @param view the view
     */
    public void openScoresApp(View view) {
        makeToast("Open Scores App");
    }

    /**
     * Opens Library App
     * @param view the view
     */
    public void openLibraryApp(View view) {
        makeToast("Open Library App");
    }

    /**
     * Opens Build it bigger app
     * @param view the view
     */
    public void openBuildItBigger(View view) {
        makeToast("Open Build It Bigger");
    }

    /**
     * Opens XYZ Reader app
     * @param view the view
     */
    public void openXYZReader(View view) {
        makeToast("Open XYZ Reader");
    }

    /**
     * Opens capstone project app
     * @param view the view
     */
    public void openCapstoneProject(View view) {
        makeToast("Open Capstone Project");
    }

    /**
     * Create a toast notification with the given text
     * with duration {@link Toast#LENGTH_SHORT}
     * @param toastText Text to be displayed in the toast
     */
    private void makeToast(CharSequence toastText) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, toastText, duration);
        toast.show();
    }
}
