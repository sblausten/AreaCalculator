## Area Calculator exercise

This is a simple exercise to practice test driving some SOLID principles in the code but waiting to define the abstraction until it is necessary. 

### Approach:
I only created an interface for Shapes when I added the square as both square and rectangle had similar properties (length and width). 

AreaCalculator started out calculating the area of a rectangle and square itself, but when I introduced a circle it became clear that the shapes themselves should have responsibility for calculating their own areas as otherwise this was a clear violation of the Open Closed principle. Every new shape added would require modification of the Area Calculator class. 

Instead I encapsulated the area calculator in each implementation of the shape interface. 

This raised the question as to whether square could just inherit from rectangle as the calculation was the same. However I decided that square as it was initially modeled with length and width had unnecessary properties - it only need one side measurement as the proportions would always be 50:50. This meant that it no longer was a candidate for inheritance from rectangle. Additionally there was the issue that the behavior of a square was actually quite different from a rectangle in regard to the proportion of its sides always being constant. One could envisage a future requirement for Rectangles to calculate the proportion of the shape sides. This would clearly not be applicable behavior to the theoretical square sub-class, thus contravening the Liskov Substitution principle.


### Extensions:
- I only used feature/integration tests so far so the next step would be to add unit tests to each shape. 

- It would be interesting to add some display options for calculating and summing areas of multiple shapes via JSON HTML or CLI.

- Additionally I could add a composite shape factory to create 2D cars etc... And extend it with a volume calculator for 3D shapes. 

    