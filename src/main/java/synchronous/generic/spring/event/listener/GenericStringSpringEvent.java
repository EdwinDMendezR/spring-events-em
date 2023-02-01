package synchronous.generic.spring.event.listener;

public class GenericStringSpringEvent extends GenericSpringEvent<String> {

    GenericStringSpringEvent(final String what, final boolean success) {
        super(what, success);
    }

}
