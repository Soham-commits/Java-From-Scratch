# Java From Scratch

A hands-on collection of Java examples, exercises, and small projects intended to help beginners learn core Java concepts from the ground up.

## Overview

This repository is structured to teach Java fundamentals through concise examples and exercises. It's ideal for learners who prefer learning by doing — each folder contains small, focused examples that illustrate a single concept.

## Contents

- `src/` - Example source code organized by topic or lesson (packages recommended).
- `exercises/` - Small practice problems and suggested solutions.
- `docs/` - Supplementary notes, explanations, and references.
- `README.md` - This document.
- `LICENSE` - Repository license (MIT recommended if you want permissive reuse).

## Getting Started

Prerequisites:
- Java JDK 8 or later (https://adoptium.net or https://jdk.java.net).
- A Java-capable IDE (IntelliJ IDEA, Eclipse, VS Code) or a terminal with javac/java.

Quick start (command line):

1. Clone the repository:
   git clone https://github.com/Soham-commits/Java-From-Scratch.git
2. Change into the repo folder:
   cd Java-From-Scratch
3. Compile an example:
   javac -d out src/example/HelloWorld.java
4. Run the example:
   java -cp out example.HelloWorld

Adjust the paths and package names to match the files you use in the repository.

Using an IDE:
- Import the repository as an existing project and configure the JDK. Most IDEs will automatically detect source folders and packages.

## Suggested Project Structure

- `src/main/java/` - Production/example Java source files (organized by package).
- `src/test/java/` - Tests or sample checks (if you add unit tests).
- `exercises/` - Short, self-contained practice tasks with solutions.
- `docs/` - Notes, lesson plans, or external references.

## Style & Conventions

- Use proper package declarations for all Java source files.
- Follow standard Java naming and formatting conventions (camelCase for variables and methods, PascalCase for classes).
- Keep examples small and focused — one concept per file when possible.

## How to Contribute

Contributions are welcome! To add new examples or improvements:

1. Fork the repository.
2. Create a feature branch:
   git checkout -b add-<topic>-exercise
3. Add your example(s) under `src/` or `exercises/`, include a short README or comment explaining the concept and expected output.
4. Commit and push your branch, then open a pull request describing your changes.

Be sure to include package statements, and if adding longer examples, include instructions to compile/run them.

## License

This repository is suitable for reuse under the MIT License. Add a `LICENSE` file if one is not present.

## Contact

If you have questions or suggestions, open an issue in this repository or reach out to the repository owner: Soham-commits.
