package obiektowe.proste.postoffice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostofficeTest {

    @Test
    @DisplayName("SendParcel should return exchange if enough cash")
    public void sendParcelTest1() {
        //given
        Package parcel = new Package("a","b",500);
        Postoffice postoffice = new Postoffice();
        double tooMuchCash = 6;

        //when
       double exchange= postoffice.orderParcel(parcel, tooMuchCash);

        //than
        assertEquals(1,exchange);
    }

}