/**
    Title: First-Come First-Served (FCFS) Scheduling algorithm
    File-name: FCFS.java
    Purpose: Calculates the Average Waiting Time and the Average Turnaround Time
    considering the arrival time.
    @author Antonio Pierro
*/

import java.io.*;

public class FCFS {

    public static void main(String[] args) throws Exception {

        int processCount; // Number of processes
        double averageWaitingTime = 0; // Avg waiting time
        double averageTurnaroundTime = 0; // Avg waiting time
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter no of process");
        processCount = Integer.parseInt(br.readLine());

        int[] burstTime = new int[processCount]; // Burst time
        int[] waitingTime = new int[processCount]; // Waiting time
        int[] turnaroundTime = new int[processCount]; // Turnaround time
        int[] arrivalTime = new int[processCount]; // Arrival time

        for (int i = 0; i < processCount; i++)
        {
            System.out.print("Enter Arrival Time of P[" +  (i + 1) + "]: ");
            arrivalTime[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < processCount; i++)
        {
            System.out.print("Enter Process Burst Time of P[" +  (i + 1) + "]: ");
            burstTime[i] = Integer.parseInt(br.readLine());
        }

        waitingTime[0] = 0; //waiting time for first process is 0
        //calculating waiting time
        for(int i = 1; i < processCount; i++)
        {
            waitingTime[i] = 0;
            waitingTime[i] += burstTime[i - 1] + waitingTime[i - 1];
            waitingTime[i] -= arrivalTime[i] - arrivalTime[i - 1];
        }

        System.out.println("Process \t Arrival Time \t Burst Time \t Waiting Time \t Turnaround Time");

        //calculating turnaround time
        for(int i = 0; i < processCount; i++)
        {
            turnaroundTime[i] = burstTime[i] + waitingTime[i];
            averageWaitingTime += waitingTime[i];
            averageTurnaroundTime += turnaroundTime[i];
            System.out.println("P[" + (i + 1) + "]\t\t" + arrivalTime[i] + "\t\t" + burstTime[i] + "\t\t" + waitingTime[i] + "\t\t" + turnaroundTime[i]);
        }

        averageWaitingTime /= processCount;
        averageTurnaroundTime /= processCount;
        System.out.println("\n\nAverage Waiting Time: " + averageWaitingTime);
        System.out.println("\nAverage Turnaround Time: " + averageTurnaroundTime);
   }
}
