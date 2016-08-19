//package com.example.xposed_weichat;
//
//
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.Button;
//
//public class MainActivity extends Activity {
//	
//	//private AES_LaAndLo AES=null;
//	private SettingsHelper mSettings;
//   private Button abc;
//    private int i=1;
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.fragment_main);
//		abc=(Button)findViewById(R.id.abc);
//		abc.setOnClickListener(new  OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				i+=10;
//				mSettings.setString("lsx","sdfcscscss" +i);
//			}
//		});
//		//AES=new AES_LaAndLo();
//		mSettings = new SettingsHelper(this);
//		mSettings.setString("longitude", "80.449535");//北京的经度值
//		mSettings.setString("latitude", "45.862559");//北京的纬度值
//		
//	}
//}

package com.example.xposed_weichat;



import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	
	//private AES_LaAndLo AES=null;
	private SettingsHelper mSettings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		//AES=new AES_LaAndLo();
		mSettings = new SettingsHelper(this);
		mSettings.setString("longitude", "116.449535");//北京的经度值
		mSettings.setString("latitude", "39.862559");//北京的纬度值
	}
}

