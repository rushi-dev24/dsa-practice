# Prefix Sum Problems – Level 02

This folder contains intermediate to advanced level Prefix Sum problems implemented in Java.

These problems focus on optimizing complex range queries, subarray computations, and frequency-based problems using prefix sums and hashing techniques.

---

## Problems Covered

- Range Frequency Query
- Subarray Sum Equals K
- Total Sum of All Subarrays
- Value Range Count Query

---

## Concepts Practiced

- Advanced Prefix Sum Applications
- Prefix Sum + HashMap
- Frequency Counting in Ranges
- Subarray Contribution Technique
- Optimized Range Query Handling
- Handling Negative Numbers in Prefix Sum

---

## Key Techniques

### 🔹 Prefix Sum Array
- Used for efficient cumulative computations

### 🔹 HashMap Optimization
- Used in subarray problems (like sum = K)
- Stores frequency of prefix sums

### 🔹 Subarray Contribution Formula
- Each element contributes:
- arr[i] * (i + 1) * (n - i)
- 
### 🔹 Range Query Formula
- If `l == 0` → `prefix[r]`
- Else → `prefix[r] - prefix[l - 1]`

---

## Time & Space Complexity

- Preprocessing: **O(n)**
- Query Handling: **O(1)** or **O(log n)** (depending on approach)
- Space Complexity: **O(n)**

---

## Why This Level?

This level strengthens your ability to:

- Optimize brute-force solutions
- Handle large constraints efficiently
- Combine prefix sum with other data structures

---

## What’s Next?

- 2D Prefix Sum
- Sliding Window + Prefix Hybrid

---

Consistent practice of these problems will significantly improve problem-solving speed and efficiency 
