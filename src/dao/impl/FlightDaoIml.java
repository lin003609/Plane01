package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.util.Set;

public class FlightDaoIml implements IFlightDao
{
    IFlightDao iFlightDao;

    @Override
    public void insertFlight(Flight flight) {
        iFlightDao=new FlightDaoIml();
        System.out.println("到达dao层"+flight);
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
