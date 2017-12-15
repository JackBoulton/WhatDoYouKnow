package dim.whatdoyouknow;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

public class actTest6 extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_test6);
        super.onCreate(savedInstanceState);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        //player = MediaPlayer.create(this, R.raw.testclip5);
        player.start();
    }
}
