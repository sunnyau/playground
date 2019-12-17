
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
}
