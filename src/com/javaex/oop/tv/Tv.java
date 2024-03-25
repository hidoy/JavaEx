package com.javaex.oop.tv;

public class Tv {
	private int channel;
	private int voluem;
	private boolean power;
	
	public Tv(int theChannel, int theVoluem, boolean thePower) {
		channel=theChannel;
		voluem=theVoluem;
		power=thePower;
	}
	public int getChannel() {
		return channel;
	}
	public int getVoluem() {
		return voluem;
	}
	public void power(boolean on) {
		power=on;
	}
	public void channel(int theChannel) {
		if(theChannel<=255 && theChannel>=1) {
			channel=theChannel;
		}
		else if(theChannel>=255) {
			channel=255;
		}
		else {
			channel=1;
		}
	}
	public void channel(boolean up) {
		if(up==true) {
			channel++;
			channel=channel%255;
		}
		else if(channel-1==-1){
			channel=255;
		}
		else {
			channel--;
		}
	}
	public void volume(int theVoluem) {
		if(theVoluem>=1 && theVoluem<=100)
			voluem=theVoluem;
		else if(theVoluem<=0) {
			voluem=1;
		}
		else {
			voluem=100;
		}
	}
	public void volume(boolean up) {
		if(up==true) {
			voluem++;
			voluem=voluem%100;
		}
		else if(voluem-1>=1){
			voluem--;
		}
	}
	public void status() {
		System.out.printf("%d %d %s %n",channel,voluem,power);
	}
}
