package cuacho.version22;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import cuacho.version10.*;
import jdk.swing.interop.SwingInterOpUtils;

public class TestDriverCuaCho {
	public static void main(String[] args) {
		CuaCho cua = new CuaCho();
		BarkRecognizer bark = new BarkRecognizer(cua);
		System.out.println("Fido sủa để đi ra ngoài");
		bark.regcognize("gâu gâu");
		System.out.println("Fido đi ra ngoài");
		System.out.println("Fido tác nghiệp XYZ ...");
		cua.auto();
		System.out.println("Fido sủa để vào nhà");
		bark.regcognize("gâu gâu1");
		System.out.println("Fido đi vào nhà");
		cua.auto();

		/*
		 * try { audio(); } catch (UnsupportedAudioFileException | IOException |
		 * LineUnavailableException e) { e.printStackTrace(); }
		 */

	}

	public static void audio() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("a.wav");
		AudioInputStream audio = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audio);
		while (true) {
			clip.start();
		}
	}
}