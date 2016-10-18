import java.io.*;

public class FCFS {

    public static void main(String[] args) throws Exception {

        int processCount; // Number of processes
        double averageWaitTime = 0; // Avg waiting time
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter no of process");
        processCount = Integer.parseInt(br.readLine());

        int[] burstTime = new int[processCount]; // Burst time
        int[] waitTime = new int[processCount]; // Waiting time
        int[] turnaroundTime = new int[processCount]; // Turnaround time
        int[] arrivalTime = new int[processCount]; // Arrival time

        for (int i = 0; i < processCount; i++)
        {
            System.out.print("Enter Process Burst Time of P[" +  (i + 1) + "]: ");
            burstTime[i] = Integer.parseInt(br.readLine());
        }
   }
}
