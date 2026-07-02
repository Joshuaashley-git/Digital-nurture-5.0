package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyServices service = new MyServices(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }

    @Test
    public void testVerifyInteraction() {
        // 1. Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // (no stubbing this time — we don't care what it returns,
        // we only care THAT it was called)
        MyServices service = new MyServices(mockApi);

        // 2. Call the method
        service.fetchData();

        // 3. Verify the interaction happened
        verify(mockApi).getData();
    }
    @Test
    public void testVerifyInteractionWithSpecificArgument() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyServices service = new MyServices(mockApi);

        service.fetchDataById("user123");

        // Verify getDataById was called with EXACTLY this argument
        verify(mockApi).getDataById("user123");
    }
}