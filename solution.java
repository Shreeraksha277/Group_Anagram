import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Create a HashMap
        // Key = sorted string (like "aet")
        // Value = list of original words (like ["eat", "tea"])
        HashMap<String, List<String>> map = new HashMap<>();
        
        // Loop through each word in input array
        for(String word : strs) {
            
            // Convert the word into character array
            // Example: "eat" → ['e','a','t']
            char[] ch = word.toCharArray();
            
            // Sort the characters
            // Example: ['e','a','t'] → ['a','e','t']
            Arrays.sort(ch);
            
            // Convert sorted char array back to string
            // Example: ['a','e','t'] → "aet"
            String sorted = new String(ch);
            
            // Check if this sorted key already exists in map
            if(!map.containsKey(sorted)) {
                
                // If not present, create a new empty list
                map.put(sorted, new ArrayList<>());
            }
            
            // Add the original word into the list
            // Example: map.get("aet").add("eat")
            map.get(sorted).add(word);
        }
        
        // Convert all map values into a list and return
        // map.values() gives collection of lists
        return new ArrayList<>(map.values());
    }
}
