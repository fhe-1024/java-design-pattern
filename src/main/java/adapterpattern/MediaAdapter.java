package adapterpattern;

import adapterpattern.imediaplayer.AdvancedMediaPlayer;
import adapterpattern.imediaplayer.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String mediaType) {
		if ("vlc".equalsIgnoreCase(mediaType)) {
			advancedMediaPlayer = new VlcPlayer();
		} else if ("mp4".equalsIgnoreCase(mediaType)) {
			advancedMediaPlayer = new Mp4Player();
		}
	}

	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if ("vlc".equalsIgnoreCase(audioType)) {
			advancedMediaPlayer.playVlc(fileName);
		} else if ("mp4".equalsIgnoreCase(audioType)) {
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
