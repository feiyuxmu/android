package com.example.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("feiyuxmu", "onCreate");
		
		Intent intent = getIntent();
		String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView view = new TextView(this);
		view.setTextColor(Color.RED);
		view.setTextSize(40);
		view.setText(msg);
		setContentView(view);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i("feiyuxmu", "onDestroy");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i("feiyuxmu", "onPause");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i("feiyuxmu", "onResume");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i("feiyuxmu", "onStart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i("feiyuxmu", "onStop");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_message, menu);
		return true;
	}

}
