package filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if ("FEMALE".equalsIgnoreCase(person.getGender())) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
