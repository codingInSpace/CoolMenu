package com.example.coolmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Main extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
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
}