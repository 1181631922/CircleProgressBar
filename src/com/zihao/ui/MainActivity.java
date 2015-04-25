package com.zihao.ui;

import com.zihao.ui.proggress.CircleProgressBar;

import android.os.Bundle;
import android.widget.ImageView;
import android.app.Activity;

public class MainActivity extends Activity {

	/**
	 * 进度标志点
	 */
	private ImageView circlePointImg;

	/**
	 * 进度条
	 */
	private CircleProgressBar mBar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		circlePointImg = (ImageView) findViewById(R.id.circle_point_img);
		mBar = (CircleProgressBar) findViewById(R.id.myProgress);

		mBar.setProgress(100, circlePointImg);
//		mBar.setProgress(18, null);
	}

}