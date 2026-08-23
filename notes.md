# Java Learning Notes

A complete, ordered guide to every concept in this repository. Each section explains the idea in plain terms and links to the actual code so you can read the explanation, then immediately see it working.

Suggested order: read top to bottom. Core Java (1–14) builds the language foundation, Collections (15) and DSA (16) build on top of it.

---

## 1. Basics — variables, conditionals, operators

Java is statically typed: every variable's type is fixed at compile time (`int`, `double`, `boolean`, `String`, etc.). `if/else` branches on a `boolean` condition, and the ternary operator `condition ? a : b` is a compact one-line if/else.

- [`Main.java`](./Main.java) — simplest possible if/else
- [`if_else.java`](./if_else.java) — if/else with `String.equals()`
- [`ternary.java`](./ternary.java) — the ternary operator
- [`ranges.java`](./ranges.java) — min/max range of every primitive type (`byte`, `short`, `int`, `long`, `float`, `double`, `char`)

**Key idea:** `char` is secretly a 2-byte integer type that stores ASCII/Unicode code points — `char ch = 97;` prints `a`.

---

## 2. Loops and patterns

`for`, `while`, and nested loops are how Java repeats work. Star/number patterns are a classic way to practice nested loop control.

- [`patterns/Floyd_Triangle.java`](./patterns/Floyd_Triangle.java)
- [`patterns/full_pyramid.java`](./patterns/full_pyramid.java)
- [`pattern.java`](./pattern.java) — right vs left triangle
- [`Permutations.java`](./Permutations.java) — nested loop pair generation
- [`random_guess.java`](./random_guess.java), [`rock_paper_scissors.java`](./rock_paper_scissors.java), [`slot_machine.java`](./slot_machine.java) — loop-driven mini games using `while(true)` + `break`

---

## 3. Methods

A method groups reusable logic. `static` methods belong to the class itself and can be called without creating an object (`ClassName.method()`), while instance methods need an object.

- [`Methods.java`](./Methods.java) — basic method with parameters and a return value
- [`overloadedMethods.java`](./overloadedMethods.java), [`OverloadedMethods.java`](./OverloadedMethods.java) — **method overloading**: same name, different parameter list, resolved at *compile time*

**Method signature = name + parameter list.** The return type alone cannot distinguish two overloads.

---

## 4. Arrays

Arrays are fixed-size, indexed containers of a single type.

- [`arrays/arrays.java`](./arrays/arrays.java) — declaration syntax and default values
- [`arrays/arrays2.java`](./arrays/arrays2.java) — default values for every array type (`0`, `0.0`, `false`, `'\u0000'`, `null` for objects)
- [`arrays/Array_Reverse.java`](./arrays/Array_Reverse.java) — reversing into a new array
- [`arrays/ArrayRef.java`](./arrays/ArrayRef.java) — **arrays of objects are arrays of references**, not the objects themselves
- [`multidimentional_arrays/ThreeDimentionArray.java`](./multidimentional_arrays/ThreeDimentionArray.java) — 3D arrays
- [`test123.java`](./test123.java) — jagged arrays (`int[5][]`, rows of different sizes)
- [`matrix_add_sub.java`](./matrix_add_sub.java), [`q.java`](./q.java) — 2D array / matrix problems

---

## 5. OOP fundamentals — classes, objects, `static`

A **class** is a blueprint; an **object** is an instance built from it. `static` fields/methods belong to the class as a whole (shared across all objects); instance fields belong to each object separately.

- [`OOPS/student/`](./OOPS/student/) and [`OOPS/teacher/`](./OOPS/teacher/) — minimal class + object examples
- [`OOPS/cars/Car.java`](./OOPS/cars/Car.java) — a class combining fields (data) and methods (behavior)
- [`test.java`](./test.java) — instance field vs `static` field, accessed via `object.field` vs `ClassName.field`
- [`Static.java`](./Static.java) — a `static` counter shared by every `Employee` object
- [`objects_using_loops.java`](./objects_using_loops.java) — building an array of objects from user input

---

## 6. Constructors

A constructor initializes an object's fields when it's created with `new`. `this` refers to the current object, used to disambiguate a field from a same-named parameter.

- [`constructors/Student.java`](./constructors/Student.java) + [`constructors/Main.java`](./constructors/Main.java)
- [`constructors/Book.java`](./constructors/Book.java)

If you don't write any constructor, Java gives you a free no-argument one — but as soon as you write *any* constructor, that free one disappears.

---

## 7. Inheritance

`extends` lets one class (child) reuse and extend another class's (parent's) fields and methods. `super(...)` calls the parent's constructor.

