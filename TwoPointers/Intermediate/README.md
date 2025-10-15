<h2 align="center">🟡 Level 2 — Intermediate Two Pointer Patterns</h2>

<p align="center">
  <i>Where logic meets optimization — mastering sorted pair, triplet, and merging problems.</i><br>
  <b>Focus: Problem patterns → Optimized traversal → Practical interview applications</b>
</p>

---

### 💡 Overview
This level builds upon the basics you mastered in Level 1.  
Here, you’ll focus on **sorted data**, **pair/triplet logic**, and **frequency-based optimizations** that form the backbone of real interview questions.  

Each problem is chosen to teach you how to:
- Derive **relationships between multiple elements** efficiently  
- Handle **duplicates, sorted data, and constraints**
- Think in **patterns** — not just problem statements  

---

### 🎯 Learning Goals
| Goal | Description |
|------|--------------|
| 🧠 **Multi-Pointer Coordination** | Learn 3-pointer patterns for triplets and advanced pair logic |
| ⚙️ **Sorted Array Logic** | Use sorted properties to skip brute-force comparisons |
| 🧩 **Merging & Partitioning** | Build logic for merging arrays, intersections & in-place updates |
| 🔍 **Analytical Thinking** | Recognize the hidden structure behind popular interview problems |

---

### 🧠 Problem List — Intermediate Level

| # | Problem | Description | Complexity | File Link |
|:-:|----------|-------------|-------------|------------|
| 1️⃣ | **Remove duplicates from a sorted array (in-place)** | Modify array while keeping unique elements only | O(n) | [`RemoveDuplicates.java`](./logic/RemoveDuplicates.java) |
| 2️⃣ | **Count number of unique pairs with sum = K** | Use two pointers + frequency map | O(n) | [`CountUniquePairs.java`](./logic/CountUniquePairs.java) |
| 3️⃣ | **Count pairs with absolute difference = K** | Sorted array → move pointers based on difference | O(n) | [`PairsWithDiffK.java`](./logic/PairsWithDiffK.java) |
| 4️⃣ | **Find all pairs in sorted array with sum = K** | Classic 2-pointer technique for sorted arrays | O(n) | [`AllPairsSum.java`](./logic/AllPairsSum.java) |
| 5️⃣ | **Intersection of two sorted arrays** | Merge-style traversal of both arrays | O(n + m) | [`IntersectionSorted.java`](./logic/IntersectionSorted.java) |
| 6️⃣ | **Sort array of 0s, 1s and 2s (Dutch National Flag)** | Partition array using 3 pointers | O(n) | [`SortColors.java`](./logic/SortColors.java) |
| 7️⃣ | **Check if array can be partitioned into two equal sums** | Use prefix sums + hash set for fast lookup | O(n) | [`EqualSumPartition.java`](./logic/EqualSumPartition.java) |
| 8️⃣ | **Merge two sorted arrays without extra space (gap method)** | Efficient merging with minimal swaps | O((n + m) log(n + m)) | [`MergeWithoutExtraSpace.java`](./logic/MergeWithoutExtraSpace.java) |
| 9️⃣ | **Find closest pair from two sorted arrays whose sum = X** | Use two arrays → move pointers to minimize diff | O(n + m) | [`ClosestPairFrom2Arrays.java`](./logic/ClosestPairFrom2Arrays.java) |
| 🔟 | **3-Sum — Find unique triplets that sum to 0** | Nested two-pointer pattern | O(n²) | [`ThreeSum.java`](./logic/ThreeSum.java) |

---

### 🧩 Visual Concept

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=500&size=20&pause=1000&color=FFD600&center=true&vCenter=true&width=650&lines=Left+Pointer+➡️+Right+Pointer+⬅️;Shrink+Window+|+Expand+|+Skip+Duplicates;3-Pointer+Logic+for+Triplets+🧠" alt="Pointer movement animation" />
</p>

---

### 🧠 Pattern Insights

- **Sorted Array Tricks:**  
  Use sorted property to move pointers smartly instead of looping twice.  
- **Triplet Thinking:**  
  Fix one pointer and move the other two — a reusable O(n²) template.  
- **Gap Method Merge:**  
  Inspired by Shell Sort, minimizes swaps between two arrays.  
- **Dutch Flag Partition:**  
  A foundation for QuickSort partition logic and segregation problems.  

---

### 🚀 Next Step → Advanced Level
> Move to [**Level 3: Advanced Two Pointer Patterns**](../Advanced/README.md)  
> to learn triplet extensions, container problems, and optimization challenges used in FAANG interviews.

---

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&weight=500&size=22&pause=1000&color=FFD600&center=true&vCenter=true&width=750&lines=Level+2+Completed+🎯;Mastered+Intermediate+Two-Pointer+Patterns+🚀;Next:+Advanced+Challenges+Ahead+🔥" alt="Typing SVG" />
</p>
