package dim.whatdoyouknow;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class actJap5 extends japNav {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_jap5);
        super.onCreate(savedInstanceState);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        player = MediaPlayer.create(this, R.raw.speakclip5);
        player.start();
    }
    public void onBackPressed(){
        startActivity(new Intent(this, actJap4.class));
    }
}
