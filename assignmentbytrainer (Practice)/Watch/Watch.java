/**
 * @author Umesh Kumar Toke
 * Problem Name: Create a multithreaded program to implement the concept 
 * of watch. The Watch should display the time in hh:mm:ss
 * Role of this File: The following program implement the above concept
 */
package org.cybage.assignmentbytrainer.extrawork.watchbythread.deletewhendone;

import java.io.IOException;

public class Watch implements Runnable
{
	//Static variables since these should be available at class level
	static int hh, mm, ss;
	
	//Three Thread reference creation
	Thread ts;
	Thread tm;
	Thread th;
	
	//Main method
	public static void main(String[] args)
	{
		Watch ws = new Watch();
		
		//Creation of three thread sharing the same reference
		Thread ts = new Thread(ws);
		Thread tm = new Thread(ws);
		Thread th = new Thread(ws);
		
		//Thread Scheduler will perform the running of thread
		ts.start();
		tm.start();
		th.start();
	}
	
	//Run method which will be called after start() method executes
	@Override
	public void run()
	{
		synchronized (this)
		{
			while (true)
			{
				
				//Iterates till seconds become 60
				while (ss < 60)
				{
					System.out.println(hh + ":" + mm + ":" + ss);
					ss++;
					try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//Waits at the monitor and notifies other thread 
					if (ss == 60)
						notify();
				}
				
				//if seconds are 60 then operation will be performed on minutes 
				if (ss == 60)
				{
					try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					mm++;
					System.out.println(hh + ":" + mm + ":" + ss);
					
					//If the minutes are 60 then other thread will be notified
					if (mm == 60)
					{
						notify();
					}
					
					//If the minutes are not 60 then the seconds will be 
					//refreshed to 0
					else
					{
						notify();
						ss = 0;
					}
					
				}
				
				//If minutes and seconds both are 60 then hour will change
				if (mm == 60 && ss == 60)
				{
					hh++;
					try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(hh + ":" + mm + ":" + ss);
					mm = 0;
					
					//If hour turns out to be 12 then 
					//hour will be refreshed to 1
					//minutes will be refreshed to 0
					//Seconds will be refreshed to 0
					if (hh == 12)
					{
						hh=1;
						mm=0;
						ss=0;
					}
					notify();
				}
			}
		}
	}

}
