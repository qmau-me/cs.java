
package selection;
import java.util.ArrayList;

public class Selection {

    public static void SelectionSort (ArrayList<Integer> array) {
        int switcher;
        
        for (int i = 0; i < array.size(); i++){
            int minimum = array.get(i);
            int minimum_position = i;
            
            for (int j = i; j < array.size(); j++){
                
                if (array.get(j) < minimum){
                    minimum_position = j;
                    minimum = array.get(j);
                }
            }
            
            switcher = array.get (minimum_position);
            array.set (minimum_position, array.get(i));
            array.set (i, switcher);
            
        }
    }
}
