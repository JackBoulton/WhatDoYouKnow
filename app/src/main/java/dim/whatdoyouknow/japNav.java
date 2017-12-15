package dim.whatdoyouknow;

import android.content.Intent;
import android.view.View;

/**
 * Created by Jack on 15/12/2017.
 */

public class japNav extends BaseActivity{
    public void gotoJap2(View view){
        Intent intJap2 = new Intent(this, actJap2.class);
        startActivity(intJap2);
        player.stop();
    }
    public void gotoJap3(View view){
        Intent intJap3 = new Intent(this, actJap3.class);
        startActivity(intJap3);
        player.stop();
    }
    public void gotoJap4(View view) {
        Intent intJap4 = new Intent(this, actJap4.class);
        startActivity(intJap4);
        player.stop();
    }
    public void gotoJap5(View view) {
        Intent intJap5 = new Intent(this, actJap5.class);
        startActivity(intJap5);
        player.stop();
    }
    public void gotoJap6(View view) {
        Intent intJap6 = new Intent(this, actJap6.class);
        startActivity(intJap6);
        player.stop();
    }
}
