package project;
import java.io.*; 
import java.net.*; 

public class Server { 
    public static void main(String[] args) throws IOException { 
            // Create a ServerSocket that listens on a specific port 
            int port = 12346; 
            ServerSocket serverSocket = new ServerSocket(port); 
            System.out.println("Server listening on port " + port); 

            // Accept incoming client connections 
            Socket clientSocket = serverSocket.accept(); 
            System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress()); 

            // Set up input and output streams 
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); 

            // Read and display messages from the client 
            String message; 
            while ((message = in.readLine()) != null) { 
                System.out.println("Client: " + message); 
                out.println("Server received: " + message); // Send response to client 
            } 

            // Close resources 
            in.close(); 
            out.close(); 
            clientSocket.close(); 
            serverSocket.close(); 
        
    } 
}
