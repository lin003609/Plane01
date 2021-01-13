package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.sql.*;
import java.util.HashSet;
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
    public Set<Flight> getAllFlights() throws SQLException {

        Set<Flight> allFlights =new HashSet<Flight>();

        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        System.out.println(conn);

        String sql="SELECT * FROM flight";

        PreparedStatement pstmt=conn.prepareStatement(sql);

        ResultSet rs=pstmt.executeQuery();

        while(rs.next()){

            String id=rs.getString("ID");
            String flightNo=rs.getString("FLIGHT_ID");
            String planeType=rs.getString("PLANE_TYPE");
            int currentSeatsNum=rs.getInt("TOTAL_SEATS_NUM");
            String departureAirPort=rs.getString("DEPARTURE_AIRPORT");
            String destinationAirPort=rs.getString("DESTINATION_AIRPORT");
            String departureData=rs.getString("DEPARTURE_TIME");

            Flight flight=new Flight(id,planeType,flightNo,currentSeatsNum,departureAirPort,destinationAirPort,departureData);

            allFlights.add(flight);
        }



        return allFlights;
    }

    private String getString() {
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
