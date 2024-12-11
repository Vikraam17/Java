package project;
import java.io.*; 
import java.net.*; 

public class Client { 
    public static void main(String[] args) { 
        try { 
            // Define the server's IP address and port 
            String IP = "127.0.0.1"; // Server's IP address (localhost in this case) 
            int Port = 12346; // Port on which the server is listening 

            // Create a socket to connect to the server 
            Socket socket = new Socket(IP, Port);

            // Set up input and output streams for communication 
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 

            // Read messages from the user and send them to the server 
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)); 
            String message; 
            while (true) { 
                System.out.print("You: "); 
                message = userInput.readLine(); // Read user input 
                out.println(message); // Send message to the server 

                if (message.equalsIgnoreCase("bye")) { 
                    break; // Exit the loop if the user types "bye" 
                } 

                String response = in.readLine(); // Receive server's response 
                System.out.println(response); // Print server's response 
            } 

            // Close resources 
            userInput.close(); 
            in.close(); 
            out.close(); 
            socket.close(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
}
