import java.util.HashMap;
import java.util.Set;
public class HashMapTracks{
    public static void main(String[] args) {
        HashMap<String, String> trackMap = new HashMap<String, String>();
        trackMap.put("Killer Queen", "She's a killer");
        trackMap.put("Volcano", "I don't know where I'm a gonna go...");
        trackMap.put("Crimson and Clover", "Crimson and Clover over and over...");
        trackMap.put("Chromadome", "Sunny days oh yeah...");
        trackMap.remove("Chromadome");
        Set<String> keys = trackMap.keySet();
        for(String key : keys){
            System.out.println(key+": "+trackMap.get(key));
        }
    }

}