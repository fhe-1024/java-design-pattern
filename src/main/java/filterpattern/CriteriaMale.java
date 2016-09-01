package filterpattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if ("MALE".equalsIgnoreCase(person.getGender())) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
