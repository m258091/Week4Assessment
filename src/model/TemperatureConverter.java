package model;

public class TemperatureConverter {

	private int temperature;
	private String temperatureType;
	private int convertedTemperature;
	private String convertedTemperatureType;
	private static final String FAHRENHEIT = "Fahrenheit";
	private static final String CELSIUS = "Celsius";
	
	public TemperatureConverter() {
		super();
	}
	
	public TemperatureConverter(int temp, String tempType) {
		super();
		temperature = temp;
		temperatureType = tempType;
		convertTemperature(temperature, temperatureType);
	}
	
	public TemperatureConverter(String tempType) {
		super();
		temperatureType = tempType;
		convertTemperature(temperature, temperatureType);
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public String getTemperatureType() {
		return temperatureType;
	}

	public void setTemperatureType(String temperatureType) {
		this.temperatureType = temperatureType;
	}

	public int getConvertedTemperature() {
		return convertedTemperature;
	}

	public void setConvertedTemperature(int convertedTemperature) {
		this.convertedTemperature = convertedTemperature;
	}

	public String getConvertedTemperatureType() {
		return convertedTemperatureType;
	}

	public void setConvertedTemperatureType(String convertedTemperatureType) {
		this.convertedTemperatureType = convertedTemperatureType;
	}

	public void convertTemperature(int temperature, String temperatureType) {
		double convertTemp = 0;
		String convertTempType = null;
		
		// convert temperature from Fahrenheit to Celsius
		if (temperatureType.equalsIgnoreCase(FAHRENHEIT)) {
			convertTemp = (temperature - 32) * 5 / 9;
			convertTempType = CELSIUS;
		// convert temperature from Celsius to Fahrenheit
		} else {
			convertTemp = (temperature * 9 / 5) + 32;
			convertTempType = FAHRENHEIT;
		}		
		setConvertedTemperature((int) convertTemp);	
		setConvertedTemperatureType(convertTempType);
	}

	@Override
	public String toString() {
		return "TemperatureConverter [temperature=" + temperature + ", temperatureType=" + temperatureType
				+ ", convertedTemperature=" + convertedTemperature + ", convertedTemperatureType="
				+ convertedTemperatureType + "]";
	}

}
