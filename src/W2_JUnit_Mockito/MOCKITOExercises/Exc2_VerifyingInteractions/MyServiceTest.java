package W2_JUnit_Mockito.MOCKITOExercises.Exc2_VerifyingInteractions;

import org.testng.annotations.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    public void testVerifyInteraction() {
        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        // Act
        service.fetchData();
        // Assert (Verify that getData() was called)
        verify(mockApi).getData();
        System.out.println("Test Passed: mockApi.getData() was called.");
    }
}
