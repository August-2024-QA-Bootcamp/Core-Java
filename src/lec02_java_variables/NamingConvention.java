package lec02_java_variables;

// Project names generally starts with UpperCase --> August2024CoreJava
// Package names generally starts with lowerCase --> lec01JavaBasic
// Class names starts with UpperCase  --> NamingConvention
// Class names are usually nouns or noun phrases

// Project, package, Class follow Camel case feature or Snake case pattern. [start from second word]

// Camel case feature considered from second word (not from the first word or second letter)
// There is No space and second word start with upper case, same for third, fourth, fifth words]

// Camel case example for a Project --> August2024CoreJava
// Camel case example for a package --> lec01JavaBasic
// Camel case example for a Class --> NamingConventionForJavaClass

// Alternative of Camel case feature (Called snake_case pattern). 
// words separated by under score and from second word always lower case

// Snake case feature considered from second word, (not from the first word)
// Snake case example for a Project --> August_2024_core_java
// Snake case example for a package --> lec_01_java_basic
// Snake case example for a Class --> Naming_convention_for_java_class

public class NamingConvention {
	// Non-constant (Regular) variable (or field) names starts with lowerCase
	// They follow camelCase or snake_case_feature
	// variable names must be specific and meaningful
	// (variable name) no duplication is accepted inside the same class

	// public is an access modifier, int is the type of variable, houseNumber is the name of the variable
	public int houseNumber = 625; // variable initialized
	public String avenue_name; // variable declared
	
	// Constant names are written with all upper case letters with words separated by underscores
	// We will use it in automation framework, no need to worry about it right now
	public String TODAY = "Tuesday";
	public String PLANET_NAME = "Earth";
	public String WEDDING_REGISTRY_PAGE_TITLE = "Amazon Wedding";
	public int LONG_WAIT = 10;
	public int IMPLICITLY_WAIT = 10;
	public int EXPLICITLY_WAIT = 10;
	
	// names like "string1, myarray1, no_1" are not acceptable as variable names
	// because they are are not specific and can cause confusion like the variable below:
	public String string1 = "String"; // not acceptable or encouraged to use 
	public int int1;


	public static void main(String[] args) {
		System.out.println("This is all about Naming Convention");

	}

}
