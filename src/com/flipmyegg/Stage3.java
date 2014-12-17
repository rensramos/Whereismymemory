package com.flipmyegg;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Stage3 extends Activity {

	CounterClass timer = new CounterClass(25000, 500);
	TextView textViewTime;
	String hms;
	int counter;
	private static int ROW_COUNT = -1;
	private static int COL_COUNT = -1;
	private Context context;
	private Drawable backImage;
	private int[][] cards;
	private List<Drawable> images;
	private Card firstCard;
	private Card seconedCard;
	private ButtonListener buttonListener;
	private static Object lock = new Object();
	int turns;
	private TableLayout mainTable;
	private UpdateCardsHandler handler;
	MediaPlayer music;
	MediaPlayer music2;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		handler = new UpdateCardsHandler();
		loadImages();
		setContentView(R.layout.activity_stage3);
		backImage = getResources().getDrawable(R.drawable.s3);
		/*
		 * ((Button)findViewById(R.id.ButtonNew)).setOnClickListener(new
		 * OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { newGame(); } });
		 */
		buttonListener = new ButtonListener();
		mainTable = (TableLayout) findViewById(R.id.tableLayout1);
		context = mainTable.getContext();

		int x = 3, y = 4;
		newGame(x, y);
		music2 = MediaPlayer.create(this, R.raw.game);
		music2.start();
		textViewTime = (TextView) findViewById(R.id.textView1);
		textViewTime.setText("10:00");

		timer.start();

		music = MediaPlayer.create(this, R.raw.click);

	}

	public class CounterClass extends CountDownTimer {
		public CounterClass(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
		}

		public void onFinish() {
			if (counter == 6) {
				finish();
			} else {
				String score = "3";
				String totalclick = turns + "";
				String status = "Noob";

				SharedPreferences sharedPreferences = getSharedPreferences(
						"MyData", Context.MODE_PRIVATE);
				SharedPreferences.Editor editor = sharedPreferences.edit();
				editor.putString("score3", score);
				editor.commit();

				// Put extra
				Intent resulta = new Intent(Stage3.this, Score3.class);
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

	private void newGame(int c, int r) {
		ROW_COUNT = r;
		COL_COUNT = c;
		cards = new int[COL_COUNT][ROW_COUNT];
		TableRow tr = ((TableRow) findViewById(R.id.tableRow1));
		tr.removeAllViews();
		mainTable = new TableLayout(context);
		tr.addView(mainTable);
		for (int y = 0; y < ROW_COUNT; y++) {
			mainTable.addView(createRow(y));
		}
		firstCard = null;
		loadCards();
		counter = 0;
		turns = 0;

		/*
		 * DISPLAY TEXT ((TextView) findViewById(R.id.tv1)).setText("Tries: " +
		 * turns);
		 */
	}

	private void endGame() {

		if (turns >= 6 && turns <= 11) {

			String score = "1";
			String totalclick = turns + "";
			String status = "Pro";
			String active = "1";

			SharedPreferences sharedPreferences = getSharedPreferences(
					"MyData", Context.MODE_PRIVATE);
			SharedPreferences.Editor editor = sharedPreferences.edit();
			editor.putString("score3", score);
			editor.putString("active3", active);
			editor.commit();

			Intent resulta = new Intent(this.getBaseContext(), Score3.class);
			resulta.putExtra("score", score);
			resulta.putExtra("totalclick", totalclick);
			resulta.putExtra("status", status);
			startActivityForResult(resulta, 0);
			finish();

		}

		if (turns > 11 && turns <= 15) {

			String score = "2";
			String totalclick = turns + "";
			String status = "Good";

			SharedPreferences sharedPreferences = getSharedPreferences(
					"MyData", Context.MODE_PRIVATE);
			SharedPreferences.Editor editor = sharedPreferences.edit();
			editor.putString("score3", score);
			editor.commit();

			Intent resulta = new Intent(this.getBaseContext(), Score3.class);
			resulta.putExtra("score", score);
			resulta.putExtra("totalclick", totalclick);
			resulta.putExtra("status", status);
			startActivityForResult(resulta, 0);
			finish();

		}

		if (turns > 15) {

			String score = "3";
			String totalclick = turns + "";
			String status = "Noob";

			SharedPreferences sharedPreferences = getSharedPreferences(
					"MyData", Context.MODE_PRIVATE);
			SharedPreferences.Editor editor = sharedPreferences.edit();
			editor.putString("score3", score);
			editor.commit();

			Intent resulta = new Intent(this.getBaseContext(), Score3.class);
			resulta.putExtra("score", score);
			resulta.putExtra("totalclick", totalclick);
			resulta.putExtra("status", status);
			startActivityForResult(resulta, 0);
			finish();

		}

	}

	private void loadImages() {
		images = new ArrayList<Drawable>();
		images.add(getResources().getDrawable(R.drawable.s3card1));
		images.add(getResources().getDrawable(R.drawable.s3card2));
		images.add(getResources().getDrawable(R.drawable.s3card3));
		images.add(getResources().getDrawable(R.drawable.s3card4));
		images.add(getResources().getDrawable(R.drawable.s3card5));
		images.add(getResources().getDrawable(R.drawable.s3card6));
		images.add(getResources().getDrawable(R.drawable.s3card7));
		images.add(getResources().getDrawable(R.drawable.s3card8));
		images.add(getResources().getDrawable(R.drawable.s3card9));
		images.add(getResources().getDrawable(R.drawable.s3card10));

	}

	@SuppressLint("UseValueOf")
	private void loadCards() {
		try {
			int size = ROW_COUNT * COL_COUNT;
			Log.i("loadCards()", "size=" + size);
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				list.add(new Integer(i));
			}
			Random r = new Random();
			for (int i = size - 1; i >= 0; i--) {
				int t = 0;
				if (i > 0) {
					t = r.nextInt(i);
				}
				t = list.remove(t).intValue();
				cards[i % COL_COUNT][i / COL_COUNT] = t % (size / 2);
				Log.i("loadCards()", "card[" + (i % COL_COUNT) + "]["
						+ (i / COL_COUNT) + "]="
						+ cards[i % COL_COUNT][i / COL_COUNT]);
			}
		} catch (Exception e) {
			Log.e("loadCards()", e + "");
		}
	}

	private TableRow createRow(int y) {
		TableRow row = new TableRow(context);
		row.setHorizontalGravity(Gravity.CENTER);
		for (int x = 0; x < COL_COUNT; x++) {
			row.addView(createImageButton(x, y));
		}
		return row;
	}

	@SuppressWarnings("deprecation")
	private View createImageButton(int x, int y) {
		Button button = new Button(context);
		button.setBackgroundDrawable(backImage);
		button.setId(100 * x + y);
		button.setOnClickListener(buttonListener);
		return button;
	}

	class ButtonListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			synchronized (lock) {
				music.start();
				if (firstCard != null && seconedCard != null) {
					return;
				}
				int id = v.getId();
				int x = id / 100;
				int y = id % 100;
				turnCard((Button) v, x, y);
			}
		}

		@SuppressWarnings("deprecation")
		private void turnCard(Button button, int x, int y) {
			button.setBackgroundDrawable(images.get(cards[x][y]));
			if (firstCard == null) {
				firstCard = new Card(button, x, y);
			} else {
				if (firstCard.x == x && firstCard.y == y) {

					return; // the user pressed the same card

				}
				seconedCard = new Card(button, x, y);
				turns++;

				/*
				 * TURN ((TextView) findViewById(R.id.tv1)).setText("Tries: " +
				 * turns);
				 */
				TimerTask tt = new TimerTask() {
					@Override
					public void run() {
						try {
							synchronized (lock) {
								handler.sendEmptyMessage(0);
							}
						} catch (Exception e) {
							Log.e("Not Available", e.getMessage());
						}
					}
				};
				Timer t = new Timer(false);
				t.schedule(tt, 500);
			}
		}
	}

	class UpdateCardsHandler extends Handler {
		@Override
		public void handleMessage(Message msg) {
			synchronized (lock) {
				checkCards();
			}
		}

		@SuppressWarnings("deprecation")
		public void checkCards() {
			if (cards[seconedCard.x][seconedCard.y] == cards[firstCard.x][firstCard.y]) {

				firstCard.button.setVisibility(View.VISIBLE);
				seconedCard.button.setVisibility(View.VISIBLE);
				firstCard.button.setClickable(false);
				seconedCard.button.setClickable(false);

				counter++;

				if (counter == 6) {

					endGame();
				}

			}

			else {
				seconedCard.button.setBackgroundDrawable(backImage);
				firstCard.button.setBackgroundDrawable(backImage);
			}
			firstCard = null;
			seconedCard = null;
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