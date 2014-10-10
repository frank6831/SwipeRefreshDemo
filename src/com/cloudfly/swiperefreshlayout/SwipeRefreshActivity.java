package com.cloudfly.swiperefreshlayout;

import com.cloudfly.swiperefreshlayout.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;

public class SwipeRefreshActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener {
	private SwipeRefreshLayout mSwipeRefreshLayout;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
		mSwipeRefreshLayout.setOnRefreshListener(this);
		// Set the color in loading bar
		mSwipeRefreshLayout.setColorScheme(android.R.color.holo_blue_bright,
				android.R.color.holo_green_light, android.R.color.holo_orange_light,
				android.R.color.holo_red_light);
	}

	@Override
	public void onRefresh() {
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				mSwipeRefreshLayout.setRefreshing(false);
			}
		}, 5000);
	}
}
