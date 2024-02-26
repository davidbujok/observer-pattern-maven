package com.mycompany.observer;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

// import com.mycompany.observer.CurrentConditionDispaly;
// import com.mycompany.observer.WeatherData;
// import com.mycompany.observer.WeatherStation;

public class WeatherDataTest {
  WeatherStation weatherStation;
  WeatherData weatherData;
  CurrentConditionDispaly currentConditionDispaly;

  @Before
  public void before() {
    weatherStation = new WeatherStation();
    weatherData = new WeatherData();
    // currentConditionDispaly = new CurrentConditionDispaly(weatherData);
  }

  @Test
  public void canDisplayData() {
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    assertEquals(weatherData.getTemp(), 82.00, 0.1);
  }

@Test
public void testGetTemp() {
    
}

@Test
public void testMeasurementsChanged() {
    
}
}
