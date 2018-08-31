
import java.util.HashSet;
import java.util.Set;

public class FlightManager {

    private Set<Flight> flights = new HashSet<>();

    public boolean addNewFlight(Flight flight) {
        return flights.add(flight);
    }

    public HashSet findFlightsBetween(String origin, String destination, boolean directionSensitive) {
        HashSet availableFlights = new HashSet();

        for (Flight flight : flights) {
            if (flight.getOrigin().equals(origin)) {
                availableFlights.add(flight.getOrigin() + "->" + flight.getDestination());
            }
            if (directionSensitive == false) {
                if (flight.getDestination().equals(origin)) {
                    availableFlights.add(flight.getDestination() + "->" + flight.getOrigin());
                }
            }
        }
        return availableFlights;
    }
}


class Flight {

    private String flightNo;

    private String origin;

    private String destination;

    public String getFlightNo() {
        return flightNo;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }


}

