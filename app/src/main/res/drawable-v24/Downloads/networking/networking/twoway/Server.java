package twoway;

import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(2020);
		try
		{
			Socket s = ss.accept();
			System.out.println("Connection accepted from " + s.getRemoteSocketAddress());
			WriterThread wt = new WriterThread(s);
			wt.start();
			ReaderThread rt = new ReaderThread(s);
			rt.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
	}
}
