package diceroller.android.example.com.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean batmanIsShowing = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view) {
        ImageView batmanImageView = (ImageView) findViewById(R.id.batmanImageView);
        ImageView supermanImageView = (ImageView) findViewById(R.id.supermanImageView);

        if (batmanIsShowing){
            batmanIsShowing = false;
            batmanImageView.animate().alpha(0).setDuration(2000);
            supermanImageView.animate().alpha(1).setDuration(2000);
        } else {
            batmanIsShowing = true;
            batmanImageView.animate().alpha(1).setDuration(2000);
            supermanImageView.animate().alpha(0).setDuration(2000);
        }

    }
}
