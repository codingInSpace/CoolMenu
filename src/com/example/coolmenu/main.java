package com.example.coolmenu;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class main extends Activity{
	MediaPlayer logoMusic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		logoMusic = MediaPlayer.create(main.this, R.raw.me3startsound);
		logoMusic.start();
		Thread logoTimer = new Thread(){
			public void run(){
				try{
					sleep(5000);
					Intent menuIntent = new Intent("com.example.coolmenu.MENU");
					startActivity(menuIntent);
				}
				 catch(InterruptedException e){
					 e.printStackTrace();
				 }
				finally{
					finish();
				}
			}
		};
		logoTimer.start(); 
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		logoMusic.release();
	}
	
}