- [`inheritance/Animals.java`](./inheritance/Animals.java), [`inheritance/Dog.java`](./inheritance/Dog.java), [`inheritance/Cat.java`](./inheritance/Cat.java), [`inheritance/Main.java`](./inheritance/Main.java)
- [`inheritance/personMain.java`](./inheritance/personMain.java) — a 5-level inheritance chain (`person → student → btech → CSE`), showing how far inheritance can be layered
- [`inheritance/Abstract.java`](./inheritance/Abstract.java) — abstract classes (see §8)

---

## 8. Abstraction — abstract classes

An `abstract` class cannot be instantiated directly; it exists to be extended. It can mix concrete methods (with a body) and `abstract` methods (no body — every child *must* implement them).

- [`inheritance/Abstract.java`](./inheritance/Abstract.java)
- [`assignment questions/AbstractAssignment.java`](./assignment%20questions/AbstractAssignment.java)

**Why bother?** It forces every subclass to provide its own `area()`/`perimeter()`, while still sharing common logic like `displayColor()`.

---

## 9. Polymorphism — overloading vs overriding

"Poly-morphism" = many forms. Java has two kinds:

- **Overloading** (compile-time): same method name, different parameter list, same class.
- **Overriding** (runtime): child class redefines a parent's method with the *exact same* signature; the version that runs depends on the actual object type, not the reference type.

- [`polymorphism/MethodOverriding.java`](./polymorphism/MethodOverriding.java) — an `Instrument[]` array where each element's `play()` behaves differently
- [`polymorphism/OverridingVsOverloading.java`](./polymorphism/OverridingVsOverloading.java) — both side by side in one file

---

## 10. Encapsulation

Encapsulation means hiding a class's internal data (`private` fields) and only exposing controlled access through public methods (getters/setters). This lets a class enforce its own rules (e.g. balance can never go negative).

- [`encapsulation/Encapsulation.java`](./encapsulation/Encapsulation.java)

---

## 11. Interfaces

An interface defines a *contract* of methods a class must implement, without providing behavior itself (aside from `default` methods). Unlike classes, a class can implement **many** interfaces — Java's answer to multiple inheritance.

- [`interfaces/InterfaceBasics.java`](./interfaces/InterfaceBasics.java) — interface with a `default` method
- [`interfaces/MultipleInheritance.java`](./interfaces/MultipleInheritance.java) — one class implementing two interfaces
- [`interfaces/FunctionalInterfaceDemo.java`](./interfaces/FunctionalInterfaceDemo.java) — a **functional interface** (exactly one abstract method), the foundation for lambdas (§18)

---

## 12. Generics

Generics let a class or method work with *any* type while staying type-safe, avoiding manual casting. `<T>` is a placeholder filled in when the class/method is actually used.

- [`generics/GenericClass.java`](./generics/GenericClass.java) — a generic `Box<T>`
- [`generics/GenericMethod.java`](./generics/GenericMethod.java) — generic methods, and a **bounded type** (`T extends Comparable<T>`)

---

## 13. Enums

An `enum` is a fixed set of named constants. Enums can have their own fields and constructors, and work cleanly inside `switch`.

- [`enums/EnumBasics.java`](./enums/EnumBasics.java)

---

## 14. Wrapper classes & autoboxing

Every primitive has a matching wrapper class (`int` → `Integer`, `double` → `Double`, ...). Autoboxing/unboxing is Java automatically converting between them — this is *why* collections (which only store objects) can appear to hold primitives.

- [`wrapper_classes/Autoboxing.java`](./wrapper_classes/Autoboxing.java) — includes the classic `Integer` caching `==` gotcha (values -128 to 127 are cached, so `==` "accidentally" works — never rely on it, always use `.equals()`)

---

## 15. Bitwise operators

`&` (AND), `|` (OR), `^` (XOR), `<<` (left shift, ×2), `>>` (right shift, ÷2) operate directly on a number's binary representation.

- [`bitwise/Bitwise.java`](./bitwise/Bitwise.java) — the basics
- [`bitwise/evenOrOdd.java`](./bitwise/evenOrOdd.java) — `x & 1` checks the last bit
- [`bitwise/nthBit.java`](./bitwise/nthBit.java) — reading a specific bit
- [`bitwise/makeBinary.java`](./bitwise/makeBinary.java) — manual decimal → binary conversion
- [`bitwise/XOR.java`](./bitwise/XOR.java) — XOR, used to find a single non-repeating element in an array of pairs

---

## 16. Strings

Strings in Java are **immutable** — every "modification" actually creates a brand-new `String` object. `StringBuilder` is the mutable alternative, much faster inside loops.

- [`strings/StringBasics.java`](./strings/StringBasics.java) — common `String` methods
- [`strings/StringImmutability.java`](./strings/StringImmutability.java) — immutability, the string pool, and why `==` on Strings is risky (use `.equals()`)
- [`strings/StringBuilderDemo.java`](./strings/StringBuilderDemo.java) — append/insert/reverse/delete

---

## 17. Exception handling

