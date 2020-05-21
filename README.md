# recruitment-tasks
Simple program to receive a string and transform it if necessary

- If the argument has no more then 10 characters, argument itself
- If the argument has more than 10 characters, another string with length of 10. 
- It should return different results for arguments "test-one-two-three" and "test-one-two-four"
- Always return the same result for the same argument value (even if restarted, it shouldn't persist any state)

# Requirements
- Java
- Maven

# Run the project
- Pull the project
- Open Terminal and go to the root directory of the project
- Clean and Install the project by executing the command :

```
mvn clean install
```

- To run the main app execute the command :

```
mvn exec:java
```

# Testing
- To run the test simply run the command :

```
mvn test
```
- You can find the test file in : `/src/test/...`


