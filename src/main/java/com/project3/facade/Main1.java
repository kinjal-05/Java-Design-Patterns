package com.project3.facade;

public class Main1
{
	public static void main(String[] args)
	{
		DVDPlayer dvdPlayer=new DVDPlayer();
		Projector projector=new Projector();
		SoundSystem soundSystem=new SoundSystem();
		Lights lights=new Lights();
		HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(dvdPlayer,projector,soundSystem,lights);
		homeTheaterFacade.watchMovie("Inception");
	}
}