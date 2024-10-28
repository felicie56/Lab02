public class Aims {
    public static void main(String[] args) {
        
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Parasite", "Thriller", "Bong Joon-ho", 132, 15.99);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Spirited Away", "Animation", "Hayao Miyazaki", 125, 19.99);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Matrix", "Science Fiction", "The Wachowskis", 136, 14.99);
        cart.addDigitalVideoDisc(dvd3);

        cart.displayCart();

        System.out.println("Playing a DVD demo:");
        dvd2.play();

        cart.removeDigitalVideoDisc(dvd1);
        cart.displayCart();

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Unknown", "Mystery", "Unknown Director", 0, 9.99);
        dvd4.play();
    }
}
