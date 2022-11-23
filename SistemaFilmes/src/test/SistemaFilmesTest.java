import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


public class SistemaFilmesTest {

    @Test
    void testCadastrarFilmes() {
        SistemaFilmesMap sistema = SistemaFilmesMap();

        sistema.cadastraFilme("001", "Tony Stark rainha, o resto nadinha", 2022, "180");
    }

}
