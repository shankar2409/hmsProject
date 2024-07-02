package assignment;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class sample {
    public static void main(String[] args) throws JsonMappingException, JsonProcessingException 
    {
        // Creating Object1
        
        String jOb1 = "{\r\n" +
            "  \"first_Name\": \"Harshit\",\r\n" +
            "  \"last_Name\": \"Tripathi\",\r\n" +
            "  \"address\": {\r\n" +
            "  \"city\": \"Delhi\",\r\n" +
            "  \"state\": \"India\"\r\n" +
            "  }\r\n" +
            "}";

        // Creating Object2

        String jOb2 = "{\r\n" +
            "  \"first_Name\": \"Harsht\",\r\n" +
            "  \"last_Name\": \"Tripathi\",\r\n" +
            "  \"address\": {\r\n" +
            "  \"city\": \"Delhi\",\r\n" +
            "  \"state\": \"India\"\r\n" +
            "  }\r\n" +
            "}";

        // Creating an object of ObjectMapper to read the objects in Json

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode1 = objectMapper.readTree(jOb1);
        JsonNode jsonNode2 = objectMapper.readTree(jOb2);

        // Compare two json using Jackson and displaying the result
        System.out.println(jsonNode1.equals(jsonNode2));
    }
}

