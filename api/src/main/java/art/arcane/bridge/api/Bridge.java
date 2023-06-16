package art.arcane.bridge.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Bridge {
    public static String readResource(String jarResourcePath) {
        try (InputStream in = Bridge.class.getResourceAsStream("/" + jarResourcePath);
             BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            String l;
            StringBuilder content = new StringBuilder();

            while ((l = reader.readLine()) != null) {
                {
                    content.append(l);
                }
            }

            return content.toString();
        }
        catch (IOException e) {
            // Handle exception
        }

        return null;
    }
}
