package fr.iutvalence.info.dut.m3105.preamble;

public class GreenState extends TrafficSignalState
{
	
	
	@Override
	public void pressButton(TrafficSignal ts)
	{
		ts.stateSecondsRemaining = 2;
	}

	@Override
	public void secondEllapsed(TrafficSignal ts)
	{
		ts.stateSecondsRemaining--;
		System.out.println(ts.stateSecondsRemaining);
		System.out.flush();
		if (ts.stateSecondsRemaining == 0)
		{
			ts.setState(new OrangeState());
		}
		
	}




}
