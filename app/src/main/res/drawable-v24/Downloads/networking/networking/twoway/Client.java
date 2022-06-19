package twoway;

import java.net.*;
import java.io.*;
import java.util.*;
public class Client
{
	public static void main(String args[]) throws Exception
	{
		Socket s = new Socket("localhost", 2020);
		System.out.println("Connection established with " + s.getRemoteSocketAddress());
		WriterThread wt = new WriterThread(s);
		wt.start();
		ReaderThread rt = new ReaderThread(s);
		rt.start();
	}
}
