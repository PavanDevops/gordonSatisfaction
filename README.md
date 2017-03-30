# Assignement

``` 
Gordon Ramsey, a very smart guy, likes eating food. Now, Gordon is at a restaurant 
and he has many different types of food to choose from. Gordon gets x amount of satisfaction 
and requires y amount of time to eat an item from the menu. Given t minutes,
write a java program that reads the text file and
ﬁnds out the maximum satisfaction that Gordon can get from eating at the restaurant. 
You will be given a text file(inputData.txt) with the following format:

[t][Number of items on menu]

[amount of satisfaction from eating dish 1][time taken for dish 1]

[amount of satisfaction from dish 2][time taken for dish 2]
```

### Implementation

* Read the data from the inputData.txt file
* First line of the file will be taken as total time and Number of Items
* Read the menu for items and maximum time to eat of that item from the file 
* Store items in order and gives statisfaction points given by a item per unit of time 
* Calculation is done through knapsack Approach by passing the below value to the method:

    ``` Total Time
        Number of Items
        Satisfaction of each Item from Menu
        time taken for each item
    ```
* The max Satisfaction calculated and return as below.

### The result looks like:

* Complete time is = 10000
* Items given in number = 100
* Maximum satisfaction that Gordon can get from eating at the restaurant is = 2493893
