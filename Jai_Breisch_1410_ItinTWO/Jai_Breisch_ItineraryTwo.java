/* Jai Breisch 1410 Itinerary: JB1410W2V12.1
 Program Description:
 -This program will ask the user for a series of destinations until
 they enter the word "done."
 -It will then print those destinations as a linked itinerary into
 console with the word "to" between each destination.
 -The scanner string builder and array classes will be implemented as well as loops and JAR files
 */

package jai_Breisch_Itinerary2;

import java.util.*;

public class Jai_Breisch_ItineraryTwo {
	
	public static void main(String[] args) {	

Scanner input = new Scanner(System.in);
ArrayList<String> userDestinations = new ArrayList<String>();


StringBuilder sb = new StringBuilder("");
//String separator = " to ";



System.out.println("Please type a list of destinations, Press Enter between each. ");
		 System.out.println(" When you are Finished type 'done' to see your itinerary");
System.out.println(" Destination: ");


String userInput = input.nextLine();

userDestinations.add(userInput);


while(!userInput.equalsIgnoreCase("done"))
{
	System.out.print("Destination: ");
	userInput = input.nextLine();
	userDestinations.add(userInput);
}
System.out.print("ITINERARY: ");


if(userInput.equalsIgnoreCase("done"))
{
	userDestinations.remove(userInput);
	//sb.append(" ");
}
input.close();

for(String destinations: userDestinations) 
{
	/*String result = "";
	result += destinations + separator;
	String result = "";
	result +- destinations + separator;}

		
String result: "";\
*/
	System.out.print( " to " + destinations.toUpperCase() + sb  /* (removeExtraSeparator(result )*/);
}
	
	}
	
	//An attempt to get rid of extra characters at the beginning or end of a list. Side note: 
	//PLEASE GIVE US ALL THE INGREDIENTS IT DOESNT MAKE THE ASSIGNMENTS EASY, IT MAKES THEM POSSSIBLE IN UNDER 15 HOURS EACH!!!!!
	/*public static String removeExtraSeparator(String str) {
		
		return new StringBuilder(str)
						.deleteCharAt(str.length() - 1)
						.toString();
	*/
	}


// I COULD NOT FIX THE Itin:*to* Location to Location or Itin: location to location *to* issue.....
// I went to geeks for geeks, stack overflow, github, w3, chegg, you tell me where I should know that from and where it is in the material or online
