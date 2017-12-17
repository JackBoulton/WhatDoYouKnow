package dim.whatdoyouknow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.NavUtils;

/**
 * Created by Jack on 15/12/2017.
 */

public class creNav extends BaseActivity{
    public void gotoCreature2(View view){
        startActivity(new Intent(this, actCreature2.class));
        player.stop();
    }
    public void gotoCreature3(View view){
        startActivity(new Intent(this, actCreature3.class));
        player.stop();
    }
    public void gotoCreature4(View view){
        startActivity(new Intent(this, actCreature4.class));
        player.stop();
    }
    public void gotoCreature5(View view){
        startActivity(new Intent(this, actCreature5.class));
        player.stop();
    }
}
