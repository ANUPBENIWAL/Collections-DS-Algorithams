package Collections.HashMap;

import java.util.HashMap;

public class Hash {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    capitalCities.remove("England");
    System.out.println(capitalCities.size());
    System.out.println(capitalCities);
    capitalCities.clear();
    System.out.println(capitalCities);
  }
}
