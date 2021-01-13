package bean;

public class Flight
{
    private String id;
    private String planeType;//飞机类型
    private String flightNo;//飞机航班
    private String seatsNo;//座位号
    private int currentSeatsNum;//总座位数
    private String departureAirPort;//出发机场
    private String destinationAirPort;//目的机场
    private String departureData;//出发时间

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPlaneType() { return planeType; }
    public void setPlaneType(String planeType) { this.planeType = planeType; }

    public String getFlightNo() { return flightNo; }
    public void setFlightNo(String flightNo) { this.flightNo = flightNo; }

    public String getSeatsNo() { return seatsNo; }
    public void setSeatsNo(String seatsNo) { this.seatsNo = seatsNo; }

    public int getCurrentSeatsNum() { return currentSeatsNum; }
    public void setCurrentSeatsNum(int currentSeatsNum) { this.currentSeatsNum = currentSeatsNum; }

    public String getDepartureAirPort() { return departureAirPort; }
    public void setDepartureAirPort(String departureAirPort) { this.departureAirPort = departureAirPort; }

    public String getDestinationAirPort() { return destinationAirPort; }
    public void setDestinationAirPort(String destinationAirPort) { this.destinationAirPort = destinationAirPort; }

    public String getDepartureData() { return departureData; }
    public void setDepartureData(String departureData) { this.departureData = departureData; }

    public Flight(String id,String planeType,String flightNo,int currentSeatsNum,String departureAirPort,
                  String destinationAirPort,String departureData)
    {
        this.id=id;
        this.planeType = planeType;
        this.flightNo=flightNo;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.departureData = departureData;
        this.destinationAirPort = destinationAirPort;
    }

    @Override
    public String toString() {
        return "Flight{" +
                id+
                "planeType='" + planeType + '\'' +
                ", seatsNo='" + seatsNo + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", departureData='" + departureData + '\'' +
                '}';
    }
}
