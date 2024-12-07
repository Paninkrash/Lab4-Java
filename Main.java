import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            URL u = new URL("https://javalab.free.beeceptor.com/first");
            System.out.println("The protocol is : " + u.getProtocol());
            System.out.println("The host is : " + u.getHost());
            System.out.println("The port is : " + u.getPort());
            System.out.println("The file is : " + u.getFile());
            System.out.println("The anchor is : " + u.getRef() + "\n");
        }
        catch (MalformedURLException e) {}


        try {
            URL url = new URL("https://javalab.free.beeceptor.com/first");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            Map<String, List<String>> headerFields = connection.getHeaderFields();
            System.out.println("Response headers:");
            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String key = entry.getKey();
                List<String> values = entry.getValue();
                System.out.println(key + ": " + values);
            }
            System.out.println();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONArray jsonArray = new JSONArray(response.toString());

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                System.out.println("id: " + jsonObject.getInt("id"));
                System.out.println("name: " + jsonObject.getString("name"));
                System.out.println("company: " + jsonObject.getString("company"));
                System.out.println("username: " + jsonObject.getString("username"));
                System.out.println("email: " + jsonObject.getString("email"));
                System.out.println("address: " + jsonObject.getString("address"));
                System.out.println("zip: " + jsonObject.getString("zip"));
                System.out.println("state: " + jsonObject.getString("state"));
                System.out.println("country: " + jsonObject.getString("country"));
                System.out.println("phone: " + jsonObject.getString("phone"));
                System.out.println("photo: " + jsonObject.getString("photo"));
                System.out.println(); // Пустая строка для разделения записей
        }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try{
            URL u = new URL("https://javalab.free.beeceptor.com/second");
            System.out.println("The protocol is : " + u.getProtocol());
            System.out.println("The host is : " + u.getHost());
            System.out.println("The port is : " + u.getPort());
            System.out.println("The file is : " + u.getFile());
            System.out.println("The anchor is : " + u.getRef() + "\n");
        }
        catch (MalformedURLException e) {}

        try {
            URL url = new URL("https://javalab.free.beeceptor.com/second");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            Map<String, List<String>> headerFields = connection.getHeaderFields();
            System.out.println("Response headers:");
            for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                String key = entry.getKey();
                List<String> values = entry.getValue();
                System.out.println(key + ": " + values);
            }
            System.out.println();

   
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONArray jsonArray = new JSONArray(response.toString());

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                System.out.println("id: " + jsonObject.getInt("id"));
                System.out.println("name: " + jsonObject.getString("name"));
                System.out.println("address: " + jsonObject.getString("address"));
                System.out.println("zip: " + jsonObject.getString("zip"));
                System.out.println("country: " + jsonObject.getString("country"));
                System.out.println("employeeCount: " + jsonObject.getInt("employeeCount"));
                System.out.println("industry: " + jsonObject.getString("industry"));
                System.out.println("marketCap: " + jsonObject.getInt("marketCap"));
                System.out.println("domain: " + jsonObject.getString("domain"));
                System.out.println("logo: " + jsonObject.getString("logo"));
                System.out.println("ceoName: " + jsonObject.getString("ceoName"));
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
