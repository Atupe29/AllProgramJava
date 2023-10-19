import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class CollectionsExample {
 
    public static void main(String[] args) {
         
        List<Double> temperatureList = new ArrayList<Double>();
         
        temperatureList.add(32.52);
        temperatureList.add(35.56);
        temperatureList.add(30.84);
        temperatureList.add(38.55);
        temperatureList.add(40.00);
  
        System.out.println(temperatureList);
         
        Collections.sort(temperatureList);
        System.out.println("sorted List: "+temperatureList);
        
        int searchIndex = Collections.binarySearch(temperatureList, 37.8);
        if(searchIndex >=0){
            System.out.println("Temperature found.");
        }
        else{
            System.out.println("Temperature not found.");
        }
         

        Collections.shuffle(temperatureList);
        System.out.println("Shuffled List: "+temperatureList);
         
        Collections.fill(temperatureList, 0.0);
        System.out.println("Filled List: "+temperatureList);
             
    }
}