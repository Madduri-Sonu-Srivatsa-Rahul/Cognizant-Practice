package MockitoExcercises;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTestV2{

    @Test
    public void testVerifyInteraction(){

        //mock object
        ExternalAPI mockApi = Mockito.mock(ExternalAPI.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        //interaction
        verify(mockApi).getData();
    }
}