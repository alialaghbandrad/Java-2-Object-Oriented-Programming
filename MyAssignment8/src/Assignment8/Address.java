package Assignment8;

public class Address {
	int buildingNo;
    String StreetName;
    String cityName;
    String provinceName;
    String postalCode;

    public Address(int buildingNo, String streetName, String cityName, String provinceName, String postalCode) {
        this.buildingNo = buildingNo;
        StreetName = streetName;
        this.cityName = cityName;
        this.provinceName = provinceName;
        this.postalCode = postalCode;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public String getStreetName() {
        return StreetName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" + "buildingNo=" + buildingNo + ", StreetName='" + StreetName + '\'' +
                ", cityName='" + cityName + '\'' + ", provinceName='" + provinceName + '\'' +
                ", postalCode='" + postalCode + '\'' + '}';
    }
}

