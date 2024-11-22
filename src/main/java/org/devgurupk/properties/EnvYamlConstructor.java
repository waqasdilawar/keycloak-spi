package org.devgurupk.properties;

import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.env.EnvScalarConstructor;
import org.yaml.snakeyaml.nodes.Tag;

public class EnvYamlConstructor extends EnvScalarConstructor {

  public EnvYamlConstructor() {
    rootTag = new Tag(ApplicationProperties.class);
    addTypeDescription(new TypeDescription(ApplicationProperties.class));
  }
}
