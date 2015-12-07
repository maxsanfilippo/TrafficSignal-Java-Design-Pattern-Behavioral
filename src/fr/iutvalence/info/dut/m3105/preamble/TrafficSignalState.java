package fr.iutvalence.info.dut.m3105.preamble;

public abstract class TrafficSignalState
{
	
	private final int durationInSeconds;
	
	private TrafficSignalState(int durationInSeconds)
	{
		this.durationInSeconds = durationInSeconds;
	}
	
	public void pressButton(TrafficSignal ts){};
	
	public abstract void secondEllapsed(TrafficSignal ts);
	
	public int getDurationInSeconds()
	{
		return this.durationInSeconds;
	}
}
