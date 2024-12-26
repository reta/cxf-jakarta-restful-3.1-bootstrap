package com.example.jakarta.restful.bootstrap;

import java.util.Set;
import java.util.concurrent.CompletionStage;

import com.example.jakarta.restful.bootstrap.rs.PeopleRestService;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.SeBootstrap;
import jakarta.ws.rs.core.Application;

public class BootstrapRunner {
    @ApplicationPath("/api")
    public static final class JakartaRestfulApplication extends Application {
        @Override
        public Set<Object> getSingletons() {
            return Set.of(new PeopleRestService());
        }
    }

    public static void main(String[] args) {
        final SeBootstrap.Configuration configuration = SeBootstrap.Configuration
            .builder()
            .property(SeBootstrap.Configuration.PROTOCOL, "http")
            .property(SeBootstrap.Configuration.PORT, 10800)
            .property(SeBootstrap.Configuration.ROOT_PATH, "/")
            .build();

        SeBootstrap
            .start(new JakartaRestfulApplication(), configuration)
            .toCompletableFuture()
            .join();
    }
}
