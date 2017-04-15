<%
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.lang.Math.*;
import java.io.*;
import java.lang.*;
import java.net.HttpURLConnection;
import java.net.URI;
import org.json.simple.JSONObject.*;
import org.json.simple.JSONArray.*;
import org.json.simple.parser.ParseException.*;
import org.json.simple.parser.JSONParser;
import java.util.Map.*;
import java.util.List.*;

public class distance{

     public static void main(String []args) throws Exception{
        
String org="afzalgunj|tarnaka|uppal|jbs|koti";
String dest="afzalgunj|tarnaka|uppal|jbs|koti";
URL url = new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins="+org+"&destinations="+dest);
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setRequestMethod("GET");

String line, outputString = "";
BufferedReader reader = new BufferedReader(
new InputStreamReader(conn.
getInputStream()));
while ((line = reader.readLine()) != null) {
     outputString += line;
}
Object obj = parser.parse(new FileReader( outputString));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String name = (String) jsonObject.get("distance");
            String author = (String) jsonObject.get("duration");
/*String data=outputString ; // JOSN String
JSONObject data = new JSONObject(data);
JSONArray array = data.getJSONArray("elements");
for(int i=0; i<array.length; i++){
        JSONObject obj = array.getJSONObject(i);
        String name = obj.getString("distance");
        String uid  = obj.getString("duration");

//String p[]=outputString.split(":");*/
System.out.println(author+"="+name);
     }
}
%>