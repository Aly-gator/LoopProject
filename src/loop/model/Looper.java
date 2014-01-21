package loop.model;

import java.util.ArrayList;

public class Looper
{
	
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheNameList();
	}	
			
		
	private void fillTheNameList()	
	{
		graveNameList.add("Carl Jay Elder");
		graveNameList.add("Kathy Ruth");
		graveNameList.add("Donald Blaine");
		graveNameList.add("Iris T. Miller Johnson");
		graveNameList.add("John H. Doherty");
		graveNameList.add("Hazel Torgenson");
		graveNameList.add("Darrel D.Ashby");
				
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}


	public void setGraveNameList(ArrayList<String> graveNameList)
	{
		this.graveNameList = graveNameList;
	}


	public String LoopTestOne()
	{
		String loopResult = "";
		int  timesLooped = 0;
		
		for(int loopCounter = 0; loopCounter <10; loopCounter+=2)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}
		
		loopResult += "\nThe loop executed " + timesLooped + "times";
		
		return loopResult;
	}
	
	public String loopTestTwo()
	{
		
		String loopResult = "";
		int outerLoopTimes = 0;
        int  timesLooped = 0;
        for (int weeks = 0; weeks < 52; weeks++)
        {
        	for(int hours = 0; hours < 24; hours++)
        	{
        		for (int outerLoop = 0; outerLoop < 60; outerLoop++)
        		{
        			for(int loopCounter = 0; loopCounter <60; loopCounter+=2)
        			{
        				loopResult += loopCounter +  ", ";
        				timesLooped++;
        			}	
        			outerLoopTimes++;
        		}
        	}
        }
		loopResult += "\nThe loop executed " + timesLooped + "times";
		
		return loopResult;
	}
	
	
	
		
		
	

}

