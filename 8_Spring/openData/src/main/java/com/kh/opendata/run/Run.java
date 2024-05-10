package com.kh.opendata.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Run {
	public static final String SERVICE_KEY = "QlcQb7zoVjve4mNm9%2F0Iek38JbojrYxfgMz9VTzWZTILFrIHSMeCkI%2B0xdp%2BuAY8LOUCu7RUdLZynnbCaXJZsg%3D%3D\r\n";
	
	public static void main(String[] args) throws IOException {
		
		String url = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";
		url += "?serviceKey=" + SERVICE_KEY;
		url += "&returnType=json";
		url += "&sidoName=" + URLEncoder.encode("서울", "UTF-8");
		
		//System.out.println(url);
		
		URL requestURL = new URL(url);
		
		HttpURLConnection urlConnection = (HttpURLConnection)requestURL.openConnection();
		
		urlConnection.setRequestMethod("GET");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
	}
}
