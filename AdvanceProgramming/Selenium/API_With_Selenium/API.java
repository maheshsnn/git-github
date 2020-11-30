package API_With_Selenium;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class API {

	public static void main(String[] args) throws Exception {

		String xyz = API.getdoc("http://api.geonames.org/weatherIcao?ICAO=LSZH&username=rheh&style=full");
		Document dom = API.LoadXMLFromString(xyz);
		Element el = dom.getDocumentElement();
		System.out.println(API.getTextvalue(el, "ICAO"));
		System.out.println(API.getTextvalue(el, "stationName"));

	}

	public static String getTextvalue(Element ele, String tagname) {

		String textval = "";

		NodeList nl = ele.getElementsByTagName(tagname);

		if (nl != null && nl.getLength() > 0) {
			Element el = (Element) nl.item(0);
			textval = el.getFirstChild().getNodeValue();
		}

		return textval;

	}

	public static Document LoadXMLFromString(String xml) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(xml));

		return builder.parse(is);
	}

	public static String getdoc(String urltoload) throws Exception {

		URL url;
		HttpURLConnection conn;
		String line;
		BufferedReader rd;
		String result = "";

		try {
			url = new URL(urltoload);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");

			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			while ((line = rd.readLine()) != null) {
				result += line;
			}

			rd.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

		return result;

	}

}
