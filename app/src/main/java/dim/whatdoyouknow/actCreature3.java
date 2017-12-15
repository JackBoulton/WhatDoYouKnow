package dim.whatdoyouknow;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class actCreature3 extends creNav{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_creature3);
        super.onCreate(savedInstanceState);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        player = MediaPlayer.create(this, R.raw.creatureclip3);
        player.start();
    }
}

