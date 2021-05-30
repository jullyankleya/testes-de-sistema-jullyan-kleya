package org.automacao;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"org/automacao"},
        plugin = {"pretty", "summary", "html:target/CucumberReport.html"},
        tags = "@encontrar-lojas-que-vendem-lentes",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true)

public class RunCucumberTest {
}
