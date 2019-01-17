package by.epam.halavin.task02.dao.util;

import by.epam.halavin.task02.entity.criteria.Criteria;

public interface StringParse {

    public <E> String[] parse(String[] lines, Criteria<E> criteria);
}
