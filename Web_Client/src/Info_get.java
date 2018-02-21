import java.io.*;
import java.net.*;
public class Info_get {
public static void main(String[] args){
	try{
		String url="http://anantbajpai.in/";
		URL obj=new URL(url);
		HttpURLConnection con=(HttpURLConnection)obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("Server", "/Edge/38.14393.1066.0");
		int responseCode=con.getResponseCode();
		String responseMessage=con.getResponseMessage();
		String requestMethod=con.getRequestMethod();
		System.out.println("Sending GET Request to URL:"+url);
		System.out.println("Response Code"+responseCode);
		System.out.println("Response Message"+responseMessage);
		System.out.println("Request method"+requestMethod);
		String header;
		for(int i=0;;i++){
			header=con.getHeaderField(i);
			if(header==null){
				break;
			}
			System.out.println(con.getHeaderFieldKey(i)+" and "+header);
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String l;
        while ((l=in.readLine())!=null) {
            System.out.println(l);
        }
	}catch(IOException e){
		e.printStackTrace();
	}
}
}
