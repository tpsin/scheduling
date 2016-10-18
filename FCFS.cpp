/**
    Title: First-Come First-Served (FCFS) Scheduling algorithm
    File-name: FCFS-at.cpp
    Purpose: Calculates the Average Waiting Time and the Average Turnaround Time
    considering the arrival time.

    @author Antonio Pierro
*/
#include <iostream>

int main()
{
    int processCount, averageWaitingTime = 0, averageTurnaroundTime = 0;

    std::cout << "Enter total number of processes: ";
    std::cin >> processCount;

    int burstTime[processCount], waitingTime[processCount], turnaroundTime[processCount];
    int arrivalTime[processCount];

    std::cout << "\nEnter Process ArrivalTime\n";
    for (int i = 0; i < processCount; i++)
    {
        std::cout << "P[" << i + 1 << "]:";
        std::cin >> arrivalTime[i];
    }

    std::cout << "\nEnter Process Burst Time\n";
    for (int i = 0; i < processCount; i++)
    {
        std::cout << "P[" << i + 1 << "]:";
        std::cin >> burstTime[i];
    }

    waitingTime[0] = 0; //waiting time for first process is 0
    //calculating waiting time
    for(int i = 1; i < processCount; i++)
    {
        waitingTime[i] = 0;
        waitingTime[i] += burstTime[i - 1] + waitingTime[i - 1];
        waitingTime[i] -= arrivalTime[i] - arrivalTime[i - 1];
    }

    std::cout<<"\nProcess \t Arrival Time \t Burst Time \t Waiting Time \t Turnaround Time";

    //calculating turnaround time
    for(int i = 0; i < processCount; i++)
    {
        turnaroundTime[i] = burstTime[i] + waitingTime[i];
        averageWaitingTime += waitingTime[i];
        averageTurnaroundTime += turnaroundTime[i];
        std::cout << "\nP[" << i + 1 << "] \t\t" << arrivalTime[i] << "\t\t" << burstTime[i];
        std::cout << "\t\t" << waitingTime[i] << "\t\t" << turnaroundTime[i];
    }

    averageWaitingTime /= processCount;
    averageTurnaroundTime /= processCount;
    std::cout << "\n\nAverage Waiting Time:" << averageWaitingTime;
    std::cout << "\nAverage Turnaround Time:" << averageTurnaroundTime << "\n";

    return 0;
}
