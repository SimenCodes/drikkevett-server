package no.rustelefonen.drikkevettserver.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Simen Fonnes on 03.07.2016.
 */
@ApplicationPath("no/rustelefonen/drikkevettserver/api")
public class ApplicationConfig extends Application {
    private Set<Class<?>> classes;

    public ApplicationConfig() {
        classes = new HashSet<>();
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
