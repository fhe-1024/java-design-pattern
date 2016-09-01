package adapterpattern;

import adapterpattern.imediaplayer.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;

	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if ("mp3".equalsIgnoreCase(audioType)) {
			System.out.println("Playing mp3 file.Name:" + fileName);
		} else if ("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("I CANNOT PLAY IT!!!");
		}
	}

}