`try/catch/finally` lets a program recover from runtime errors instead of crashing. `finally` always runs. You can also define your own exception types by extending `Exception`.

- [`exceptions/TryCatchBasics.java`](./exceptions/TryCatchBasics.java) — catching `ArrayIndexOutOfBoundsException`, `ArithmeticException`, multi-catch
- [`exceptions/FinallyDemo.java`](./exceptions/FinallyDemo.java) — `finally` always executes, even after a `return`
- [`exceptions/CustomException.java`](./exceptions/CustomException.java) — a custom `InsufficientBalanceException`

---

## 18. Lambdas & Streams

A lambda (`x -> x * x`) is a compact way to implement a functional interface without writing a full class. Streams chain operations (`filter`, `map`, `sorted`, `collect`) over a collection in a declarative, loop-free style.

- [`lambda_streams/LambdaBasics.java`](./lambda_streams/LambdaBasics.java) — `Function`, `BiFunction`, `Predicate`, `Runnable` as lambdas
- [`lambda_streams/StreamBasics.java`](./lambda_streams/StreamBasics.java) — filter/sort/map/collect pipelines

---

## 19. Multithreading

A `Thread` runs code concurrently with the rest of the program. `Runnable` is the preferred way to define the task (a class can only `extend Thread` once, but can implement `Runnable` freely). `synchronized` prevents two threads from corrupting shared data at the same time (a **race condition**).

- [`multithreading/ThreadBasics.java`](./multithreading/ThreadBasics.java) — extending `Thread` directly
- [`multithreading/RunnableDemo.java`](./multithreading/RunnableDemo.java) — the preferred `Runnable` approach
- [`multithreading/SynchronizedDemo.java`](./multithreading/SynchronizedDemo.java) — race conditions and how `synchronized` fixes them

---

## 20. File I/O

Reading/writing files uses `FileWriter`/`FileReader` (or `Scanner`/`BufferedReader` for reading). `try-with-resources` auto-closes the file even if an exception occurs, so you never forget `.close()`.

- [`file_io/FileWriteRead.java`](./file_io/FileWriteRead.java) — manual write + read with explicit `.close()`
- [`file_io/TryWithResources.java`](./file_io/TryWithResources.java) — the safer, modern pattern

---

## 21. Collections Framework

Arrays are fixed-size and hold only one type well without help. The Collections Framework gives you flexible, resizable, purpose-built data structures — this is what real Java code uses almost everywhere instead of raw arrays.

| Interface | Use when you need... | File |
|---|---|---|
| `List` (`ArrayList`) | An ordered, resizable, index-accessible list | [`collections/ArrayListDemo.java`](./collections/ArrayListDemo.java) |
| `List`/`Deque` (`LinkedList`) | Fast insertion/removal at both ends | [`collections/LinkedListDemo.java`](./collections/LinkedListDemo.java) |
| `Map` (`HashMap`) | Fast key → value lookups | [`collections/HashMapDemo.java`](./collections/HashMapDemo.java) |
| `Set` (`HashSet`, `TreeSet`) | Unique values, optionally sorted | [`collections/HashSetDemo.java`](./collections/HashSetDemo.java) |
| `PriorityQueue` | Always pop the smallest/largest element first (heap) | [`collections/PriorityQueueDemo.java`](./collections/PriorityQueueDemo.java) |
| `Iterator` | Safely remove elements while looping | [`collections/IteratorDemo.java`](./collections/IteratorDemo.java) |
| `Comparable`/`Comparator` | Custom sort order for your own classes | [`collections/ComparatorComparable.java`](./collections/ComparatorComparable.java) |

**`Comparable` vs `Comparator`:** `Comparable` (`compareTo`) is written *inside* the class to define its one natural order. `Comparator` is written *outside* the class (often as a lambda) to define as many extra custom orderings as you like.

---

## 22. Data Structures & Algorithms (`dsa/`)

The DSA folder is organized by topic, with multiple focused files per topic rather than one giant file.

### Recursion — [`dsa/recursion/`](./dsa/recursion/)
A method that calls itself to break a problem into smaller identical subproblems, until it hits a **base case**.
- [`Factorial.java`](./dsa/recursion/Factorial.java) — plain recursion vs tail recursion
- [`Fibonacci.java`](./dsa/recursion/Fibonacci.java) — naive exponential recursion vs memoized (cached) recursion
- [`RecursionBasics.java`](./dsa/recursion/RecursionBasics.java) — countdown, sum, palindrome check

