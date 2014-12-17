package com.flipmyegg;

import java.util.concurrent.TimeUnit;

import com.flipmyegg.Stage1.CounterClass;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Stage6 extends Activity {
	int counter = 0;
	CounterClass timer = new CounterClass(20000, 500);
	TextView textViewTime;
	String hms;

	int counter2, counter3, counter4, counter5, counter6, counter7, counter8,
			counter9;
	int click;
	int b2, b3, b4, b5, b6, b7, b8, b9;
	MediaPlayer music;
	MediaPlayer music2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_stage6);
		music = MediaPlayer.create(this, R.raw.click);
		final ImageView box2 = (ImageView) findViewById(R.id.box2);
		final ImageView box3 = (ImageView) findViewById(R.id.box3);
		final ImageView box4 = (ImageView) findViewById(R.id.box4);
		final ImageView box5 = (ImageView) findViewById(R.id.box5);
		final ImageView box6 = (ImageView) findViewById(R.id.box6);
		final ImageView box7 = (ImageView) findViewById(R.id.box7);
		final ImageView box8 = (ImageView) findViewById(R.id.box8);
		final ImageView box9 = (ImageView) findViewById(R.id.box9);

		textViewTime = (TextView) findViewById(R.id.textView1);
		textViewTime.setText("10:00");

		timer.start();
		music2 = MediaPlayer.create(this, R.raw.game);
		music2.start();

		box2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				click++;
				counter2++;
				b2++;
				music.start();
				switch (counter2) {
				case 1:
					box2.setImageResource(R.drawable.t1);
					break;

				case 2:
					box2.setImageResource(R.drawable.t2);
					b2 = 2;
					break;
				case 3:
					box2.setImageResource(R.drawable.t3);
					b2 = 3;
					break;
				case 4:
					box2.setImageResource(R.drawable.t4);
					b2 = 4;
					break;
				case 5:
					box2.setImageResource(R.drawable.t5);
					b2 = 5;
					break;
				case 6:
					box2.setImageResource(R.drawable.t6);
					b2 = 6;
					break;
				case 7:
					box2.setImageResource(R.drawable.t7);
					b2 = 7;
					break;
				case 8:
					box2.setImageResource(R.drawable.t8);
					b2 = 8;
					break;
				case 9:
					box2.setImageResource(R.drawable.t9);
					b2 = 9;
					break;
				}

				if (counter2 >= 9) {
					counter2 = 0;
				}

				if (b2 > 9) {
					b2 = 0;
				}

				if (b2 == 2 && b3 == 3 && b4 == 4 && b5 == 5 && b6 == 6
						&& b7 == 7 && b8 == 8 && b9 == 9) {
					endGame();
				}

			}

		});

		box3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				click++;
				counter3++;
				b3++;
				music.start();
				switch (counter3) {
				case 1:
					box3.setImageResource(R.drawable.t1);
					break;

				case 2:
					box3.setImageResource(R.drawable.t2);
					b3 = 2;
					break;
				case 3:
					box3.setImageResource(R.drawable.t3);
					b3 = 3;
					break;
				case 4:
					box3.setImageResource(R.drawable.t4);
					b3 = 4;
					break;
				case 5:
					box3.setImageResource(R.drawable.t5);
					b3 = 5;
					break;
				case 6:
					box3.setImageResource(R.drawable.t6);
					b3 = 6;
					break;
				case 7:
					box3.setImageResource(R.drawable.t7);
					b3 = 7;
					break;
				case 8:
					box3.setImageResource(R.drawable.t8);
					b3 = 8;
					break;
				case 9:
					box3.setImageResource(R.drawable.t9);
					b3 = 9;
					break;
				}

				if (counter3 >= 9) {
					counter3 = 0;
				}

				if (b3 > 9) {
					b3 = 0;
				}

				if (b2 == 2 && b3 == 3 && b4 == 4 && b5 == 5 && b6 == 6
						&& b7 == 7 && b8 == 8 && b9 == 9) {
					endGame();
				}

			}

		});

		box4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				click++;
				counter4++;
				b4++;
				music.start();
				switch (counter4) {
				case 1:
					box4.setImageResource(R.drawable.t1);
					break;

				case 2:
					box4.setImageResource(R.drawable.t2);
					b4 = 2;
					break;
				case 3:
					box4.setImageResource(R.drawable.t3);
					b4 = 3;
					break;
				case 4:
					box4.setImageResource(R.drawable.t4);
					b4 = 4;
					break;
				case 5:
					box4.setImageResource(R.drawable.t5);
					b4 = 5;
					break;
				case 6:
					box4.setImageResource(R.drawable.t6);
					b4 = 6;
					break;
				case 7:
					box4.setImageResource(R.drawable.t7);
					b4 = 7;
					break;
				case 8:
					box4.setImageResource(R.drawable.t8);
					b4 = 8;
					break;
				case 9:
					box4.setImageResource(R.drawable.t9);
					b4 = 9;
					break;
				}

				if (counter4 >= 9) {
					counter4 = 0;
				}

				if (b4 > 9) {
					b4 = 0;
				}

				if (b2 == 2 && b3 == 3 && b4 == 4 && b5 == 5 && b6 == 6
						&& b7 == 7 && b8 == 8 && b9 == 9) {
					endGame();
				}

			}

		});

		box5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				click++;
				counter5++;
				b5++;
				music.start();
				switch (counter5) {
				case 1:
					box5.setImageResource(R.drawable.t1);
					break;

				case 2:
					box5.setImageResource(R.drawable.t2);
					b5 = 2;
					break;
				case 3:
					box5.setImageResource(R.drawable.t3);
					b5 = 3;
					break;
				case 4:
					box5.setImageResource(R.drawable.t4);
					b5 = 4;
					break;
				case 5:
					box5.setImageResource(R.drawable.t5);
					b5 = 5;
					break;
				case 6:
					box5.setImageResource(R.drawable.t6);
					b5 = 6;
					break;
				case 7:
					box5.setImageResource(R.drawable.t7);
					b5 = 7;
					break;
				case 8:
					box5.setImageResource(R.drawable.t8);
					b5 = 8;
					break;
				case 9:
					box5.setImageResource(R.drawable.t9);
					b5 = 9;
					break;
				}

				if (counter5 >= 9) {
					counter5 = 0;
				}

				if (b5 > 9) {
					b5 = 0;
				}

				if (b2 == 2 && b3 == 3 && b4 == 4 && b5 == 5 && b6 == 6
						&& b7 == 7 && b8 == 8 && b9 == 9) {
					endGame();
				}

			}
		});
		box6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				click++;
				counter6++;
				b6++;
				music.start();
				switch (counter6) {
				case 1:
					box6.setImageResource(R.drawable.t1);
					break;

				case 2:
					box6.setImageResource(R.drawable.t2);
					b6 = 2;
					break;
				case 3:
					box6.setImageResource(R.drawable.t3);
					b6 = 3;
					break;
				case 4:
					box6.setImageResource(R.drawable.t4);
					b6 = 4;
					break;
				case 5:
					box6.setImageResource(R.drawable.t5);
					b6 = 5;
					break;
				case 6:
					box6.setImageResource(R.drawable.t6);
					b6 = 6;
					break;
				case 7:
					box6.setImageResource(R.drawable.t7);
					b6 = 7;
					break;
				case 8:
					box6.setImageResource(R.drawable.t8);
					b6 = 8;
					break;
				case 9:
					box6.setImageResource(R.drawable.t9);
					b6 = 9;
					break;
				}

				if (counter6 >= 9) {
					counter6 = 0;
				}
				if (b6 > 9) {
					b6 = 0;
				}

				if (b2 == 2 && b3 == 3 && b4 == 4 && b5 == 5 && b6 == 6
						&& b7 == 7 && b8 == 8 && b9 == 9) {
					endGame();
				}

			}

		});

		box7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				click++;
				counter7++;
				b7++;
				music.start();
				switch (counter7) {
				case 1:
					box7.setImageResource(R.drawable.t1);
					break;

				case 2:
					box7.setImageResource(R.drawable.t2);
					b7 = 2;
					break;
				case 3:
					box7.setImageResource(R.drawable.t3);
					b7 = 3;
					break;
				case 4:
					box7.setImageResource(R.drawable.t4);
					b7 = 4;
					break;
				case 5:
					box7.setImageResource(R.drawable.t5);
					b7 = 5;
					break;
				case 6:
					box7.setImageResource(R.drawable.t6);
					b7 = 6;
					break;
				case 7:
					box7.setImageResource(R.drawable.t7);
					b7 = 7;
					break;
				case 8:
					box7.setImageResource(R.drawable.t8);
					b7 = 8;
					break;
				case 9:
					box7.setImageResource(R.drawable.t9);
					b7 = 9;
					break;
				}

				if (counter7 >= 9) {
					counter7 = 0;
				}
				if (b7 > 9) {
					b7 = 0;
				}

				if (b2 == 2 && b3 == 3 && b4 == 4 && b5 == 5 && b6 == 6
						&& b7 == 7 && b8 == 8 && b9 == 9) {
					endGame();
				}

			}
		});
		box8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				click++;
				counter8++;
				b8++;
				music.start();
				switch (counter8) {
				case 1:
					box8.setImageResource(R.drawable.t1);
					break;

				case 2:
					box8.setImageResource(R.drawable.t2);
					b8 = 2;
					break;
				case 3:
					box8.setImageResource(R.drawable.t3);
					b8 = 3;
					break;
				case 4:
					box8.setImageResource(R.drawable.t4);
					b8 = 4;
					break;
				case 5:
					box8.setImageResource(R.drawable.t5);
					b8 = 5;
					break;
				case 6:
					box8.setImageResource(R.drawable.t6);
					b8 = 6;
					break;
				case 7:
					box8.setImageResource(R.drawable.t7);
					b8 = 7;
					break;
				case 8:
					box8.setImageResource(R.drawable.t8);
					b8 = 8;
					break;
				case 9:
					box8.setImageResource(R.drawable.t9);
					b8 = 9;
					break;
				}

				if (counter8 >= 9) {
					counter8 = 0;
				}
				if (b8 > 9) {
					b8 = 0;
				}

				if (b2 == 2 && b3 == 3 && b4 == 4 && b5 == 5 && b6 == 6
						&& b7 == 7 && b8 == 8 && b9 == 9) {
					endGame();
				}

			}

		});

		box9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				click++;
				counter9++;
				b9++;
				music.start();
				switch (counter9) {
				case 1:
					box9.setImageResource(R.drawable.t1);
					b9 = 1;
					break;

				case 2:
					box9.setImageResource(R.drawable.t2);
					b9 = 2;
					break;
				case 3:
					box9.setImageResource(R.drawable.t3);
					b9 = 3;
					break;
				case 4:
					box9.setImageResource(R.drawable.t4);
					b9 = 4;
					break;
				case 5:
					box9.setImageResource(R.drawable.t5);
					b9 = 5;
					break;
				case 6:
					box9.setImageResource(R.drawable.t6);
					b9 = 6;
					break;
				case 7:
					box9.setImageResource(R.drawable.t7);
					b9 = 7;
					break;
				case 8:
					box9.setImageResource(R.drawable.t8);
					b9 = 8;
					break;
				case 9:
					box9.setImageResource(R.drawable.t9);
					b9 = 9;
					break;
				}

				if (counter9 >= 9) {
					counter9 = 0;
				}

				if (b9 > 9) {
					b9 = 0;
				}

				if (b2 == 2 && b3 == 3 && b4 == 4 && b5 == 5 && b6 == 6
						&& b7 == 7 && b8 == 8 && b9 == 9) {
					endGame();
				}

			}

		});

	}

	// end of oncreate

	public class CounterClass extends CountDownTimer {
		public CounterClass(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
		}

		public void onFinish() {
			if (click == 44) {
				finish();
			} else {
				String score = "3";
				String totalclick = click + "";
				String status = "Noob";

				SharedPreferences sharedPreferences = getSharedPreferences(
						"MyData", Context.MODE_PRIVATE);
				SharedPreferences.Editor editor = sharedPreferences.edit();
				editor.putString("score6", score);
				editor.commit();

				// Put extra
				Intent resulta = new Intent(Stage6.this, Score6.class);
				resulta.putExtra("totalclick", totalclick);
				resulta.putExtra("status", status);
				startActivityForResult(resulta, 0);
				finish();
			}

		}

		public void onTick(long millisUntilFinished) {
			long millis = millisUntilFinished;

			hms = String.format(
					"%02d:%02d",
					TimeUnit.MILLISECONDS.toMinutes(millis)
							- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
									.toHours(millis)),
					TimeUnit.MILLISECONDS.toSeconds(millis)
							- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
									.toMinutes(millis)));
			textViewTime.setText(hms + "s");

		}
	}

	private void endGame() {

		if (click <= 44) {

			String score = "1";
			String totalclick = click + "";
			String status = "Pro";
			String active = "1";

			SharedPreferences sharedPreferences = getSharedPreferences(
					"MyData", Context.MODE_PRIVATE);
			SharedPreferences.Editor editor = sharedPreferences.edit();
			editor.putString("score6", score);
			editor.putString("active6", active);
			editor.commit();

			Intent resulta = new Intent(this.getBaseContext(), Score6.class);
			resulta.putExtra("score", score);
			resulta.putExtra("totalclick", totalclick);
			resulta.putExtra("status", status);
			startActivityForResult(resulta, 0);
			finish();

		}

		if (click > 44 && click <= 55) {

			String score = "2";
			String totalclick = click + "";
			String status = "Good";

			SharedPreferences sharedPreferences = getSharedPreferences(
					"MyData", Context.MODE_PRIVATE);
			SharedPreferences.Editor editor = sharedPreferences.edit();
			editor.putString("score6", score);
			editor.commit();

			Intent resulta = new Intent(this.getBaseContext(), Score6.class);
			resulta.putExtra("score", score);
			resulta.putExtra("totalclick", totalclick);
			resulta.putExtra("status", status);
			startActivityForResult(resulta, 0);
			finish();

		}

		if (click > 55) {

			String score = "3";
			String totalclick = click + "";
			String status = "Noob";

			SharedPreferences sharedPreferences = getSharedPreferences(
					"MyData", Context.MODE_PRIVATE);
			SharedPreferences.Editor editor = sharedPreferences.edit();
			editor.putString("score6", score);
			editor.commit();

			Intent resulta = new Intent(this.getBaseContext(), Score6.class);
			resulta.putExtra("score", score);
			resulta.putExtra("totalclick", totalclick);
			resulta.putExtra("status", status);
			startActivityForResult(resulta, 0);
			finish();

		}

	}

	@Override
	public void onBackPressed() {
		timer.cancel();
		Intent activityIntent = new Intent(this, Gameload.class);
		startActivity(activityIntent);
		finish();
	}

	public void onPause() {
		super.onPause();
		if (music2.isPlaying())
			music2.stop();
		else
			return;
	}

	@Override
	public void onStop() {
		super.onStop();
		if (music2.isPlaying())
			music2.stop();
		else
			return;
	}

}
