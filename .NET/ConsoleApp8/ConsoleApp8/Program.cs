using System;
using System.Threading;

class LockExample
{
    static int counter = 0;

    static void Main()
    {
        Thread t1 = new Thread(InterlockedExamples);
        Thread t2 = new Thread(InterlockedExamples);

        t1.Start();
        t2.Start();

        t1.Join();
        t2.Join();

        Console.WriteLine("Final Counter (lock): " + counter);
    }

    static void InterlockedExamples()
    {

        //Interlocked.Add(ref i, 10);
        //i+=10
        for (int i = 0; i < 1000; i++)
        { 
            Interlocked.Increment(ref counter);  
        }
        //Interlocked.Decrement(ref i);
        //i--;
        //Interlocked.Exchange(ref i, 10);
        //i = 10;
    }
}
