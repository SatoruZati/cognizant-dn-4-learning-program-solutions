# Cognizant Digital Nurture 4.0 Learning Program Solutions

This repository contains solutions and exercises for the Cognizant Digital Nurture 4.0 Learning Program.

## Repository Structure

```
cognizant-dn-4-learning-program-solutions/
├── Week-1-Data structures and Algorithms/
│   ├── code/
│   │   ├── Exercise02/          # E-commerce Product Search
│   │   └── Exercise07/          # Financial Forecasting
│   └── output/
│       ├── exercise02/
│       └── exercise07/
├── Week-1-Design principles & Patterns/
│   ├── code/
│   │   ├── exercise01/          # Singleton Pattern
│   │   └── exercise02/          # Factory Method Pattern
│   └── output/
│       ├── exercise01/
│       └── exercise02/
└── Week-2/                      
```

## Week 1: Data Structures and Algorithms

### Exercise 02: E-commerce Product Search
**File:** `Week-1-Data structures and Algorithms/code/Exercise02/exercise2.java`

**Description:** Implementation of product search functionality for an e-commerce platform using both linear and binary search algorithms.

**Key Features:**
- Product class with ID, name, and type attributes
- Linear search implementation (O(n) time complexity)
- Binary search implementation (O(log n) time complexity)
- Bubble sort for preparing data for binary search
- Interactive user input for product ID search

**Learning Objectives:**
- Understanding search algorithm efficiency
- Comparing linear vs binary search performance
- Implementing sorting algorithms as preprocessing step

### Exercise 07: Financial Forecasting
**File:** `Week-1-Data structures and Algorithms/code/Exercise07/exercise7.java`

**Description:** Financial forecasting application that calculates future investment values using both recursive and iterative approaches.

**Key Features:**
- Recursive calculation of compound interest
- Iterative calculation for performance comparison
- Interest calculation functionality
- User input for investment parameters (principal, rate, time period)
- Formatted output showing projected values

## Week 1: Design Principles & Patterns

### Exercise 01: Singleton Pattern
**File:** `Week-1-Design principles & Patterns/code/exercise01/exercise01.java`

**Description:** Implementation of the Singleton design pattern ensuring only one instance of a class can be created.

**Key Features:**
- Private constructor to prevent instantiation
- Static getInstance() method for controlled access
- Lazy initialization approach
- Demonstration of single instance behavior

**Learning Objectives:**
- Understanding creational design patterns
- Implementing controlled object instantiation
- Learning about static methods and variables

### Exercise 02: Factory Method Pattern
**File:** `Week-1-Design principles & Patterns/code/exercise02/exercise02.java`

**Description:** Implementation of the Factory Method pattern for creating different types of vehicles without specifying their exact classes.

**Key Features:**
- Vehicle interface defining common behavior
- Concrete implementations (Car and Bike classes)
- VehicleFactory class for object creation
- Type-based object instantiation

**Learning Objectives:**
- Understanding factory design patterns
- Implementing interface-based programming
- Learning about object creation abstraction

## Getting Started

### Prerequisites
- Java Development Kit (JDK)
- Java compiler (javac)
- Command line interface or IDE (Eclipse, IntelliJ IDEA, VS Code)

### Running the Exercises

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd cognizant-dn-4-learning-program-solutions
   ```

2. **Navigate to specific exercise:**
   ```bash
   cd "Week-1-Data structures and Algorithms/code/Exercise02"
   ```

3. **Compile the Java file:**
   ```bash
   javac exercise2.java
   ```

4. **Run the compiled program:**
   ```bash
   java exercise2
   ```

## Output Screenshots

Each exercise includes output screenshots demonstrating the program execution:
- Exercise outputs are stored in respective `output/` directories
- Screenshots show console interactions and results


This repository is part of the Cognizant Digital Nurture 4.0 Learning Program. Solutions are provided for submission purposes.

## License

This project is created for educational purposes as part of the Cognizant Digital Nurture 4.0 Learning Program.

---
