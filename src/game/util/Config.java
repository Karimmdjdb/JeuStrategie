package game.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Config {
    private static Map<String, String> configs;
    static {
        configs = new HashMap<>();
        try {
            File gameconf = new File("gameconf.txt");
            Scanner scanner = new Scanner(gameconf);
            while(scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split("=");
                String param = data[0].trim(), value = data[1].trim();
                configs.put(param, value);
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.err.println("error");
            e.printStackTrace();
        }
    }

    public static Map<String, String> getConfig() {
        return configs;
    }

    public static String get(String param) {
        return configs.get(param);
    }
}
