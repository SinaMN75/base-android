package com.developersian.util.Utilities;
import android.annotation.*;
import com.developersian.base.*;

import java.io.*;
import java.nio.charset.*;
import java.text.*;
import java.util.*;
@SuppressWarnings("ResultOfMethodCallIgnored") public class JsonReader{
	public static String loadJSONFromAsset(){
		String json;
		InputStream is;
		try{
			is=App.context.getAssets().open("location.json");
			int size=is.available();
			byte[] buffer=new byte[size];
			is.read(buffer);
			is.close();
			json=new String(buffer,StandardCharsets.UTF_8);
		}catch(IOException ex){
			ex.printStackTrace();
			return null;
		}
		try{
			@SuppressLint("SimpleDateFormat") SimpleDateFormat df=new SimpleDateFormat("hh:mm");
			Date d1=df.parse("23:30");
			Calendar c1=GregorianCalendar.getInstance();
			c1.setTime(d1);
		}catch(ParseException e){
			e.printStackTrace();
		}
		return json;
	}
}