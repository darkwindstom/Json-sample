package darkwindstom.json.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * 
 * Parse Jason formate sample
 * 
 * @author darkwinds
 *
 */
public class ParseJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gson gson = new Gson();		
		
		//Create Json formate		
		JsonObject jo = new JsonObject();		
		jo.addProperty("status", "true");
		jo.addProperty("date", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		
		JsonObject subjectjo = new JsonObject();
		subjectjo.addProperty("bookname", "Harry Potter");
		subjectjo.addProperty("author", "J. K. Rowling");
					
		jo.add("data", subjectjo);
				
		//print Json String
		System.out.println(jo.toString());
		
		//Parse Json formate use BookJson object by fromJson function
		BookJson book = (BookJson)gson.fromJson(jo.toString(), BookJson.class);
		
		//get status element value
		System.out.println(book.status);
		
		//get subjectjo' bookname element value
		System.out.println(book.data.bookname);
						
		
	}

}
