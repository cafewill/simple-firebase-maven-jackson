package com.demo.simple;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.demo.simple.util.FirebaseUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SampleMultiple
{
    public static void main (String [] args)
    {
        try
        {
            List <String> token = new ArrayList <> ();
        	token.add ("FIREBASE-DEVICE-TOKEN #1");
        	token.add ("FIREBASE-DEVICE-TOKEN #2");
        	token.add ("FIREBASE-DEVICE-TOKEN #3");
        	token.add ("FIREBASE-DEVICE-TOKEN #4");
        	token.add ("FIREBASE-DEVICE-TOKEN #5");

        	Date date = new Date ();
            String title = String.format ("DEMO %s", new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss #SSS").format (date));
            String body = "DEMO Some message here!";
            String link = String.format ("https://github.com/cafewill?%s", new SimpleDateFormat ("yyyyMMddHHmmssSSS").format (date));
            
        	String response = FirebaseUtil.exec (token, title, body); // no link
        	// response = FirebaseUtil.send (token, title, body); // no link
        	// response = FirebaseUtil.exec (token, title, body, link); // use link 
        	// response = FirebaseUtil.send (token, title, body, link); // use link 
        	
        	log.info ("title : {}", title);
        	log.info ("body : {}", body);
        	log.info ("link : {}", link);
        	log.info ("response : [{}] {}", token.size (), response);
        } catch (Exception e) { e.printStackTrace (); }
    }
}
