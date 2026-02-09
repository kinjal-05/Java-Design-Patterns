package com.project3.facade;

public class HomeTheaterFacade
{
	private DVDPlayer dvdPlayer;
	private Projector projector;
	private  SoundSystem soundSystem;
	private Lights lights;

	public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Lights lights) {
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.soundSystem = soundSystem;
		this.lights = lights;
	}

	public void watchMovie(String movie)
	{
		System.out.println("Ready To Watch a Movie");
		lights.dim();
		projector.on();
		projector.setWideScreenMode();
		soundSystem.on();
		soundSystem.setVolume(20);
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}
}