package es.neifi.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Animations
    private ValueAnimator fadeIn;
    private ValueAnimator fadeOut;
    private ValueAnimator zoomIn;
    private ValueAnimator zoomOut;
    private ValueAnimator leftRight;
    private ValueAnimator topBottom;
    private ValueAnimator Bounce;
    private ValueAnimator flash;
    private ValueAnimator rotate;
    //TODO several anim here

    //Widgets
    private Button btnFadeIn;
    private Button btnFadeOut;
    private Button btnZoomIn;
    private Button btnZoomOut;
    private Button btnLeftRight;
    private Button btnTopBottom;
    private Button btnBounce;
    private Button btnFlash;
    private Button btnRotate;

    private SeekBar animationSpeed;

    private TextView currentAnimation;

    private ImageView androidLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons
        btnFadeIn = findViewById(R.id.fadeIn);
        btnFadeOut = findViewById(R.id.fadeOut);
        btnZoomIn = findViewById(R.id.zoomIn);
        btnZoomOut = findViewById(R.id.zoomOut);
        btnLeftRight = findViewById(R.id.leftRight);
        btnZoomIn = findViewById(R.id.zoomIn);
        btnTopBottom = findViewById(R.id.top);
        btnBounce = findViewById(R.id.bounce);
        btnFlash = findViewById(R.id.flash);
        btnRotate = findViewById(R.id.rotate);

        //seekBar, Text and image
        animationSpeed = findViewById(R.id.animationSpeedBar);
        currentAnimation = findViewById(R.id.currentAnimation);
        androidLogo = findViewById(R.id.androidLogo);

        //Animations
        //the duration is in miliseconds
        fadeIn = ObjectAnimator.ofFloat(androidLogo,"alpha",0f,1f);
        fadeIn.setDuration(1000);

        fadeOut = ObjectAnimator.ofFloat(androidLogo,"alpha",1f,0f);
        fadeOut.setDuration(1000);

        //TODO maybe listener to remove at end of animation
        leftRight = ObjectAnimator.ofFloat(androidLogo,"translationX",1000f);
        leftRight.setDuration(1000);

        topBottom = ObjectAnimator.ofFloat(androidLogo,"translationY",1000f);
        topBottom.setDuration(1000);

    }
}