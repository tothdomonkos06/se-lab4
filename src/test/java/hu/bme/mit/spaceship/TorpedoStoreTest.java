package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void empty_mag(){
        TorpedoStore store = new TorpedoStore(1,1);

        //csin

        boolean result = store.fire(1);
        int toltet = store.getTorpedoCount();

        //ell

        assertEquals(false, result);
        assertEquals(1, toltet);
    }


}
