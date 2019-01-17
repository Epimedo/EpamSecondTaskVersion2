package by.epam.halavin.task02.util.read;

import by.epam.halavin.task02.dao.exception.DAOException;

public interface Input {

	public String[] read(String str) throws DAOException;
}
