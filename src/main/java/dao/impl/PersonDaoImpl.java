package dao.impl;

import dao.PersonDao;
import entity.Person;
import org.springframework.stereotype.Repository;

@Repository(value = "personDao")
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao{

}
