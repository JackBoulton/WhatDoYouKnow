package dim.whatdoyouknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class actJap6 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_jap6);
        super.onCreate(savedInstanceState);
    }
    public void goHome(View view) {
        Intent MainActivity = new Intent(this, dim.whatdoyouknow.MainActivity.class);
        startActivity(MainActivity);
    }
}
