package dim.whatdoyouknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class actCreature2 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_creature2);
        super.onCreate(savedInstanceState);
    }

    public void gotoCreature3 (View view){
        Intent intCreature3 = new Intent(this, actCreature3.class);
        startActivity(intCreature3);
    }
}
