package com.vk;

// use :- servlet,tomcat -> maven

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello World!" );

        Tomcat tomcat = new Tomcat(); // tomcat object
//        tomcat.setPort(8081); you can set a port but default port number is '8080'.

        Context context = tomcat.addContext("",null); // add context path
        tomcat.addServlet(context,"S1",new servlet()); // servlet object
        context.addServletMappingDecoded("/hello","S1"); // url after port

        tomcat.start(); // start te tomcat
        tomcat.getServer().await(); // get server and wait.
    }
}
