package com.source.stomp.pathmatcher;


import com.source.stomp.dto.StompMessage;

public interface PathMatcher {

    boolean matches(String path, StompMessage msg);
}
