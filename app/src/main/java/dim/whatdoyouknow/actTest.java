package dim.whatdoyouknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class actTest extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_test);
        super.onCreate(savedInstanceState);
    }
    public void gotoTest2 (View view) {
        Intent intTest2 = new Intent (this, actTest2.class);
        startActivity(intTest2);
    }
}
