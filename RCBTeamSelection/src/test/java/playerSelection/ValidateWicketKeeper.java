package playerSelection;


import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class ValidateWicketKeeper {
	public void selectWicketkeeper() throws Exception  {
		JSONParser jsonparser = new JSONParser();
		
		FileReader reader = new FileReader("F:\\NewWorkspace\\wd\\JsonFile\\RCBPlayer.json");
		
		Object obj = jsonparser.parse(reader);
		
		JSONObject rcbjsonobj = (JSONObject)obj;
		
		JSONArray array = (JSONArray) rcbjsonobj.get("player");

		int count = 0;
		int foreigncount = 0;

		for (int i = 0; i < array.size(); i++)
		{
			JSONObject player = (JSONObject) array.get(i);

			String country = (String) player.get("country");

			if (country.equalsIgnoreCase("India"))
			{
				count++;
			} else
			{
				foreigncount++;
			}
		}
		System.out.println("Indian Players=> " + count);
		System.out.println("Foreign Players=> " + foreigncount);

		
		int expected = 4;

		if (expected == foreigncount)
		{
			System.out.println("In RCB there is : " + foreigncount + " foreign Players");
		}
	}


	

	public static void main(String[] args) throws Exception  {



		ValidateWicketKeeper selectkeeper=new ValidateWicketKeeper();
		
		selectkeeper.selectWicketkeeper() ;
	

	}

}
