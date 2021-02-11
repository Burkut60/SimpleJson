import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Menu {

    public static void menu() throws ParseException, IOException {
        ParserJson parserJson = new ParserJson();

        System.out.println("Выберите интересующую вас информацию: \n A - JsonData \n B - advertisment \n" +
                "C - news \n Для выхода  D ");
        Scanner sc = new Scanner(System.in);
        String enumeration = sc.nextLine();

        switch (enumeration) {

            case "A": {
                String dbUrl = "https://my-json-server.typicode.com/Shiplayer/ExampleJsonData/db";

                URL myUrl = parserJson.createUrl(dbUrl);
                String parserReader = parserJson.parsUrl(myUrl);
                parserJson.parseObject(parserReader);
                Menu.menu();
                break;

            }
            case "B": {
                String advertUrl =
                        "https://my-json-server.typicode.com/Shiplayer/ExampleJsonData/advertisment";
                URL myUrl = parserJson.createUrl(advertUrl);
                String parserReader = parserJson.parsUrl(myUrl);
                parserJson.parserArray(parserReader);
                Menu.menu();
                break;

            }
            case "C": {
                String newsUrl = "https://my-json-server.typicode.com/Shiplayer/ExampleJsonData/news";
                URL myUrl = parserJson.createUrl(newsUrl);
                String parserReader = parserJson.parsUrl(myUrl);
                parserJson.parserArray(parserReader);
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
