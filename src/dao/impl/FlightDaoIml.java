package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoIml implements IFlightDao
{
    IFlightDao iFlightDao;

    @Override
    public void insertFlight(Flight flight) throws SQLException {

        iFlightDao=new FlightDaoIml();
        System.out.println("到达dao层"+flight);

        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        System.out.println(conn);

        String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

        PreparedStatement pstmt=conn.prepareStatement(sql);

        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightNo());
        pstmt.setString(3,flight.getPlaneType());
        pstmt.setInt(4,flight.getCurrentSeatsNum());
        pstmt.setString(5,flight.getDepartureAirPort());
        pstmt.setString(6,flight.getDestinationAirPort());
        pstmt.setString(7,flight.getDepartureData());

        pstmt.executeUpdate();

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
