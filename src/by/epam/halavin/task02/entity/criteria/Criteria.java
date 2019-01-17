package by.epam.halavin.task02.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
	private Class<E> eClass;
	private Map<E, Object> criteria = new HashMap<E, Object>();

	public Criteria(Class<E> type) {
		eClass = type;
	}

	public String getTypeNameGenerics() {
		return eClass.getSimpleName();
	}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<E, Object> criteria) {
		this.criteria = criteria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((criteria == null) ? 0 : criteria.hashCode());
		result = prime * result + ((eClass == null) ? 0 : eClass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Criteria<E> other = (Criteria<E>) obj;

		boolean bool = false;

		if (eClass == other.eClass) {
			if (criteria.equals(other.getCriteria())) {
				bool = true;
			}
		}

		return bool;
	}

}
