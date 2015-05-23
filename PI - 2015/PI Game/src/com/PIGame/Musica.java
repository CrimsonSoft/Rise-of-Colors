package com.PIGame;

import java.applet.*;
import java.net.*;

public class Musica {

	boolean play, stop, loop;
	String file;
	AudioClip mySong;

	public Musica() {
		file = "D:/WorkSpace/Rise of Colors/PI - 2015/PI Game/res/Musica/BMG.wav";

		try {
			AudioClip clip = Applet.newAudioClip(new URL("file:" + file));
			clip.loop();
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			System.out.println("Por algum motivo a musica parou ");
		}
	}
}