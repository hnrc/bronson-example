import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;

public class Person {

    private final String name;;
    private final String email;
    private static final boolean isAlive = true;

    public Person(final String name, final String email, final int age) {
        this.name = name;
        this.email = email;
    }

    public boolean something(final String x) {
        return x.equals("bronson");
    }

    @Override
    public boolean equals(final Object obj) {
        if(obj instanceof Person) {
            final Person that = (Person)obj;
            return Objects.equals(this.name, that.name) && Objects.equals(this.email, that.email);
        }
        return false;
    }
}

