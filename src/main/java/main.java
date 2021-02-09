import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URL;

public class main {

    private final static String NEWS_URL = "https://my-json-server.typicode.com/Shiplayer/ExampleJsonData/db";

    public static void main(String[] args) throws IOException, ParseException {

        URL myUrl = ParserJson.createUrl(NEWS_URL);
        String parserReader = ParserJson.parsUrl(myUrl);
        ParserJson.parseObject(parserReader);

    }
}
