package dim.whatdoyouknow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

    public class actPeople extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_people);
        super.onCreate(savedInstanceState);
    }
    public void gotoPeople2(View view){
        startActivity(new Intent(this,actPeople2.class));
    }
}
