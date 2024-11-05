package com.coherentsolutions.section2;

public class TypeIntersectionDemo {
    interface Singer {
        void sing();
    }

    interface Dancer {
        void dance();
    }

    static class PerformingArtist<T extends Singer & Dancer> {
        T artist;

        public PerformingArtist(T artist) {
            this.artist = artist;
        }

        void perform() {
            artist.sing();
            artist.dance();
        }
    }

    static class MultiTalentedPerson implements Singer, Dancer {
        @Override
        public void sing() {
            System.out.println("Singing...");
        }

        @Override
        public void dance() {
            System.out.println("Dancing...");
        }
    }

    public static void main(String[] args) {
        MultiTalentedPerson artist = new MultiTalentedPerson();
        PerformingArtist<MultiTalentedPerson> performer = new PerformingArtist<>(artist);
        performer.perform();
    }
}
