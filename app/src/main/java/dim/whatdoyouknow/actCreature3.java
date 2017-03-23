package dim.whatdoyouknow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class actCreature3 extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_creature3);
        super.onCreate(savedInstanceState);
    }

    public void gotoCreature4(View view) {
        Intent intCreature4 = new Intent(this, actCreature4.class);
        startActivity(intCreature4);
    }
}

