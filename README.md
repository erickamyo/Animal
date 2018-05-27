# Animal: 
1. sing() for the bird implemented at line 17 . 
1a. unit testing implemented at unitTest.java
1b. encapsulations, access modifiers, polymorphism were used for easier maintainability through out the codes . (code: Solution.java)   


2a, 2b. Duck implemented at line 24 Solution.java. 
2c, 2d. Chicken implemented at line 38 Solution.java.


3a. Rooster class implemented at line 47 Solution.java. 
3b,3c. Chicken object is created in rooster class. (without having inheritance from Chicken class) 

4. Interface: Thing implemented at line 65. Dog,Cat, RoosterB , (telephone,duck etc ) implements interface Thing.     
At line 210-213 Solution.java , parrot object is created and called for parrots that stays with dogs, cat, Rooster etc.  

B. Model fish:
1a,b,c.  Fish implemented at line 101 Solution.java . attributes created : size and color. 
2a,b.    attributes (size and color) for Shark (at line 132,133 Solution.java) and Clownfish (at line 145,146 Solution.java) were implemented . 
2c,2d.   method for shark : eat() at line 137 Solution.java . method for clownfish: joke() at line 149 Solution.java. 

3. Dolhpin is not a fish. so, Dolphin class do not inherit Fish but, fish object is created to use swim() method. at line 157 Solution.java. 
 
D. Model animals that change their behaviour over time
1,2. Butterfly class implemented at line 187 Solution.java.  Caterpillar class implemented at line 173 Solution.java. 
   They both inherit the abstract class ButterflyLifeCycle and methods were created per requirements.  
   
E. Counting animals
1. cuont() method at line 220 , Solution.java to count the number of animals that fly, walk, sing and swim. 

Bonus: 
1. RoosterInter class implemented at line 269 Solution.java.


2. RestfulAPI Design

GET /myapp/animals

Response attributes

* animalName: String
* canWalk: Boolean
* canSing: Boolean
* canFly: Boolean
* canSwim: Boolean
* singAs: String


