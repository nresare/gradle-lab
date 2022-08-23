package com.resare.lab;

import io.swagger.codegen.languages.SpringCodegen;
import io.swagger.codegen.v3.DefaultGenerator;
import io.swagger.codegen.v3.config.CodegenConfigurator;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.fail;

public class GenerateTest {
    @Test
    void testDummy() {
        generateCode();
    }

    private void generateCode() {
        var cc = new CodegenConfigurator();
        cc.setInputSpecURL("/Users/noa/slask/test-openapiv3.yaml");
        cc.setLang("spring");
        cc.setOutputDir("/tmp/output");
        cc.setModelPackage("com.resare.test");
        cc.setSkipInlineModelMatches(true);
        cc.setAdditionalProperties(
                new HashMap(Map.of(
                        "java8", (Object) true,
                        "hideGenerationTimestamp", true,
                        "notNullJacksonAnnotation", true
                ))
        ); // CodegenConfigurator modifies its Map arguments, so we need to wrap it in something mutable
        //                .setTypeMappings(
//                        HashMap.of(
//                                V1ObjectMeta.class.getSimpleName(), V1ObjectMeta.class.getCanonicalName(),
//                                "integer", "Long"
//                        ).toJavaMap()
//                );

        new DefaultGenerator().opts(cc.toClientOptInput()).generate();

    }
}
