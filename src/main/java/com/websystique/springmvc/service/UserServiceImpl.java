package com.websystique.springmvc.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.userDao.UserDao;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	//private static final AtomicLong counter = new AtomicLong();
	@Autowired
	UserDao userDao;
	
	//private static List<User> users;
	
	/*static{
		users= populateDummyUsers();
	}*/

	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}
	
	public User findById(long id) {
		/*for(User user : users){
			if(user.getId() == id){
				return user;
			}
		}
		*/return userDao.findById(id);
	}
	
	public User findByName(String name) {
		/*for(User user : users){
			if(user.getUsername().equalsIgnoreCase(name)){
				return user;
			}
		}*/
		return userDao.findByName(name);
	}
	
	public void saveUser(User user) {
		/*user.setId(counter.incrementAndGet());
		users.add(user);*/
		userDao.saveUser(user);
	}

	public void updateUser(User user) {
		/*int index = users.indexOf(user);
		users.set(index, user);
	*/
		userDao.updateUser(user);
		}

	public void deleteUserById(long id) {
		
		/*for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
		    User user = iterator.next();
		    if (user.getId() == id) {
		        iterator.remove();
		    }
		}
	*/userDao.deleteUserById(id);
		}

	public boolean isUserExist(User user) {
		return findByName(user.getUsername())!=null;
	}
	
	public void deleteAllUsers(){
		userDao.deleteAllUsers();
	}

	/*private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"Sam", "NY", "sam@abc.com",120));
		users.add(new User(counter.incrementAndGet(),"Tomy", "ALBAMA", "tomy@abc.com",145));
		users.add(new User(counter.incrementAndGet(),"Kelly", "NEBRASKA", "kelly@abc.com",1546));
		return users;
	}*/

}
