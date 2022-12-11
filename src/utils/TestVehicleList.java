package utils;
import parser.XmlJsonParser;
import parser.ParserException;
import java.io.File;

public class TestVehicleList {
	public static void main(String[] args) throws ParserException {

		VehicleList list1 = new VehicleList(2);
		list1.add(new Car("BMW","7",true, new Engine("Eng1",300, 2000, true)));
		list1.add(new Car("Mazda","3",false, new Engine("Eng32",100, 300, true)));

		System.out.println("list1: ");
		for (int i = 0; i < list1.size(); i++){
			System.out.println(list1.get(i));
		}

		XmlJsonParser parser = new XmlJsonParser();
		File file1 = parser.toJson(list1, "Vehicle.json");
		System.out.println("JSON file: " + file1.getAbsolutePath());

		VehicleList list2 = parser.fromJson("Vehicle.json", VehicleList.class );

		System.out.println("list2: ");
		for (int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}

		File file2 = parser.toXml(list1,"Vehicle.xml");
		System.out.println("XML file: " + file2.getAbsolutePath());

		VehicleList list3 = parser.fromXml("Vehicle.xml", VehicleList.class);
		System.out.println("list3: ");
		for (int i = 0; i < list3.size(); i++){
			System.out.println(list3.get(i));
		}
	}
}
