public class Person {


	private String name;
	private String email;

	/**
	 *
	 * @param name person's name
	 * @param email person's email
	 */
// constructor 1

	public Person(String name, String email) {

		setName(name);
		setEmail(email);
	}

/**
 * person constructor with two parameter
 * @param row  Person info in one row separated by comma
 */
	// constructor 2
	public Person(String row) {
		String[] fiedls = row.split(",\\s*");


		setName(fiedls[1]);
		setEmail(fiedls[2]);
	}

/**
 * person constructor with one parameter
 * @param name person info in one row separated by comma
 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * person constructor with one parameter
	 * @param name person info in one row separated by comma
	 */

	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * setEmail method provide email to the field
	 * @param name person info in one row separated by comma
	 */
	public String getName() { return name; }
	/**
	 * Method getName
	 * @return name
	 */

	public String getEmail() { return email; }
	/**
	 * Method getEmail
	 * @return email
	 */
}
