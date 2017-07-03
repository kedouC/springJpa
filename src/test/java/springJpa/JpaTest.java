package springJpa;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//基于spring测试框架
@ContextConfiguration(locations="classpath:applicationContent.xml")
public class JpaTest{
	
}
