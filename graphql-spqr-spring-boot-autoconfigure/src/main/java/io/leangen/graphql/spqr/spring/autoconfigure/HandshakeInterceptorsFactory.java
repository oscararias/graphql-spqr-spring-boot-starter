package io.leangen.graphql.spqr.spring.autoconfigure;

import org.springframework.web.socket.server.HandshakeInterceptor;

public interface HandshakeInterceptorsFactory {

    HandshakeInterceptor[] getInterceptors();
}
