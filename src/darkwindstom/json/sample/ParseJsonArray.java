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
		//System.out.println(gson.toJson(book).toString());
		
		
		
		


		ArrayList<Result> abc = new ArrayList<Result>();
		
		
		//for(int i=0; i<2; i++){

			Result tmp = new Result();
			tmp.setAuthor("abc");
			tmp.setBookname("sdfe");
			tmp.setPrice("123456");
			tmp.setPurchase_ID("1234567890");
			abc.add(tmp);
		
		//}
		
			//System.out.println(abc.size());
			
			
			Result oResult[] = (Result[]) abc.toArray();
			
			
			//System.out.println(oResult[0]);
			
			
			
		BookJsonArray book2 = new BookJsonArray(true, "sucess", (Result[])abc.toArray());
	
		
		//System.out.println(gson.toJson(book2).toString());
		
	
			ArrayList al = new ArrayList();
			al.add("a");
			al.add("b");
			al.add("c");

			//方法一(推薦)
			String a[] = (String[]) al.toArray(new String[0]);

			//方法二
			//String a[] = new String[al.size()];
			//a = al.toArray(a);

			//測試

			for (String s : a) {
				System.out.println(s);
			}
			
			
	
	}
	
	
	

}
