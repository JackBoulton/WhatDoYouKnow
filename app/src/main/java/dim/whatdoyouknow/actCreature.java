package dim.whatdoyouknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class actCreature extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_creature);
        super.onCreate(savedInstanceState);
    }
    public void gotoCreature2(View view){
        Intent intCreature2 = new Intent(this,actCreature2.class);
        startActivity(intCreature2);
    }
}
