Java Design Patterns

This repository contains Java implementations of several classic design patterns, each with both generic and concrete examples. The project is organized by pattern type, with each pattern demonstrating its structure and usage through simple, self-contained code samples.

## Patterns Included

- **Adapter**
- **Factory Method**
- **Mediator**
- **Singleton**
- **State**

---

## Pattern Previews

### Adapter

- **Generic Example:**  
  Adapts an `Adaptee` class to a `Target` interface using an `Adapter` class.
- **Concrete Example:**  
  Adapts a `LegacyPrinter` to a modern `Printer` interface using `PrinterAdapter`.

### Factory Method

- **Generic Example:**  
  Abstract `Creator` defines a factory method to create `IProduct` objects.  
  `ConcreteCreatorA` and `ConcreteCreatorB` instantiate different products.

### Mediator

- **Generic Example:**  
  `ConcreteMediator` coordinates communication between `ConcreteColleagueA` and `ConcreteColleagueB`.
- **Concrete Example:**  
  `ChatRoom` mediates message exchange between `UtenteChat` users.

### Singleton

- **Generic Example:**  
  `Singleton` class ensures only one instance exists and provides a global access point.
- **Concrete Example:**  
  `Logger` singleton provides a centralized logging facility.

### State

- **Generic Example:**  
  `Context` changes its behavior based on the current `State` (`StateA`, `StateB`).
- **Concrete Example:**  
  `PlayerContext` simulates a music player with states: `StoppedState`, `PlayingState`, `PausedState`.

---

## How to Run

1. Clone the repository.
2. Build with Maven:
   ```sh
   mvn compile
   ```
3. Run any example using:
   ```sh
   mvn exec:java -Dexec.mainClass="com.designpattern.<pattern>.<example>.<MainClass>"
   ```
   Replace `<pattern>`, `<example>`, and `<MainClass>` with the desired package and class.

---

## Project Structure

- `src/main/java/com/designpattern/adapter/`
- `src/main/java/com/designpattern/factory/`
- `src/main/java/com/designpattern/mediator/`
- `src/main/java/com/designpattern/singleton/`
- `src/main/java/com/designpattern/state/`

Each folder contains both generic and concrete subfolders with example code.