package server2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.sky.com/", name = "qianfeng", portName = "skyPort", serviceName = "qianfeng")
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	@WebMethod(operationName = "query", exclude = false)
	public @WebResult(name = "result") String queryWeather(@WebParam(name = "city") String cityName) {
		if("±±¾©".equals(cityName)){
			return "Îíö²";
		}else{
			return "ÇçÌì";
		}
		
	}

}
