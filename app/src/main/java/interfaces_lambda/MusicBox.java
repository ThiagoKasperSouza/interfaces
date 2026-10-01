package main.java.interfaces_lambda;

public record MusicBox(String music, boolean isPlaying) implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }
    
}
