package com.demo.simple;

import java.util.Date;
import java.util.List;

import com.demo.simple.util.FirebaseUtil;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.text.SimpleDateFormat;

@Slf4j
public class SampleSingle
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
            
            String single = "FIREBASE-DEVICE-TOKEN";
        	response = FirebaseUtil.exec (single, title, body); // no link
        	// response = FirebaseUtil.send (single, title, body); // no link
        	// response = FirebaseUtil.exec (single, title, body, link); // use link 
        	// response = FirebaseUtil.send (single, title, body, link); // use link 
            log.info ("--------------------------------------------------");
        	log.info ("title : " + title);
        	log.info ("body : " + body);
        	log.info ("link : " + link);
            log.info ("--------------------------------------------------");
        	log.info ("response : " + response);
            log.info ("--------------------------------------------------");
        } catch (Exception e) { e.printStackTrace (); }
    }
}
