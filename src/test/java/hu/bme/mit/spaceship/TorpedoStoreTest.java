package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void torpedoFailure(){
        TorpedoStore store = new TorpedoStore(1,1);

        //csin

        boolean result = store.fire(1);
        int toltet = store.getTorpedoCount();

        //ell

        assertEquals(false, result);
        assertEquals(1, toltet);
    }


@Test
void kivetelNullaTorpedo() {
    TorpedoStore tar = new TorpedoStore(1, 0);

    assertThrows(IllegalArgumentException.class, () -> tar.fire(0));
}

@Test
void kivetelNegativTorpedo() {
    TorpedoStore tar = new TorpedoStore(1, 0);

    assertThrows(IllegalArgumentException.class, () -> tar.fire(-1));
}


@Test
void kivetelTulNagyTorpedo() {
    TorpedoStore tar = new TorpedoStore(1, 0);

    assertThrows(IllegalArgumentException.class, () -> tar.fire(2));
}

}
