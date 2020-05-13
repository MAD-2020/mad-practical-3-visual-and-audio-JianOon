package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView vid;
    private static final String TAG = "MYACT";
    private MediaPlayer media;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        media = MediaPlayer.create(this, R.raw.baby_laughing);
        vid = findViewById(R.id.video);
        image = findViewById(R.id.image);
        image.setImageResource(R.drawable.cute_baby);
        vid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v(TAG, "Video start!");
                vid.setVideoURI(
                        Uri.parse("android.resource://" + getPackageName() + "/raw/" + R.raw.rabbid));
                vid.start();
                media.start();
                media.release();


            }
        });

    }
}

