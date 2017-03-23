package dim.whatdoyouknow;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
    }

    public void gotoJap(View view) {
        Intent intJap = new Intent(this, actJap.class);
        startActivity(intJap);
    }

    public void gotoTest(View view) {
        Intent intTest = new Intent(this, actTest.class);
        startActivity(intTest);
    }

    public void gotoPeople(View view) {
        Intent intPeople = new Intent(this, actPeople.class);
        startActivity(intPeople);
    }

    public void gotoCreature(View view) {
        Intent intCreature = new Intent(this, actCreature.class);
        startActivity(intCreature);
    }
}