/*
Problem Statement:Create a HashMap with the following key-valuepairs:
EclipseFree Open Source IDE
Ruby MineEnterprise IDE, It's expensive
Visual StudioEnterprise IDE, It's expensive
IntelliJFree Open Source IDE

Write a java program to perform the following tasks:
▪Print the value associated withthe ‘Eclipse’key.
▪Update the value of the ‘Eclipse’keyto ‘It is best!’ and print the new value.
▪Remove the ‘Eclipse’keyand its value from the Mapand print the value associated with the ‘Eclipse’key.
▪Print the total number of items in the Map.
▪Iterate through all the items of the Map and print each key-value pair present in the Map through an Iterator.
▪Iterate through all the items ofthe Map and print each key-value pair present in the map using the for loop.
▪Clear the contents of the Map.
▪Print the contents of the Map after clearing the contents.
*/

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	   // System.out.println("Have dinner at home.");
	   Map<String, String> IDEs = new HashMap<String, String>();
	   IDEs.put("Eclipse","Free Open Source IDE");
	   IDEs.put("Ruby Mine","MineEnterprise IDE, It's expensive");
	   IDEs.put("Visual Studio",IDEs.values().toArray()[0].toString());
	   IDEs.put("IntelliJ",IDEs.values().toArray()[1].toString());
	   //System.out.println(IDEs.values().toArray()[1]);
	   
	   //Print the value associated with the ‘Eclipse’key
	   System.out.println("value of 'Eclipse' key: "+IDEs.get("Eclipse"));
	   
	   //Update the value of the ‘Eclipse’keyto ‘It is best!’ and print the new value.
	   IDEs.put("Eclipse","It is best!");
	   System.out.println("value of 'Eclipse' key: "+IDEs.get("Eclipse"));
	   
	   //Remove the ‘Eclipse’key and its value from the Map and 
	   //print the value associated with the ‘Eclipse’key
	   System.out.println("Value assoicated with 'Eclipse' key after removing key: "+IDEs.remove("Eclipse"));
	   
	   //Print the total number of items in the Map
	   System.out.println("Total number of item in the Map: "+IDEs.size());
	   
	   //Iterate through all the items of the Map and print each key-value pair 
	   //present in the Map through an Iterator.
	   Iterator mapIterator = IDEs.entrySet().iterator();
	   
	   while(mapIterator.hasNext()){
	       Map.Entry mapElement = (Map.Entry)mapIterator.next();
	       System.out.println("key: "+mapElement.getKey() +" - value: "+mapElement.getValue());
	   }
	   
	   //Using foreach loop to iterate hash map
	   IDEs.forEach((key,value) -> System.out.println(key +" : "+value));
	   
	   //Clear the contents of the Map
	   IDEs.clear();
	   
	   //Print the contents of the Map after clearing the contents
	   System.out.println("Finally the map after clearing: " + IDEs);
	   
	}
}
