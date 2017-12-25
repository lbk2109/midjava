package javaThread.exam;

public class MusicPlayer implements Runnable {
	public int mtype;
	public MusicBox musicBox;

	public MusicPlayer(int mtype, MusicBox musicBox) {
		this.mtype = mtype;
		this.musicBox = musicBox;
	}

	@Override
	public void run() {
		switch (mtype) {
		case 1:
			musicBox.playMusicA(mtype);
			break;
		case 2:
			musicBox.playMusicB(mtype);
			break;
		case 3:
			musicBox.playMusicC(mtype);
			break;
		}
	}
}
