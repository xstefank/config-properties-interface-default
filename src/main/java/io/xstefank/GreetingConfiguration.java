package io.xstefank;

import io.quarkus.arc.config.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.Optional;

@ConfigProperties(prefix = "greeting")
public interface GreetingConfiguration {

    @ConfigProperty(name = "message")
    String message();

    @ConfigProperty(defaultValue = "!")
    String getSuffix();

    Optional<String> getName();
}
