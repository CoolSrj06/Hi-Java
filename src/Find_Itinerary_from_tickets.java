import java.util.HashMap;
import java.util.Set;

public class Find_Itinerary_from_tickets {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("chennai","bengaluru");
        hm.put("goa","chennai");
        hm.put("mumbai","delhi");
        hm.put("delhi","goa");
        itinerary(hm);
    }
    public static void itinerary(HashMap<String,String> hm){
        String start="";
        for (String val:hm.keySet()){
            if (!hm.containsValue(val))
                start=val;
        }
        String end=start;
        while (hm.containsKey(end)){
            end=hm.get(end);
        }
        System.out.println("Start: "+start);
        System.out.println("End: "+end);
    }
}
