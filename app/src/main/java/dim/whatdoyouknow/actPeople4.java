package dim.whatdoyouknow;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class actPeople4 extends peoNav {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_people4);
        super.onCreate(savedInstanceState);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        player = MediaPlayer.create(this, R.raw.peopleclip4);
        player.start();
    }

}
