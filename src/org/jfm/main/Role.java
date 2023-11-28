/**
 * 
 */
package org.jfm.main;

/**
 * @author Nikhil Hiremath
 *
 */
public class Role {

	String role;
	String[] privileges;
	private String[] whitelist;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String[] getPrivileges() {
		return privileges;
	}

	public void setPrivileges(String[] privileges) {
		this.privileges = privileges;
	}

	public String[] getWhitelist() {
		return (whitelist != null) ? whitelist : new String[0];
	}


	public void setWhitelist(String[] whitelist) {
		this.whitelist = whitelist;
	}
}
