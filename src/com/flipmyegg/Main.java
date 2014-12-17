package com.flipmyegg;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Main extends Activity {
	MediaPlayer music;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		music = MediaPlayer.create(this, R.raw.front);
		music.start();
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);

	}

	public void showGameLoad(View clickedButton) {
		Intent activityIntent = new Intent(this, Gameload.class);
		startActivity(activityIntent);
		finish();
	}

	public void showAbout(View clickedButton) {
		Intent activityIntent = new Intent(this, About.class);
		startActivity(activityIntent);
		finish();
	}

	@Override
	public void onBackPressed() {
		finish();
	}

}