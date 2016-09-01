package adapterpattern;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "i love you.mp3");
		audioPlayer.play("vlc", "hehe.vlc");
	}
}
