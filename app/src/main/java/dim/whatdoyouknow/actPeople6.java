package dim.whatdoyouknow;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class actPeople6 extends peoNav {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_people6);
        super.onCreate(savedInstanceState);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        player = MediaPlayer.create(this, R.raw.peopleclip6);
        player.start();
    }
}