### Sorting — [`dsa/sorting/`](./dsa/sorting/)
| Algorithm | Idea | Time |
|---|---|---|
| [Bubble Sort](./dsa/sorting/BubbleSort.java) | Repeatedly swap adjacent out-of-order pairs | O(n²) |
| [Selection Sort](./dsa/sorting/SelectionSort.java) | Repeatedly select the minimum and move it to the front | O(n²) |
| [Insertion Sort](./dsa/sorting/InsertionSort.java) | Insert each element into its correct position in the sorted part | O(n²), fast on nearly-sorted data |
| [Merge Sort](./dsa/sorting/MergeSort.java) | Divide, sort halves, merge them back together | O(n log n) |
| [Quick Sort](./dsa/sorting/QuickSort.java) | Partition around a pivot, recurse on both sides | O(n log n) average |

### Searching — [`dsa/searching/`](./dsa/searching/)
- [`LinearSearch.java`](./dsa/searching/LinearSearch.java) — O(n), works unsorted
- [`BinarySearch.java`](./dsa/searching/BinarySearch.java) — O(log n), requires sorted data; iterative and recursive versions

### Linked Lists — [`dsa/linkedlist/`](./dsa/linkedlist/)
- [`SinglyLinkedList.java`](./dsa/linkedlist/SinglyLinkedList.java) — add, delete, print, in-place reversal
- [`DoublyLinkedList.java`](./dsa/linkedlist/DoublyLinkedList.java) — nodes link both forward and backward

### Stacks & Queues — [`dsa/stacks_queues/`](./dsa/stacks_queues/)
- [`stacks.java`](./dsa/stacks_queues/stacks.java), [`StackExample.java`](./dsa/stacks_queues/StackExample.java) — Last-In-First-Out (LIFO)
- [`QueueDemo.java`](./dsa/stacks_queues/QueueDemo.java) — First-In-First-Out (FIFO)
- [`BalancedBrackets.java`](./dsa/stacks_queues/BalancedBrackets.java) — the classic "valid parentheses" interview question, solved with a `Stack`

### Trees — [`dsa/trees/`](./dsa/trees/)
- [`BinaryTree.java`](./dsa/trees/BinaryTree.java) — height and node count via recursion
- [`TreeTraversals.java`](./dsa/trees/TreeTraversals.java) — inorder / preorder / postorder
- [`BinarySearchTree.java`](./dsa/trees/BinarySearchTree.java) — a BST keeps left < node < right, giving O(log n) average search/insert

### Graphs — [`dsa/graphs/`](./dsa/graphs/)
Represented as an adjacency list (`List<List<Integer>>`).
- [`GraphBFS.java`](./dsa/graphs/GraphBFS.java) — Breadth-First Search using a `Queue`, level by level
- [`GraphDFS.java`](./dsa/graphs/GraphDFS.java) — Depth-First Search using recursion, dives deep before backtracking

### Hashing — [`dsa/hashing/`](./dsa/hashing/)
- [`HashingBasics.java`](./dsa/hashing/HashingBasics.java) — the "two sum" problem solved in O(n) with a `HashMap`
- [`FrequencyCounter.java`](./dsa/hashing/FrequencyCounter.java) — word frequency counting, anagram checking

### Dynamic Programming — [`dsa/dp/`](./dsa/dp/)
DP = recursion + reusing already-solved subproblems instead of recomputing them.
- [`FibonacciDP.java`](./dsa/dp/FibonacciDP.java) — top-down (memoization) vs bottom-up (tabulation)
- [`Knapsack.java`](./dsa/dp/Knapsack.java) — the 0/1 knapsack problem, a 2D DP table
- [`ClimbingStairs.java`](./dsa/dp/ClimbingStairs.java) — a disguised Fibonacci problem

### String algorithms — [`dsa/strings/`](./dsa/strings/)
- [`ReverseWords.java`](./dsa/strings/ReverseWords.java)
- [`PalindromeCheck.java`](./dsa/strings/PalindromeCheck.java) — two-pointer technique
- [`AnagramGroup.java`](./dsa/strings/AnagramGroup.java) — grouping words by a sorted-letters signature

---

## 23. Practice questions

Every file in this repository ends with a short `// Practice:` comment — a small extension of that exact file's concept. The best way to use this repo is: read the file, run it, then actually attempt the practice question in the same file before moving to the next concept.

## 24. Assignment questions

[`assignment questions/`](./assignment%20questions/) contains fuller, multi-concept problems (prime ranges, strong numbers, a number-guessing game, an abstract shapes assignment, a cafeteria billing system) meant to be solved after you've covered the relevant concept sections above.

---

## Suggested learning path

1. Basics → Loops → Methods → Arrays *(sections 1–4)*
2. OOP: classes, constructors, inheritance, abstraction, polymorphism, encapsulation, interfaces *(sections 5–11)*
3. Generics, enums, wrapper classes *(sections 12–14)*
4. Bitwise, Strings, Exceptions *(sections 15–17)*
5. Lambdas/Streams, Multithreading, File I/O *(sections 18–20)*
6. Collections Framework *(section 21)*
7. DSA, topic by topic, in the order listed *(section 22)*
