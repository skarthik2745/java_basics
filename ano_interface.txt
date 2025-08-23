// Interface
interface Playable {
    void play();
}

public class AnonymousInterfaceExample {
    public static void main(String[] args) {

        // Anonymous class for Playing Music
        Playable music = new Playable() {
            @Override
            public void play() {
                System.out.println("Playing music 🎵");
            }
        };

        // Anonymous class for Playing Video
        Playable video = new Playable() {
            @Override
            public void play() {
                System.out.println("Playing video 🎬");
            }
        };

        // Calling methods
        music.play();
        video.play();
    }
}