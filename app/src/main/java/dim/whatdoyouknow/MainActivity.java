package dim.whatdoyouknow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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