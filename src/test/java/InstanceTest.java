
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InstanceTest {

    @Test
    public void shouldCreateNewInstance() {
        Instance instance = new Instance();
        assertThat(instance).isNotNull();
    }

    @Test
    public void classShouldCreateNewInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("Instance");
        Instance instance = (Instance) c.newInstance();
        assertThat(instance).isNotNull();
    }

    // commit 1

    // commit 2

    // commit 3

    // commit 4

    // commit 5

    // commit 6

    // commit 7

}
