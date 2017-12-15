package dim.whatdoyouknow;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class actTest3 extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_act_test3);
        super.onCreate(savedInstanceState);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        player = MediaPlayer.create(this, R.raw.testclip2);
        player.start();
    }
    public void answer1 (View view){
        Toast.makeText(this, "That's not it, try again", Toast.LENGTH_SHORT).show();
    }
    public void answer4 (View view){
        Toast.makeText(this, "That's not it, try again", Toast.LENGTH_SHORT).show();
    }
    public void answer3 (View view){
        Toast.makeText(this, "That's not it, try again", Toast.LENGTH_SHORT).show();
    }
    public void answer2 (View view){
        Toast.makeText(this, "That's right!", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(getApplicationContext(), actTest4.class));
        }
    }, 2000);    player.stop();
}
}
