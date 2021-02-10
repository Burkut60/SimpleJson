import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Menu {

    public static void menu() throws ParseException, IOException {

        System.out.println("Выберите интересующую вас информацию: \n A - JsonData \n B - advertisment \n" +
                "C - news \n Для выхода  D ");
        Scanner sc = new Scanner(System.in);
        String enumeration = sc.nextLine();

        switch (enumeration) {

            case "A": {
                String dbUrl = "https://my-json-server.typicode.com/Shiplayer/ExampleJsonData/db";

                URL myUrl = ParserJson.createUrl(dbUrl);
                String parserReader = ParserJson.parsUrl(myUrl);
                ParserJson.parseObject(parserReader);
                Menu.menu();
                break;

            }
            case "B": {
                String advertUrl =
                        "https://my-json-server.typicode.com/Shiplayer/ExampleJsonData/advertisment";
                URL myUrl = ParserJson.createUrl(advertUrl);
                String parserReader = ParserJson.parsUrl(myUrl);
                ParserJson.parserArray(parserReader);
                Menu.menu();
                break;

            }
            case "C": {
                String newsUrl = "https://my-json-server.typicode.com/Shiplayer/ExampleJsonData/news";
                URL myUrl = ParserJson.createUrl(newsUrl);
                String parserReader = ParserJson.parsUrl(myUrl);
                ParserJson.parserArray(parserReader);
                Menu.menu();
                break;
            }

            case "D": {
                System.exit(0);
                break;
            }
        }
    }
}
