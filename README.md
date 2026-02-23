# 📦 Stack Implementation using Two Queues 

This project demonstrates how to implement a Stack (LIFO) data structure using two Queues in Java.

The stack supports:

push(int x)

pop()

top() / peek()

empty()

Two different strategies are implemented:

Pop/Top Costly Approach

Push Costly Approach

## 🧠 Concept

A stack follows:

Last In → First Out (LIFO)

A queue follows:

First In → First Out (FIFO)

To simulate LIFO using FIFO, we transfer elements between two queues strategically.

🔹 Approach 1: Pop / Top Costly (Push O(1))
📌 Idea

Always push into the non-empty queue

During pop() or top(), move n-1 elements to the other queue

The last remaining element is the stack top

## 🔄 Operation Flow

Example:

push(1)
push(2)
push(3)

Queue state: [1,2,3]

pop():
Move 1,2 → other queue
Return 3
⏱ Time Complexity
Operation	Complexity
push	O(1)
pop	O(n)
top	O(n)
empty	O(1)
✅ When to Use

When push operations are frequent

When pop operations are less frequent

🔹 Approach 2: Push Costly (Pop O(1))
## 📌 Idea

Always push into q2

Move all elements from q1 to q2

Swap queues

The newest element stays at the front

## ⏱ Time Complexity
Operation	Complexity
push	O(n)
pop	O(1)
top	O(1)
empty	O(1)

## 🔍 Sample Execution
push(1)
push(2)
push(3)

top() → 3
pop() → 3
pop() → 2
pop() → 1
empty() → true
## 🛠 Edge Case Handling

If stack is empty → return -1

empty() checks both queues

No direct stack structure is used

## 🎯 Key Learning Points

Understanding data structure simulation

Maintaining invariants

Queue transfer mechanics

Trade-offs between time complexities

Real interview-level implementation logic

## 🧩 Conclusion

This project demonstrates two valid and interview-relevant strategies for implementing a Stack using two Queues. It highlights the importance of maintaining structural invariants and choosing the right trade-off based on operation frequency.
