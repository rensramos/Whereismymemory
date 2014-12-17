package com.flipmyegg;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Score4 extends Activity {
	MediaPlayer music;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		music = MediaPlayer.create(this, R.raw.score);
		music.start();
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_score4);

		Intent status = getIntent();
		Intent click = getIntent();

		String tries = click.getStringExtra("totalclick");
		String fstatus = status.getStringExtra("status");

		ImageView eggsko = (ImageView) findViewById(R.id.eggs);
		ImageView banner = (ImageView) findViewById(R.id.imageView1);
		TextView text = (TextView) findViewById(R.id.text);
		TextView text2 = (TextView) findViewById(R.id.text2);
		text2.setText("Total Clicked: " + tries);
		text.setText("Eggs Collected");

		if (fstatus.equals("Pro")) {
			eggsko.setImageResource(R.drawable.egg1);
			banner.setImageResource(R.drawable.score1);

		}

		if (fstatus.equals("Good")) {
			eggsko.setImageResource(R.drawable.egg2);
			banner.setImageResource(R.drawable.score2);

		}

		if (fstatus.equals("Noob")) {
			eggsko.setImageResource(R.drawable.egg3);
			banner.setImageResource(R.drawable.score3);

		}

	}

	@Override
	public void onBackPressed() {
		Intent activityIntent = new Intent(this, Gameload.class);
		startActivity(activityIntent);
		finish();
	}
}