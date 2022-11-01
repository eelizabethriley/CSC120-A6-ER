Use this file to record your reflection on this assignment.

- What are your initial impressions of how `Inheritance` affects your programming?

Inheritance greatly streamlines the process of creating similar but distinct "blueprints" for your code, allowing you to create many classes with certain shared characteristics while being free to individually tailor these child classes into their own distinct class. It felt good to be able to just extend the Building class and then worry about the child classes as their own entities. Programming using inheritance saves a lot of time and forces you to think about the design of the program in a more organized manner. Making the decision to extend a class also makes you consider the shared attributes of a set of classes so that you can take these all and put them into the parent class.

- What worked, what didn't, what advice would you give someone taking this course in the future?

Overall I thought this assignment was rather straightforward and I didn't encounter any major errors while completing it. I would reccomend anybody working on this assignment, especially those newer to Java, to make use of the Java documentation as you're working to help you, especially when working on the Library and House classes when you need to make use of HashTables and Array Lists. It is very helpful to familiarize yourself with the different methods of these classes to see what you can do with them. You will avoid a lot of errors and headaches from guessing by just checking to see what is there.

**Note: During this assignment, I referenced a GeeksforGeeks article (https://www.geeksforgeeks.org/hashtable-in-java/)to find out how to iterate through a Hashtable. The code that I referenced is found under the section "Performing Various Operations on Hashtable" at number 4, "Traversal of a HashTable) and is pasted below.

"""
    for (Map.Entry<String, Integer> e : ht.entrySet())
                System.out.println(e.getKey() + " "
                                + e.getValue());
"""

I edited this sample to fit my program at line 44 of the Library class, where the article is attributed again.