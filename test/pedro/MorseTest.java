package pedro;

import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MorseTest {

    @Before
    public void setUp() {

    }

    @Test
    public void testGetMensagem() {
        Morse pe = new Morse();
        pe.setMensagem("SOS");

        assertEquals("*** --- ***", pe.codifica());
        pe.setMensagem("sms");
        assertEquals("*** -- ***", pe.codifica());
        pe.setMensagem("123");
        assertEquals("*---- **--- ***--", pe.codifica());
        pe.setMensagem("456");
        assertEquals("****- ***** -****", pe.codifica());

    }

}
