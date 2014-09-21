package darkwindstom.json.sample;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * 
 * Json formate use JsonObject and JsonArray
 * 
 * @author darkwinds
 *
 */
public class CreateJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Create Json formate		
		JsonObject jo = new JsonObject();		
		jo.addProperty("status", "true");
		jo.addProperty("date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		
		JsonArray subjectja = new JsonArray();
		
		JsonObject array1 = new JsonObject();
		array1.addProperty("bookname", "name1");
		array1.addProperty("author", "author1");	
		
		JsonObject array2 = new JsonObject();
		array2.addProperty("bookname", "name1");
		array2.addProperty("author", "author1");
				
		subjectja.add(array1);
		subjectja.add(array2);
								
		jo.add("data", subjectja);
				
		//print Json String
		System.out.println(jo.toString());
		
	}

}
