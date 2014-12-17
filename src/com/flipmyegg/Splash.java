package com.flipmyegg;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {
	private static int SPLASH_TIME_OUT = 3000; // 1 second = 1000
	MediaPlayer music;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		music = MediaPlayer.create(this, R.raw.splash);
		music.start();
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_splash);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent i = new Intent(Splash.this, Main.class);
				startActivity(i);
				finish();
			}
		}, SPLASH_TIME_OUT);
	}

}
