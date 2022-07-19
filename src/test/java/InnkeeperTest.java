import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InnkeeperTest {
    Innkeeper innkeeper;
    Player player;

    @BeforeEach
    void setUp() {
        innkeeper = new Innkeeper();
        player = new Player ("Rafael", "Paladino", 4);
    }

    @Test
    void shouldRegisterPlayer() {
        Action register = new RegisterAdventurer(player);
        innkeeper.excuteAction(register);

        assertEquals(true, player.isRegistered());
    }

    @Test
    void shouldUnregisterPlayer() {
        Action unregister = new UnregisterAdventurer(player);
        innkeeper.excuteAction(unregister);

        assertEquals(false, player.isRegistered());
    }

    @Test
    void shouldCancelUnregisterPlayer() {
        Action register = new RegisterAdventurer(player);
        Action unregister = new UnregisterAdventurer(player);

        innkeeper.excuteAction(register);
        innkeeper.excuteAction(unregister);

        innkeeper.cancelLastAction();

        assertEquals(true, player.isRegistered());
    }
}
