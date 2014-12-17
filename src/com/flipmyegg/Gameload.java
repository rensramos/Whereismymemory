package com.flipmyegg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Gameload extends Activity {
	String active1, active2, active3, active4, active5, active6;
	MediaPlayer music;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		music = MediaPlayer.create(this, R.raw.bgmusic);
		music.setLooping(true);
		music.start();
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_gameload);

		ImageView boxs1 = (ImageView) findViewById(R.id.button1);
		ImageView boxs2 = (ImageView) findViewById(R.id.button2);
		ImageView boxs3 = (ImageView) findViewById(R.id.button3);
		ImageView boxs4 = (ImageView) findViewById(R.id.button4);
		ImageView boxs5 = (ImageView) findViewById(R.id.button5);
		ImageView boxs6 = (ImageView) findViewById(R.id.button6);

		boxs2.setClickable(true);
		boxs3.setClickable(true);
		boxs4.setClickable(true);
		boxs5.setClickable(true);
		boxs6.setClickable(true);

		SharedPreferences sharedPreferences = getSharedPreferences("MyData",
				Context.MODE_PRIVATE);

		String score1 = sharedPreferences.getString("score1", "");
		String score2 = sharedPreferences.getString("score2", "");
		String score3 = sharedPreferences.getString("score3", "");
		String score4 = sharedPreferences.getString("score4", "");
		String score5 = sharedPreferences.getString("score5", "");
		String score6 = sharedPreferences.getString("score6", "");
		active1 = sharedPreferences.getString("active1", "");
		active2 = sharedPreferences.getString("active2", "");
		active3 = sharedPreferences.getString("active3", "");
		active4 = sharedPreferences.getString("active4", "");
		active5 = sharedPreferences.getString("active5", "");
		active6 = sharedPreferences.getString("active6", "");

		TextView tv1 = (TextView) findViewById(R.id.textView1);
		tv1.setText(active1);

		// stage1
		if (score1.equals("1")) {
			boxs1.setImageResource(R.drawable.s1a);
			boxs2.setClickable(true);
			boxs2.setImageResource(R.drawable.load2);

		}

		if (score1.equals("2")) {
			boxs1.setImageResource(R.drawable.s1b);

		}

		if (score1.equals("3")) {
			boxs1.setImageResource(R.drawable.s1c);
		}

		if (active1.equals("1")) {
			boxs2.setClickable(true);
			boxs2.setImageResource(R.drawable.load2);
		}
		if (active2.equals("1") && score2.equals("1")) {
			boxs2.setClickable(true);
			boxs2.setImageResource(R.drawable.s2a);
		}

		if (active2.equals("1") && score2.equals("2")) {
			boxs2.setClickable(true);
			boxs2.setImageResource(R.drawable.s2b);
		}

		if (active2.equals("1") && score2.equals("3")) {
			boxs2.setClickable(true);
			boxs2.setImageResource(R.drawable.s2c);
		}

		// stage2
		if (score2.equals("1")) {
			boxs2.setImageResource(R.drawable.s2a);
			boxs3.setClickable(true);
			boxs3.setImageResource(R.drawable.load3);
		}

		if (score2.equals("2")) {
			boxs2.setImageResource(R.drawable.s2b);
		}

		if (score2.equals("3")) {
			boxs2.setImageResource(R.drawable.s2c);
		}
		if (active2.equals("1")) {
			boxs3.setClickable(true);
			boxs3.setImageResource(R.drawable.load3);
		}

		if (active3.equals("1") && score3.equals("1")) {
			boxs3.setClickable(true);
			boxs3.setImageResource(R.drawable.s3a);
		}

		if (active3.equals("1") && score3.equals("2")) {
			boxs3.setClickable(true);
			boxs3.setImageResource(R.drawable.s3b);
		}

		if (active3.equals("1") && score3.equals("3")) {
			boxs3.setClickable(true);
			boxs3.setImageResource(R.drawable.s3c);
		}

		// stage3
		if (score3.equals("1")) {
			boxs3.setImageResource(R.drawable.s3a);
			boxs4.setClickable(true);
			boxs4.setImageResource(R.drawable.load4);
		}

		if (score3.equals("2")) {
			boxs3.setImageResource(R.drawable.s3b);
		}

		if (score3.equals("3")) {
			boxs3.setImageResource(R.drawable.s3c);
		}
		if (active3.equals("1")) {
			boxs4.setClickable(true);
			boxs4.setImageResource(R.drawable.load4);
		}

		if (active4.equals("1") && score4.equals("1")) {
			boxs4.setClickable(true);
			boxs4.setImageResource(R.drawable.s4a);
		}

		if (active4.equals("1") && score4.equals("2")) {
			boxs4.setClickable(true);
			boxs4.setImageResource(R.drawable.s4b);
		}

		if (active4.equals("1") && score4.equals("3")) {
			boxs4.setClickable(true);
			boxs4.setImageResource(R.drawable.s4c);
		}

		// stage4

		if (score4.equals("1")) {
			boxs4.setImageResource(R.drawable.s4a);
			boxs5.setClickable(true);
			boxs5.setImageResource(R.drawable.load5);

		}

		if (score4.equals("2")) {
			boxs4.setImageResource(R.drawable.s4b);
		}

		if (score4.equals("3")) {
			boxs4.setImageResource(R.drawable.s4c);
		}

		if (active4.equals("1")) {
			boxs5.setClickable(true);
			boxs5.setImageResource(R.drawable.load5);
		}

		if (active5.equals("1") && score5.equals("1")) {
			boxs5.setClickable(true);
			boxs5.setImageResource(R.drawable.s5a);
		}

		if (active5.equals("1") && score5.equals("2")) {
			boxs5.setClickable(true);
			boxs5.setImageResource(R.drawable.s5b);
		}

		if (active5.equals("1") && score5.equals("3")) {
			boxs5.setClickable(true);
			boxs5.setImageResource(R.drawable.s5c);
		}
		// stage5

		if (score5.equals("1")) {
			boxs5.setImageResource(R.drawable.s5a);
			boxs6.setClickable(true);
			boxs6.setImageResource(R.drawable.load6);
		}

		if (score5.equals("2")) {
			boxs5.setImageResource(R.drawable.s5b);
		}

		if (score5.equals("3")) {
			boxs5.setImageResource(R.drawable.s5c);
		}
		if (active5.equals("1")) {
			boxs6.setClickable(true);
			boxs6.setImageResource(R.drawable.load6);
		}

		if (active6.equals("1") && score6.equals("1")) {
			boxs6.setClickable(true);
			boxs6.setImageResource(R.drawable.s6a);
		}

		if (active6.equals("1") && score6.equals("2")) {
			boxs6.setClickable(true);
			boxs6.setImageResource(R.drawable.s6b);
		}

		if (active6.equals("1") && score6.equals("3")) {
			boxs6.setClickable(true);
			boxs6.setImageResource(R.drawable.s6c);
		}

		// stage6

		if (score6.equals("1")) {
			boxs6.setImageResource(R.drawable.s6a);
			boxs6.setImageResource(R.drawable.load6);

		}

		if (score6.equals("2")) {
			boxs6.setImageResource(R.drawable.s6b);

		}

		if (score6.equals("3")) {
			boxs6.setImageResource(R.drawable.s6c);

		}

		if (active6.equals("1")) {
			boxs6.setClickable(true);
			boxs6.setImageResource(R.drawable.load6);
		}

		if (active6.equals("1") && score6.equals("1")) {
			boxs6.setClickable(true);
			boxs6.setImageResource(R.drawable.s6a);
		}

		if (active6.equals("1") && score6.equals("2")) {
			boxs6.setClickable(true);
			boxs6.setImageResource(R.drawable.s6b);
		}

		if (active6.equals("1") && score6.equals("3")) {
			boxs6.setClickable(true);
			boxs6.setImageResource(R.drawable.s6c);
		}

	}

	public void showStage1(View clickedButton) {
		Intent activityIntent = new Intent(this, Stage1.class);
		startActivity(activityIntent);
		finish();
	}

	public void showStage2(View clickedButton) {
		Intent activityIntent = new Intent(this, Stage2.class);
		startActivity(activityIntent);
		finish();
	}

	public void showStage3(View clickedButton) {
		Intent activityIntent = new Intent(this, Stage3.class);
		startActivity(activityIntent);
		finish();
	}

	public void showStage4(View clickedButton) {
		Intent activityIntent = new Intent(this, Stage4.class);
		startActivity(activityIntent);
		finish();
	}

	public void showStage5(View clickedButton) {
		Intent activityIntent = new Intent(this, Stage5.class);
		startActivity(activityIntent);
		finish();
	}

	public void showStage6(View clickedButton) {
		Intent activityIntent = new Intent(this, Stage6.class);
		startActivity(activityIntent);
		finish();
	}

	@Override
	public void onPause() {
		super.onPause();
		if (music.isPlaying())
			music.stop();
		else
			return;
	}

	@Override
	public void onStop() {
		super.onStop();
		if (music.isPlaying())
			music.stop();
		else
			return;
	}

	@Override
	public void onBackPressed() {
		Intent activityIntent = new Intent(this, Main.class);
		startActivity(activityIntent);
		finish();
	}

}