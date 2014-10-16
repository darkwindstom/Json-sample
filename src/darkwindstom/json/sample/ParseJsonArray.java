package darkwindstom.json.sample;

import java.util.ArrayList;
import com.google.gson.Gson;
import darkwindstom.json.sample.BookJsonArray.Result;

public class ParseJsonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//new Gson Object
		Gson gson = new Gson();
	
		//new BookJsonArray Object
		BookJsonArray book = new BookJsonArray(true, "sucess");

		//print Json formate data
		System.out.println(gson.toJson(book).toString());

		
		//add array
		ArrayList<Result> abc = new ArrayList<Result>();

		Result tmp1 = new Result("a", "b", "c", "d");			
		abc.add(tmp1);
			
		Result tmp2 = new Result("e", "f", "g", "h");
		abc.add(tmp2);

		BookJsonArray book2 = new BookJsonArray(true, "sucess", (Result[])abc.toArray(new Result[abc.size()]));

		System.out.println(gson.toJson(book2).toString());

			
	}

}
