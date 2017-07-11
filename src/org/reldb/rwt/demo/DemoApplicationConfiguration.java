package org.reldb.rwt.demo;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.client.WebClient;

public class DemoApplicationConfiguration implements ApplicationConfiguration {

    public void configure(Application application) {
        Map<String, String> properties = new HashMap<String, String>();
        properties.put(WebClient.PAGE_TITLE, "Demo");
        application.addEntryPoint("/demo", DemoEntryPoint.class, properties);
    }
}
