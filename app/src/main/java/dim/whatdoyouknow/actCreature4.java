package dim.whatdoyouknow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class actCreature4 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_creature4);
        super.onCreate(savedInstanceState);
    }

    public void gotoCreature5(View view){
        startActivity(new Intent(this, actCreature5.class));
    }
}
