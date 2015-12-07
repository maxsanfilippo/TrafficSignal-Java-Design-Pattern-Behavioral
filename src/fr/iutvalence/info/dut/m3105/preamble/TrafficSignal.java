package fr.iutvalence.info.dut.m3105.preamble;

public class TrafficSignal extends Thread implements TrafficSignalInterface
{
	private TrafficSignalState state;
	protected int stateSecondsRemaining; 
	
	
	public TrafficSignal()
	{
		super();
	}

	public void pressButton()
	{
		System.out.println("Button pressed!");
		System.out.flush();
		state.pressButton(this);
	}
	
	public void run()
	{
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				this.secondEllapsed();
			}
			catch (InterruptedException e)
			{
				break;
			}
		}
	}

	public void setState(TrafficSignalState state)
	{
		this.state = state;
	}
	
	public void secondEllapsed()
	{
		state.secondEllapsed(this);
		
//		this.stateSecondsRemaining--;
//		System.out.println(this.stateSecondsRemaining);
//		System.out.flush();
//		if (this.stateSecondsRemaining == 0)
//		{
//			switch(this.state)
//			{
//				case GREEN: 
//					this.switchToState(TrafficSignalState.ORANGE);
//					break;
//				case ORANGE: 
//					this.switchToState(TrafficSignalState.RED);
//					break;
//				case RED: 
//					this.switchToState(TrafficSignalState.GREEN);
//					break;
//			}
//		}	
	}

	public void switchToState()
	{
		System.out.println("Traffic signal turns "+state);
		System.out.flush();
		this.state = state;
		this.stateSecondsRemaining = this.state.getDurationInSeconds();		
	}
}
