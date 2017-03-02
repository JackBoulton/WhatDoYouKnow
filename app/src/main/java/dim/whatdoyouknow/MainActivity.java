package dim.whatdoyouknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gotoJap(View view){
        Intent intJap = new Intent(this, actJap.class);
        startActivity(intJap);
    }
    public void gotoHiri(View view) {
        Intent intHiri = new Intent(this, actHiri.class);
        startActivity(intHiri);
    }
    public void gotoPeople(View view) {
        Intent intPeople = new Intent(this, actPeople.class);
        startActivity(intPeople);
    }
    public void gotoCreature(View view){
        Intent intCreature = new Intent(this, actCreature.class);
        startActivity(intCreature);
    }
}
