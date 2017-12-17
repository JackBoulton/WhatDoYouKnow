package dim.whatdoyouknow;

import android.content.Intent;
import android.view.View;

/**
 * Created by Jack on 15/12/2017.
 */

public class japNav extends BaseActivity{
    public void gotoJap2(View view){
        player.stop();
        Intent intJap2 = new Intent(this, actJap2.class);
        startActivity(intJap2);
    }
    public void gotoJap3(View view){
        player.stop();
        Intent intJap3 = new Intent(this, actJap3.class);
        startActivity(intJap3);
    }
    public void gotoJap4(View view) {
        player.stop();
        Intent intJap4 = new Intent(this, actJap4.class);
        startActivity(intJap4);
    }
    public void gotoJap5(View view) {
        player.stop();
        Intent intJap5 = new Intent(this, actJap5.class);
        startActivity(intJap5);
    }
    public void gotoJap6(View view) {
        player.stop();
        Intent intJap6 = new Intent(this, actJap6.class);
        startActivity(intJap6);
    }
}
