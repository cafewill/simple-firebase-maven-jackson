package com.demo.simple;

import java.util.Date;
import java.util.List;

import com.demo.simple.util.FirebaseUtil;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.text.SimpleDateFormat;

@Slf4j
public class SampleMultiple
{
    public static void main (String [] args)
    {
        try
        {
        	Date at = new Date ();
            String title = String.format ("DEMO %s", new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss #SSS").format (at));
            String body = "DEMO Some message here!";
            String link = String.format ("https://github.com/cafewill?%s", new SimpleDateFormat ("yyyyMMddHHmmssSSS").format (at));
            
            String response = "";
            
            // max : 1 ~ 1000
            List <String> multi = new ArrayList <> ();
        	multi.add ("FIREBASE-DEVICE-TOKEN #1");
        	multi.add ("FIREBASE-DEVICE-TOKEN #2");
        	multi.add ("FIREBASE-DEVICE-TOKEN #3");
        	multi.add ("FIREBASE-DEVICE-TOKEN #4");
        	multi.add ("FIREBASE-DEVICE-TOKEN #5");
        	response = FirebaseUtil.exec (multi, title, body); // no link
        	// response = FirebaseUtil.send (multi, title, body); // no link
        	// response = FirebaseUtil.exec (multi, title, body, link); // use link 
        	// response = FirebaseUtil.send (multi, title, body, link); // use link 
            log.info ("--------------------------------------------------");
        	log.info ("title : " + title);
        	log.info ("body : " + body);
        	log.info ("link : " + link);
            log.info ("--------------------------------------------------");
        	log.info ("response : [" + multi.size () + "] " + response);
        	log.info ("--------------------------------------------------");
        } catch (Exception e) { e.printStackTrace (); }
    }
}
