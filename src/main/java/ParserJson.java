
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ParserJson {


    public static URL createUrl(String url) throws MalformedURLException {
        return new URL(url);
    }

    public static String parsUrl(URL url) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

    public static void parseObject (String result) throws ParseException {
        JSONObject job = (JSONObject) JSONValue.parseWithException(result);
        System.out.println("Название" + job.get("news"));//  не могу вывести названия массива news

        JSONArray jsonArray = (JSONArray) job.get("news");
        for( int i=0; i<jsonArray.size(); i++ ){
            System.out.println("array is " + jsonArray.get(i));

        }
    }
}
