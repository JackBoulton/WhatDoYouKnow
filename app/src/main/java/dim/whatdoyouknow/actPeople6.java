package dim.whatdoyouknow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class actPeople6 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_people6);
        super.onCreate(savedInstanceState);
    }
    public void goHome(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}
