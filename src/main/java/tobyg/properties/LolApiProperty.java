package tobyg.properties;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class LolApiProperty {

    private static Properties lolApiProperties;

    private LolApiProperty() {
    }

    public static String getPropertyValue(Key key){
        if(lolApiProperties == null){
            loadLolApiProperties();
        }
        return lolApiProperties.getProperty(key.getKey());
    }

    private static void loadLolApiProperties(){
        try {
            try (Reader reader = new FileReader("src/main/resources/lolApi.properties")) {
                lolApiProperties = new Properties();
                lolApiProperties.load(reader);
            }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public enum Key {
        DEVELOPMENT_API_KEY("developmentApiKey"),
        TIMEOUT("timeout");

        private String key;

        Key(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }
    }

}
