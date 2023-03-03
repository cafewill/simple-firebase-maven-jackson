package com.demo.simple;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.demo.simple.util.FirebaseUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SampleSingle
{
    public static void main (String [] args)
    {
        try
        {
            String token = "FIREBASE-DEVICE-TOKEN";
            
        	Date date = new Date ();
            String title = String.format ("DEMO %s", new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss #SSS").format (date));
            String body = "DEMO Some message here!";
            String link = String.format ("https://github.com/cafewill?%s", new SimpleDateFormat ("yyyyMMddHHmmssSSS").format (date));
            
            String response = FirebaseUtil.exec (token, title, body); // no link
        	// response = FirebaseUtil.send (token, title, body); // no link
        	// response = FirebaseUtil.exec (token, title, body, link); // use link 
        	// response = FirebaseUtil.send (token, title, body, link); // use link 
            
        	log.info ("title : " + title);
        	log.info ("body : " + body);
        	log.info ("link : " + link);
        	log.info ("response : " + response);
        } catch (Exception e) { e.printStackTrace (); }
    }
}
