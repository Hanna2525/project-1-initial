# Project 1

### Objectives
This assignment is designed just to get you going on the use of GitHub, CoPilot, IntelliJ, provide a review of basic Java concepts as well as introduce you to running Unit Tests.  This should be an easy 50 points for you.

### Concepts Covered
* Java class design
* Basic Java concepts
* UML
* Unit Tests

### Details
* Review Java programming basics paying close attention to creating custom classes.
* Fork the project template from https://github.com/UltimateSandbox/project-1-initial.git
* Clone your new project from https://github.com/

Complete the following programming assignment manually or utilizing AI (Gemini, CoPilot, TabNine, etc.) to generate the code.  If you use AI, be sure to include the text you used to generate the code in a multi-line comment just above the class header.  Be sure to run the tests included and make sure they all pass.
* Design & implement a class called Point that represents a location in the Cartesian plane.
* Include (at a minimum) the following methods:
- A constructor that takes x and y coordinates as double arguments
- setX(double x), setY(double y) - standard setters
- getX(), getY() - standard getters
- setPoint(double x, double y) - set the coordinates of the point.
- shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.
- distance(Point p2) - finds the distance to point p2.
- rotate(double angle) - rotates the point by a specified (radian) angle around the origin. The formula for rotation is as follows:
```
x′=xcos(θ)−ysin(θ)
y′=xsin(θ)+ycos(θ)
```

* Include a toString method as well. If you're not sure what the toString method does, look it up.  It's a very useful method to have in your classes.
* Any other methods you believe to be necessary.
* Your code should work with the unit tests provided.
* Use the tests with no code modifications to test your class for the correct results.
* Use the informal UML below to complete your Point class.

![img.png](img.png)

### Expected Output
Once you get your Point class working, when you run the unit tests, you should see all tests pass.

### Extra Credit
If you would like up to 10 points extra credit for this assignment, utilize a code generation AI to write custom unit tests for the class.  Your tests will **replace** the existing unit tests.  (Once you copy the new test class, Ctrl-A, Ctrl-V on the existing test class is a quick way to copy/paste over the old tests.) To get any extra credit points on this, you **must** include the text [AI prompt] you used to generate the tests in a multi-line comment just above the test class header.  Make sure to have the AI include common edge cases in its tests for full credit.  Also, be sure to run the tests and make sure they all pass.

The trick with this extra credit is really just figuring out what to ask the AI to get the proper tests generated. Don't worry so much about cleaning up the test code - just get it in the right place and make sure it runs.

### Helpful Hints
- The rotate method implementation has a trick to it that you need to consider when implementing.  Remember, if you modify the x value, then try to use it in the y value calculation, you'll get the wrong answer.  (You need to temporarily store the new x value and use the original for the y calculation.)  Be sure the AI took this into consideration when auto generating the rotation method.
- Utilize the Math class for the algorithm implementation.  AI will probably do this automatically.
- Utilize Google or AI to find the distance formula.
- Make good use of whitespace and comments to make your implementation as clean as possible.
- Use good, SOLID object-oriented programming principles (pun intended) in your implementation.

### Deliverables
- Be sure you commit & push your code to GitHub.  If you don't push it, I won't be able to see it!
- Make sure your repo is **public**, or I won't be able to see it.
- Copy the URL for your repo (green button on your GitHub repos' page) and paste it into the Website URL field in Canvas and click Submit Assignment!
