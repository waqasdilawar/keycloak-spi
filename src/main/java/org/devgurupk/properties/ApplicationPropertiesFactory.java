package org.devgurupk.properties;

import static org.yaml.snakeyaml.env.EnvScalarConstructor.ENV_FORMAT;
import static org.yaml.snakeyaml.env.EnvScalarConstructor.ENV_TAG;

import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;

public class ApplicationPropertiesFactory {

  private ApplicationPropertiesFactory() {

  }

  public static ApplicationProperties getInstance() {
    Yaml yaml = new Yaml(new EnvYamlConstructor());
    yaml.addImplicitResolver(ENV_TAG, ENV_FORMAT, "$");
    InputStream inputStream = ApplicationPropertiesFactory.class
        .getClassLoader()
        .getResourceAsStream("application.yaml");
    return yaml.load(inputStream);
  }
}
