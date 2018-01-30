package server;

import javax.xml.ws.Endpoint;

public class Webserver {

	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8888/weather", new WeatherInterfaceImpl());
		System.out.println("发布成功");
	}

}
