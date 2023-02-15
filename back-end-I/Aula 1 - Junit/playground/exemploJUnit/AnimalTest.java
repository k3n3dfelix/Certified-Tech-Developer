package exemplo.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void SeOAnimalEPesado(){
        Animal cavalo = new Animal("Cavalo", "Grande", 750);
        Animal cachorro = new Animal("Cachorro", "Pequeno", 8);

        boolean ePesado = cachorro.EPesado()    ;

        assertEquals(true, cavalo.EPesado());
        assertFalse(ePesado);
    }
}