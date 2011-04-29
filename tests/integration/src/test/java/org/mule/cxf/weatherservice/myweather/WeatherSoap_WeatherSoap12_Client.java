package org.mule.cxf.weatherservice.myweather;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import javax.xml.namespace.QName;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 2.1.3
 * Thu Apr 21 10:17:27 PDT 2011
 * Generated source version: 2.1.3
 *
 */

public final class WeatherSoap_WeatherSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.cdyne.com/WeatherWS/", "Weather");

    private WeatherSoap_WeatherSoap12_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = Weather.WSDL_LOCATION;
        if (args.length > 0) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        Weather ss = new Weather(wsdlURL, SERVICE_NAME);
        WeatherSoap port = ss.getWeatherSoap12();

        {
        System.out.println("Invoking getCityWeatherByZIP...");
        GetCityWeatherByZIP _getCityWeatherByZIP_parameters = null;
        GetCityWeatherByZIPResponse _getCityWeatherByZIP__return = port.getCityWeatherByZIP(_getCityWeatherByZIP_parameters);
        System.out.println("getCityWeatherByZIP.result=" + _getCityWeatherByZIP__return);


        }
        {
        System.out.println("Invoking getWeatherInformation...");
        GetWeatherInformation _getWeatherInformation_parameters = null;
        GetWeatherInformationResponse _getWeatherInformation__return = port.getWeatherInformation(_getWeatherInformation_parameters);
        System.out.println("getWeatherInformation.result=" + _getWeatherInformation__return);


        }
        {
        System.out.println("Invoking getCityForecastByZIP...");
        GetCityForecastByZIP _getCityForecastByZIP_parameters = null;
        GetCityForecastByZIPResponse _getCityForecastByZIP__return = port.getCityForecastByZIP(_getCityForecastByZIP_parameters);
        System.out.println("getCityForecastByZIP.result=" + _getCityForecastByZIP__return);


        }

        System.exit(0);
    }

}