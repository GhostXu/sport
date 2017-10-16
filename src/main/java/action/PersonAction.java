package action;

import dao.impl.PersonDaoImpl;
import entity.Person;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Scope("prototype")
public class PersonAction {

	@Resource(name = "personDao")
	private PersonDaoImpl personDaoImpl ;

	public String testAction(){
		List<Person> personList = personDaoImpl.findList();
		return "index";
	}

}
