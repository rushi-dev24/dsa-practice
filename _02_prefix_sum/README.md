# Prefix Sum Problems

This folder contains basic to intermediate level Prefix Sum problems implemented in Java.

These problems focus on mastering range queries using prefix arrays for efficient O(1) query resolution after O(n) preprocessing.

---

## Problems Covered

- Range Sum Query
- Count Even Numbers in Range
- Count Odd Numbers in Range
- Count Positive and Negative Numbers in Range
- Running Sum of 1D Array
- Prefix Minimum Array
- Count Numbers Divisible by K in Range

---

## Concepts Practiced

- Prefix Sum Array
- Prefix Count Array
- Range Query Formula  
  - If `l == 0` → `prefix[r]`  
  - Else → `prefix[r] - prefix[l - 1]`
- Handling Edge Cases
- Time Complexity Optimization

---

## Time & Space Complexity

- Preprocessing: **O(n)**
- Each Query: **O(1)**
- Space Complexity: **O(n)**

---

These implementations strengthen understanding of range-based problems and build a strong foundation for advanced topics like:

- Subarray Sum Problems
- 2D Prefix Sum
- Difference Arrays
- Fenwick Tree (Binary Indexed Tree)
- Segment Tree
