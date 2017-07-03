package springJpa;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.jpa.lwk.dao.UserRepository;
import com.jpa.lwk.entity.MyUser;

public class UserTest extends JpaTest {
	@Resource
	private UserRepository userDao;
	
	@Test
	public void findAll(){
		List<MyUser> list=userDao.findAll();
		for (MyUser user : list) {
			System.out.println(user.getUserId()+user.getUserName()+user.getPassWord());
		}
	}
}
