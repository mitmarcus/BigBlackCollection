package utils;

import java.util.Objects;

public class Car {
	private String make, model;
	private boolean manualGear;
	private Engine engine;

	public Car(String make, String model, boolean manualGear, Engine engine) {
		this.make = make;
		this.model = model;
		this.manualGear = manualGear;
		this.engine = engine;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean hasManualGear() {
		return manualGear;
	}

	public void setManualGear(boolean manualGear) {
		this.manualGear = manualGear;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car{" +
				"make='" + make + '\'' +
				", model='" + model + '\'' +
				", manualGear=" + manualGear +
				", engine=" + engine +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return manualGear == car.manualGear && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
	}
}
