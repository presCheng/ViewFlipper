package com.example.viewflipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {
	private ViewFlipper viewFlipper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper1);
		
	}
	public void prev (View source) {
		viewFlipper.setInAnimation(this, R.layout.right);
		viewFlipper.setOutAnimation(this, R.layout.left);
		viewFlipper.showPrevious();
		viewFlipper.stopFlipping();
		
	}
	public void next (View source){
		viewFlipper.setInAnimation(this, R.layout.left);
		viewFlipper.setOutAnimation(this, R.layout.right);
		viewFlipper.showNext();
		viewFlipper.stopFlipping();
	}
	public void auto (View source){
		viewFlipper.setInAnimation(this, R.layout.left);
		viewFlipper.setOutAnimation(this, R.layout.right);
		viewFlipper.startFlipping();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
