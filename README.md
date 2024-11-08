# Smile Java Application

This is a simple Java application that uses `JFrame` to display a smiling face. The face is drawn with the `Graphics2D` API, featuring a blue circular face, white eyes, and a curved smile. It's a basic example of working with Java Swing for graphical user interfaces.

## Features

- **Smiling Face**: The program draws a blue circular face with two white eyes and a curved smile.
- **Swing GUI**: Utilizes `JFrame` for creating the window and `Graphics2D` for drawing the face.
- **Main Method**: The `main` method initializes the window and makes it visible.

## Requirements

To run this program, you need to have the following:

- **Java Development Kit (JDK)** version 8 or higher installed.
- A compatible IDE or text editor for running Java programs (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).

## Running the Program

1. Clone or download the repository.
2. Open the `Smile.java` file in your preferred Java IDE.
3. Compile and run the program.

The program will open a window displaying a smiling blue face.

## Code Overview

### `Smile` Class

The `Smile` class extends `JFrame` and overrides the `paint` method to draw the smiling face using the `Graphics2D` object.

- **Face**: Drawn as a filled blue oval.
- **Eyes**: Two white filled ovals.
- **Mouth**: A white arc that forms the smiling curve.

### Constructor (`Smile`)

Sets up the window properties:
- Title: "Blue Smiling Face"
- Size: 400x400 pixels
- Close operation: Exit the application when the window is closed
- Center the window on the screen

### `paint` Method

The `paint` method is overridden to render the smiling face. It first casts the `Graphics` object to `Graphics2D` for advanced drawing capabilities. Then it draws the face, eyes, and mouth.

### `main` Method

The `main` method creates an instance of the `Smile` class and makes it visible using `SwingUtilities.invokeLater`.

---
