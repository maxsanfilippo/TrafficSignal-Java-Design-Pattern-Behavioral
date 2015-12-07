package fr.iutvalence.info.dut.m3105.preamble;

public interface TrafficSignalInterface
{
	final static int BUTTON_THRESHOLD_IN_SECONDS = 2;
	
	public void pressButton();
	public void run();
	public void secondEllapsed();
	public void switchToState();
}
