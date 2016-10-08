import java.io.*;

public class FCFS {

    public static void main(String args[]) throws Exception {

        int n; // Number of processes
        float averageWaitTime = 0; // Avg waiting time
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter no of process");
        n = Integer.parseInt(br.readLine());

        int[] burstTime = new int[n]; // Burst time
        int[] waitTime = new int[n]; // Waiting time
        int[] turnaroundTime = new int[n]; // Turnaround time
        int[] arrivalTime = new int[n]; // Arrival time
   }
}
