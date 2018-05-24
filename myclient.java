import java.io.*;  

import java.net.*;  

import java.util.Calendar;

import java.util.Date;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

public class myclient {  

public static void main(String[] args) throws Exception {

LocalDateTime now = LocalDateTime.now();

System.out.println("The current time is \t" + hour + ":" + min);
System.out.println("Today's date is \t" + month + "/" + day + "/" + 
year);

if (hour < 12)
	System.out.println("Good Morning!");
else if (hour < 17 && !(hour == 12))
	System.out.println("Good Afternoon!");
else if (hour == 12)
	System.out.println("Good Noon!");
else
	System.out.println("Good Evening!");
try{      

Socket s=new Socket("192.168.135.134",36726);  

BufferedReader in =new BufferedReader(new 
InputStreamReader(s.getInputStream() ));

System.out.println(in.readLine());

DataOutputStream dout=new DataOutputStream(s.getOutputStream());  

dout.writeUTF("Hello Server");  

dout.flush();  

dout.close();  

s.close();  

}catch(Exception e){System.out.println(e);}  

}  

}  
