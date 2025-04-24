## Tree Burning in Processing

Save your work here: `.../APCSA_1/apcsa-assignments-YourUsername/classwork/48_burning_trees_processing/MyTreeBurning/*.pde`

- Create a Processing sketch MyTreeBurning.

- Add a new tab BurnTrees and paste your BurnTrees Java code into this new tab.

- Delete the following methods from your code: main(), toStringColor(), and animate().

- Add another new tab called Frontier, and paste your Frontier class into it.

- The Text class in not needed in Processing.

### MyTreeBurning starter code

```
BurnTrees burnT;
int rows;
int cols;
double density;
int squareSize;

void setup() {
  size(600, 500);
  rows = 50;
  cols = 60;
  density = .7;
  burnT = new BurnTrees(cols, rows, density);
  // What should be the value for squareSize? How do you calculate the squareSize using an expression?
  // Keep in mind that we can change the size of the sketch, rows and cols, so make sure your code will create squares on the sketch. 
  //squareSize = ?
}

// Do not change the draw() method
void draw() {
  background(0);
  // frameCount indicates how many times this method is executed
  // Q: Why do we have this condtion frameCount % 10 == 0? Write your answer here.
  // WHat happens when you replace 10 with a greater or lower number?
  if (frameCount % 10 == 0 && !burnT.done()) {
    burnT.tick();
    //println("Tick: " + frameCount);
  }

  // This method converts the 2D array into a grid, color the squares red, green, grey, white
  drawSquares(burnT);

  //Output the resulting time and dimensions of the simulation
  if (burnT.done()) {
    fill(100);
    rect(20,00,450,20);
    fill(255);
    textSize(20);
    text("Simulation of "+cols+" by "+rows+" grid took "+burnT.getTicks()+" ticks", 20, 20);
  }
}

void mouseClicked() {
  // Reset the simulation by clicking the mouse (reset burnT).
  // You must use the original values when you reset.
}


void drawSquares(BurnTrees burnT) {
  // Draw the grid squares (rows x cols)
  // Fill in the squares with colors red (fire), green (tree), grey (ash), white (empty)
  // You may use burnT.map, it is in the same sketch
}

```
