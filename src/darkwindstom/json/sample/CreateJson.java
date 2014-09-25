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
		
		JsonObject jajo = null;
		
		for(int i = 1; i<5; i++){
			jajo = new JsonObject();
			jajo.addProperty("bookname", "name"+i);
			jajo.addProperty("author", "author"+i);			
			subjectja.add(jajo);			
		}
								
		jo.add("data", subjectja);
				
		//print Json String
		System.out.println(jo.toString());
		
		
		/*
		{
			"status":"true",
			"date":"2014-09-25",
			"data":[
				{"bookname":"name1","author":"author1"},
				{"bookname":"name1","author":"author2"},
				{"bookname":"name1","author":"author3"},
				{"bookname":"name1","author":"author4"}
			]
		}
		*/
		
		
	}

}
