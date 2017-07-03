package springJpa;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jpa.lwk.dao.UserDao;
import com.jpa.lwk.entity.MyUser;

public class EntityJpaTest extends JpaTest {
	
	@Autowired
	private UserDao userEntity;
	
	@Test
	public void findAll(){
		String sql="from MyUser";
		List<MyUser> list = userEntity.findAll(sql);
		for (MyUser user : list) {
			System.out.println(user.getUserId()+user.getUserName());
		}
	}
}
