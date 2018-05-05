import com.hyl.umis.Employee;
import com.hyl.umis.EmployeeServiceProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Text {
    @Autowired
    private Employee employee;

    @Autowired
    private EmployeeServiceProxy serviceProxy;

    @Test
    public void test() throws Exception {
        System.out.println(employee);
    }

    @Test
    public void testProxy() throws Exception {
        serviceProxy.save(new Employee());
    }
}

