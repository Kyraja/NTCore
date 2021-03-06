package cz.neumimto.core;

import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.cause.EventContext;
import org.spongepowered.api.event.impl.AbstractEvent;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by NeumimTo on 12.12.2015.
 */
public class FindPersistenceContextEvent extends AbstractEvent {
    private Set<Class<?>> classes = new HashSet<>();
    public Set<Class<?>> getClasses() {
        return classes;
    }

    @Override
    public Cause getCause() {
        return Cause.of(EventContext.empty(), PluginCore.Instance);
    }

}
