package playerSelection;


import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import junit.framework.Assert;
@SuppressWarnings("deprecation")
public class ValidateForeingnPlayer {

	
	public void selectWicketKeeper() throws Throwable  {
		
		JSONParser parser = new JSONParser();

		FileReader reader = new FileReader("F:\\NewWorkspace\\wd\\JsonFile\\RCBPlayer.json");

		Object obj = parser.parse(reader);

		JSONObject rcbjsonobj = (JSONObject) obj;

		JSONArray array = (JSONArray) rcbjsonobj.get("player");

		int WicketKeeper = 0;

		for (int i = 0; i < array.size(); i++)
		{
			JSONObject player = (JSONObject) array.get(i);

			String role = (String) player.get("role");

			if (role.equalsIgnoreCase("Wicket-keeper"))
			{
				WicketKeeper++;

			}
		}
		System.out.println("There is " + WicketKeeper + " WicketKeeper.");
		int expected = 1;
		Assert.assertEquals(expected, WicketKeeper);
		
	}


	
	public static void main(String[] args) throws Throwable  {
		ValidateForeingnPlayer select=new ValidateForeingnPlayer();
		select.selectWicketKeeper();

	}

}
