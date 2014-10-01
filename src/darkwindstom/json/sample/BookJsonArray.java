package darkwindstom.json.sample;

public class BookJsonArray {
	
	public boolean bSuccess;
	public String sMessage;
	public Result[] oResult;
	
	
	public BookJsonArray(boolean bSuccess, String sMessage){
		this.bSuccess = bSuccess;
		this.sMessage = sMessage;
	}
	
	public BookJsonArray(boolean bSuccess, String sMessage, Result[] oResult){
		this.bSuccess = bSuccess;
		this.sMessage = sMessage;
		this.oResult = oResult;
	}
	
	public boolean isbSuccess() {
		return bSuccess;
	}

	public void setbSuccess(boolean bSuccess) {
		this.bSuccess = bSuccess;
	}

	public String getsMessage() {
		return sMessage;
	}

	public void setsMessage(String sMessage) {
		this.sMessage = sMessage;
	}

	public Result[] getoResult() {
		return oResult;
	}

	public void setoResult(Result[] oResult) {
		this.oResult = oResult;
	}
		
	public static class Result{
		public String Purchase_ID;
		public String Price;
		public String bookname;
		public String author;
				
		public String getPurchase_ID() {
			return Purchase_ID;
		}
		
		public void setPurchase_ID(String purchase_ID) {
			Purchase_ID = purchase_ID;
		}
		
		public String getPrice() {
			return Price;
		}
		
		public void setPrice(String price) {
			Price = price;
		}
		
		public String getBookname() {
			return bookname;
		}
		
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}
			
	}
	
}