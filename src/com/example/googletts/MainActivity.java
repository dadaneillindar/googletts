package com.example.googletts;

import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bt1 = (Button)this.findViewById(R.id.button1);
		bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String oLanguage = "zh";
			    MediaPlayer player = new MediaPlayer();
			    String mainText = "§A";
			    try {
					player.setDataSource("http://translate.google.com/translate_tts?tl=" + oLanguage + "&q=" + mainText);
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
					
					@Override
					public void onPrepared(MediaPlayer mp) {
						// TODO Auto-generated method stub
						mp.start();
					}
				});
			    player.prepareAsync();
			}
		});
	}


}
