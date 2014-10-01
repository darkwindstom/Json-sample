package darkwindstom.json.sample;

import com.google.gson.Gson;

public class ParseJsonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//new Gson Object
		Gson gson = new Gson();
	
		//new BookJsonArray Object
		BookJsonArray book = new BookJsonArray(true, "sucess");
			
		//print Json formate data
		System.out.println(gson.toJson(book).toString());
	
	}

}
