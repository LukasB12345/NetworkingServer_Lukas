/* SERVER - may be enhanched to work for multiple clients */
import java.net.*;
import java.io.*;

public class NetworkingServer {
    public static void main(String[] args) {

        ServerSocket server = null;
        Socket client;

        //Default port number we are going to use
        int portnumber = 2005;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        //Create server side socket
        try{
            server = new ServerSocket(portnumber);
        } catch (IOException ie){
            System.out.println("Cannot open socket." + ie);
            System.exit(1);
        }
        System.out.println("Server");
        }
    }
