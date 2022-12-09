//package utils;
//import parser.XmlJsonParser;
//import parser.ParserException;
//import model.Event;
//
//import java.io.File;
//import java.util.ArrayList;
//
//public class ListOfReservationsToXMLtest {
//	public static void main(String[] args) throws ParserException {
//
//		ArrayList<Event> events = new ArrayList<>();
//		ArrayList<Event> events2 = new ArrayList<>();
//
//		events.add(new Event("Test title", "Horsens", "Test description lorem ipsum dolor sit amet",5, 6));
//
//		System.out.println("eventList: ");
//		for (int i = 0; i < events.size(); i++){
//			System.out.println(events.get(i));
//		}
//
//		XmlJsonParser parser = new XmlJsonParser();
//		File file1 = parser.toJson(events, "ListOfEvents.json");
//		System.out.println("JSON file: " + file1.getAbsolutePath());
//
//		events2 = parser.fromJson("ListOfEvents.json", Event.class);
//
//	}
//}
