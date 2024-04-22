package Example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class New_JSON {
    public New_JSON() {
    }

    public static void main(String[] args) {
        JSONObject object = new JSONObject();
        object.put("name", "mkyong.com");
        object.put("age", 100);
        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");
        object.put("messages", list);

        try {
            FileWriter file = new FileWriter("c:\\Users\\User\\Desktop\\test.json");
            file.write(object.toJSONString());
            file.flush();
            file.close();
        } catch (IOException var11) {
            var11.printStackTrace();
        }

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("c:\\Users\\User\\Desktop\\test.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String name = (String)jsonObject.get("name");
            System.out.println(name);
            long age = (Long)jsonObject.get("age");
            System.out.println(age);
            JSONArray msg = (JSONArray)jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();

            while(iterator.hasNext()) {
                System.out.println((String)iterator.next());
            }
        } catch (FileNotFoundException var12) {
            var12.printStackTrace();
        } catch (IOException var13) {
            var13.printStackTrace();
        } catch (ParseException var14) {
            var14.printStackTrace();
        }

    }
}

