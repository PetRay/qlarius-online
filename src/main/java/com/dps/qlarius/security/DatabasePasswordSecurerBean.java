package com.dps.qlarius.security;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.security.authentication.encoding.PasswordEncoder;

/**
 * Encrypts any users who are imported into embedded database.
 * @author Dan Developer
 * 
 */
public class DatabasePasswordSecurerBean extends JdbcDaoSupport {
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	/**
	 * Deal with secure user authentication
	 */
	public void secureDatabase() {
		getJdbcTemplate().query("select username, password from user",
				new RowCallbackHandler() {
					public void processRow(ResultSet rs) throws SQLException {
						String username = rs.getString(1);
						String password = rs.getString(2);
						String encodedPassword = passwordEncoder
								.encodePassword(password, null);
						getJdbcTemplate()
								.update("update user set password = ? where username = ?",
										encodedPassword, username);
						logger.debug("Updating password for username:"
								+ username + " to: " + encodedPassword);
					}
				});
	}
}
