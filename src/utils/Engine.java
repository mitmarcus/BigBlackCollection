package utils;

import java.util.Objects;

public class Engine {
	private String type;
	private int horsePower, volume;
	private boolean isDiesel;

	public Engine(String type, int horsePower, int volume, boolean isDiesel) {
		if (type == null){
			throw new IllegalArgumentException("Engine type cannot be null");
		}
		this.type = type;
		this.horsePower = horsePower;
		this.volume = volume;
		this.isDiesel = isDiesel;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isDiesel() {
		return isDiesel;
	}

	public void setDiesel(boolean diesel) {
		isDiesel = diesel;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Engine engine = (Engine) o;
		return horsePower == engine.horsePower && volume == engine.volume && isDiesel == engine.isDiesel && Objects.equals(type, engine.type);
	}

	@Override
	public String toString() {
		return "Engine{" +
				"type='" + type + '\'' +
				", horsePower=" + horsePower +
				", volume=" + volume +
				", isDiesel=" + isDiesel +
				'}';
	}
}
