package utils;

public class VehicleList {

	private int size;
	private Car[] list;

	public VehicleList(int maxSize) {
		this.size = 0;
		this.list = new Car [maxSize];
	}

	public int size(){
		return size;
	}
	public boolean isFull(){
		return size >= list.length;
	}

	public int getSize() {
		return size;
	}

	public Car[] getList() {
		return list;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setList(Car[] list) {
		this.list = list;
	}

	public void add(Car vehicle) {

		if (!isFull()){
			list[size] = vehicle;
			size++;
		}
	}

	public Car get(int index){
		return list[index];
	}
}
