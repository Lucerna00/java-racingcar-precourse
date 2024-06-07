import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import model.Cars;

public class CarsTest {

    @DisplayName("자동차 전진")
    @Test
    public void carsTest1() {
        // given
        Cars cars = new Cars();
        cars.setCars(new String[]{"pobi", "woni", "jun"});

        // when
        cars.addDistance("pobi");
        cars.addDistance("pobi");
        cars.addDistance("woni");
        cars.addDistance("woni");
        cars.addDistance("woni");
        cars.addDistance("jun");

        // then
        assertThat(cars.getCars().get("pobi")).isEqualTo("--");
        assertThat(cars.getCars().get("woni")).isEqualTo("---");
        assertThat(cars.getCars().get("jun")).isEqualTo("-");
    }
}
