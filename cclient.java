import java.io.*; 

import java.net.*; 

public class cclient { 

	public static final int DEFAULT_PORT = 36726;

public static void usage() { 

	System.out.println("Usage: java C [<port>]"); 

	System.exit(0); 

} 

public static void main(String[] args) { 

	int port = DEFAULT_PORT;

 Socket s = new Socket ("192.168.135.137" , 36726); 

if ((args.length != 0) && (args.length != 1)) usage();

 if (args.length == 0) port = DEFAULT_PORT; 

else {

 try {

 port = Integer.parseInt(args[0]);

 }

 catch(NumberFormatException e) { 

usage();

 } 

}

try { 

BufferedReader reader; 

PrintWriter writer;

 s = new Socket("localhost", port);

 reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

 writer = new PrintWriter(new OutputStreamWriter(s.getOutputStream())); 

 System.out.println("Connected to " + s.getInetAddress() + ":" + 
s.getPort());

 String line;

 writer.println("Hello, Server");

 writer.flush();

 line = reader.readLine(); 

System.out.println("Server says: " + line);

 reader.close(); 

writer.close();

 }

catch (IOException e) {

 System.err.println(e);

 } 

finally { 

try {

 if (s != null) s.close();

 } 

catch (IOException e2) { } 

}

 }

 }


