package dim.whatdoyouknow;

import android.content.Intent;
import android.view.View;

/**
 * Created by Jack on 15/12/2017.
 */

public class peoNav extends BaseActivity{
    public void gotoPeople2(View view){
        startActivity(new Intent(this,actPeople3.class));
        player.stop();
    }
    public void gotoPeople3(View view){
        startActivity(new Intent(this,actPeople3.class));
        player.stop();
    }
    public void gotoPeople4(View view){
        startActivity(new Intent(this,actPeople4.class));
        player.stop();
    }
    public void gotoPeople5(View view){
        startActivity(new Intent(this,actPeople5.class));
        player.stop();
    }
    public void gotoPeople6(View view){
        startActivity(new Intent(this,actPeople6.class));
        player.stop();
    }
}
