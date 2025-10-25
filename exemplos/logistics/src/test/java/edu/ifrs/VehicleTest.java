package edu.ifrs;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import edu.ifrs.business.Vehicle;
import edu.ifrs.business.WeightService;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@ExtendWith(MockitoExtension.class)
public class VehicleTest {

    @Mock
    Vehicle v = new Vehicle(100, new WeightService());

    @Test
    void testeIsWeightAllowed() {
        when(ws.isWeightAllowed(100, 200)).thenReturn(true);

    }
}
