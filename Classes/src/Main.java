public class Main {

    public static void main(String[] args) {
	// write your code here

        private int passangers;
        private int seats;

        public boolean hasRoom(Flight f2) {
            int total = passengers + f2.passengers;
            return total <= seats;

        }

        public Flight createNewWithBoth(Flight f2){
            Flight newFlight = new Flight();
            newFlight.seats = seats;
            newFlight.passengers = passengers + f2.passengers;
            return newFlight;
        }

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();

        Flight lax3;

        if(lax1.hasRoom(lax2))
            lax3 = lax1.createNewWithBoth(lax2);


}
