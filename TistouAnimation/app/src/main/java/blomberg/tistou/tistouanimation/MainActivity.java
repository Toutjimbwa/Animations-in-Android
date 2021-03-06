package blomberg.tistou.tistouanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @Bind(R.id.MAIN_IMG_ANDROID)ImageView imageViewAndroid;
    @Bind(R.id.MAIN_BTN_SLIDEDOWN)Button btnSlideDown;
    @Bind(R.id.MAIN_BTN_FADE)Button btnFade;

    //Animations
    private Animation animSlidedown;
    private Animation animFadeOut;

    // Hej hop
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupAnimations();
        setupButtons();
    }

    private void setupAnimations() {
        animSlidedown = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        animFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
    }

    private void setupButtons() {
        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideDownAnimation();
            }
        });
        btnFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeOutAnimation();
            }
        });
    }

    private void fadeOutAnimation() {
        imageViewAndroid.startAnimation(animFadeOut);
    }

    private void slideDownAnimation() {
        imageViewAndroid.startAnimation(animSlidedown);
    }

}
