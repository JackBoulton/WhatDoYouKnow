package dim.whatdoyouknow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class actCreature5 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_creature5);
        super.onCreate(savedInstanceState);
    }
    public void goHome (View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}
