//<=======================================MultiThreadedServer==================================>
package sample;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiThreadedServer  {

    public static void  main(String[] args){
    	ArrayList clientes=new ArrayList<ClientThread>();
    	
        try{
            ServerSocket serverSocket = new ServerSocket(9090);
            boolean stop = false;
            while(!stop){
                System.out.println("Esperando clientes");
                Socket clientSocket = serverSocket.accept();
                
                System.out.println("El cliente se ha conectado");
                // usamos la clase ClientThread
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.start();
                clientes.add(clientThread);
                
            }

        }
        catch(Exception e){

        }
    }
}
//<===================================Client==============================>
package sample;

import java.net.*;
import java.util.Scanner;
import java.io.*;



public class Client
{
	private static Scanner lector=new Scanner(System.in);
    public static void main(String [] args)
    {
        try
        {

            InetAddress serverAddress = InetAddress.getByName("localhost") ;
            System.out.println("server ip address: " + serverAddress.getHostAddress());
            Socket socket = new Socket(serverAddress, 9090);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Dime tu nick");
            String nick;
            nick=lector.nextLine();
            
            String linea;
            linea=lector.nextLine();
            while(linea!=".exit") {
            	out.println(nick + ": " + linea);
                linea = input.readLine();
            }
            System.out.println("Chat finalizado");
            
            socket.close();

        }
        catch(UnknownHostException e1)
        {
            System.out.println("Unknown host exception " + e1.toString());
        }
        catch(IOException e2)
        {
            System.out.println("IOException " + e2.toString());
        }
        catch(IllegalArgumentException e3)
        {
            System.out.println("Illegal Argument Exception " + e3.toString());
        }
        catch(Exception e4)
        {
            System.out.println("Other exceptions " + e4.toString());
        }
    }
}
//<==================================ClientThread================================>
package sample;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ClientThread extends Thread {

    private Socket socket = null;

    public ClientThread (Socket socket){
        this.socket = socket;
    }

    public void run(){
        try {
       
        PrintWriter out = null;
            out = new PrintWriter(socket.getOutputStream(), true);
        
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String clientInput = input.readLine();
        out.println("Mensaje recibido");
        input.close();
        out.close();
        socket.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

}
