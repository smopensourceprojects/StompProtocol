# Android Stomp Protocol
This is Android Websocket Connection library over Stomp Protocol

## Overview

This library provide support for STOMP protocol https://stomp.github.io/
At now library works only as client for backend with support STOMP, such as
NodeJS (stompjs or other) or Spring Boot (SockJS).

Add library as AAR dependency. Create the AAR file from console by using command __./gradlew assembleRelease__

__This project is copied from https://github.com/NaikSoftware/StompProtocolAndroid.__
__If you encounter bugs with it or need enhancements, you can fork it and modify it as the project is under the Apache License 2.0.__
__This is created for Open Source to use any applications/projects. Few codes changed based on my requirement.__

**Check out the changes from changed NaikSoftware StompProtocolAndroid Library**

``` 
1. Upgraded to Java-WebSocket:1.5.1
2. rxandroid:2.1.1
3. okhttp:4.7.2
4. Supported Android 11+
5. Handled StompHeader NullPointer Exception in StompMessage class.
6. Added reader.hasNext() before calling reader.skip() 

```

**Subscribe lifecycle connection**
``` java
mStompClient.lifecycle().subscribe(lifecycleEvent -> {
    switch (lifecycleEvent.getType()) {
    
        case OPENED:
            Log.d(TAG, "Stomp connection opened");
            break;
            
        case ERROR:
            Log.e(TAG, "Error", lifecycleEvent.getException());
            break;
            
        case CLOSED:
             Log.d(TAG, "Stomp connection closed");
             break;
    }
});
```
