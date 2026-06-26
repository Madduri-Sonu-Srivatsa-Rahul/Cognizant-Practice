package MockitoExcercises;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest{

    @Test
    public void testExternalAPI(){

        //mock object
        ExternalAPI mockApi = Mockito.mock(ExternalAPI.class);

        //Stub
        when(mockApi.getData()).thenReturn("Mock Data");
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        //result
        assertEquals("Mock Data", result);
    }
}