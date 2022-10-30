package Model;

public class House {

    private String houseNo;
    private Community community;
    private City city;
    
    public House(String add, Community community,City c){
        this.houseNo = add;
        this.city = c;
        this.community = community;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
