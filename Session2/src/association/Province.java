package association;

public class Province {
	
	private String provinceName;
	
	//I need to hold the information of cities
	//Array, Basic of data structure List(arrayList), Map(HashMap), Set(HashSet)
	private City[] cities;
//	private List<City> listCity;
	
	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public City[] getCities() {
		return cities;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}
	
	
}
