package edu.oney18up.fantasysoccer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class openingMenu extends Activity {


    private ArrayList<String> teamList;
    ArrayAdapter<String> teamAdapter;
    Spinner teamSpinner;

    private ArrayList<String> memberList;
    ArrayAdapter<String> memberAdapter;
    Spinner memberSpinner;

    Button createTeam;
    Button findPlayer;
    Button updatePlayer;
    Button createPlayer;

    EditText playerName;
    EditText teamName;
    EditText speedVal;
    EditText agilVal;
    EditText powVal;
    EditText skillVal;

    ImageView teamLogo;
    ImageView playerPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_opening_menu, menu);
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
}
