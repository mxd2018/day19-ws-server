package server;

import javax.jws.WebService;

@WebService
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		if("����".equals(cityName)){
			return "����";
		}else{
			return "����";
		}
		
	}

}
