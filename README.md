

<!-- 🔥 Title -->
<h1 align="center">
  <b>🚀 DSA IN JAVA — BUILDING MASTERY THROUGH PATTERNS</b>
</h1>

<p align="center">
  <i>“Not just solving problems — mastering the patterns that power them.”</i><br>
  <b>Crafted with 💻 Java, 💡 Logic, and ❤️ Consistency</b>
</p>

---



<p align="center">
  <b>💡 A structured, pattern-based roadmap to master Data Structures & Algorithms in Java.</b><br>
  <b>🚀 Built for logical clarity, pattern recognition, and interview excellence.</b>
</p>

---

## ⚡ About This Repository

This repository documents my journey to **master DSA using Java**, focusing on **patterns** instead of random problems.  
Each folder represents a **technique** like _Two Pointers_, _Sliding Window_, or _Strings_ — with clean, optimized, and well-commented Java solutions.

🎯 **Goal:** Build deep problem-solving intuition and reusable logic patterns for technical interviews.

---

## 🧭 Learning Roadmap

| Stage | Pattern Focus | Progress |
|:------|:---------------|:---------|
| 🟢 **Stage 1** | Arrays + Two Pointer | <img src="https://img.shields.io/badge/Progress-100%25-brightgreen?style=for-the-badge" /> |
| 🟡 **Stage 2** | Sliding Window | <img src="https://img.shields.io/badge/Progress-75%25-FFD600?style=for-the-badge" /> |
| 🔵 **Stage 3** | Strings & Subsequence | <img src="https://img.shields.io/badge/Progress-0%25-2979FF?style=for-the-badge" /> |
| 🔴 **Stage 4** | Recursion / Backtracking | <img src="https://img.shields.io/badge/Progress-0%25-E53935?style=for-the-badge" /> |

---

## 📂 Repository Structure

> 🧠 Each folder = one core DSA pattern  
> 📘 Each Java file = one problem with clean logic, explanation & complexity analysis.

```text
DSA-in-Java/
│
├── Arrays/
│   ├── ReverseArray.java
│   ├── MoveZeroes.java
│   ├── PairSum.java
│   └── MaxMinTournament.java
│
├── TwoPointers/
│   ├── CheckPalindrome.java
│   ├── MergeSortedArrays.java
│   ├── SeparateEvenOdd.java
│   └── PairClosestToTarget.java
│
├── SlidingWindow/
│   ├── MaxSumSubarray.java
│   ├── LongestUniqueSubstring.java
│   └── CountSubarraysWithSumK.java
│
├── Strings/
│   ├── AnagramCheck.java
│   ├── PalindromeSubstring.java
│   ├── CompressString.java
│   └── ReverseWords.java
│
├── Recursion/
│   ├── Factorial.java
│   ├── SubsequenceGenerator.java
│   ├── Permutations.java
│   └── PowerSet.java
│
└── README.md
```

---
## 🧠 Pattern-Driven Problem Solving

> Every problem follows a **pattern**.  
> Mastering these patterns helps you solve hundreds of questions — not just memorize answers.

---

### 🔍 My Thinking Framework

For every problem, I ask myself 👇

| Step | Question | Example |
|------|-----------|----------|
| 🧩 Step 1 | **Is the array or string sorted?** | If yes → use **Two Pointer** or **Binary Search** |
| 🔁 Step 2 | **Do I need pairs, triplets, or subarrays?** | Pairs → Two Pointer, Subarrays → Sliding Window |
| ⚙️ Step 3 | **Am I modifying in-place or using extra space?** | Helps decide between O(1) and O(n) space approaches |
| ⏱️ Step 4 | **What’s my target complexity?** | Optimize from brute-force to O(n) |
| 🧭 Step 5 | **Which pattern applies here?** | Choose from below 👇 |

---

### 🧩 Core DSA Patterns I Follow

| Pattern | Description | Example Problem |
|----------|--------------|----------------|
| **Two Pointer** | Works on sorted arrays for pair/triplet comparisons | Find Pair with Sum K, Merge Arrays |
| **Sliding Window** | Optimizes subarray/string range problems | Longest Unique Substring, Max Sum Subarray |
| **Fast–Slow Pointer** | Detect cycles or mid-points in linked structures | Detect Loop, Find Middle Node |
| **Binary Search on Answer** | Optimize min/max value problems | Minimum Days to Ship Packages |
| **Prefix Sum / Difference Array** | Range query optimizations | Subarray Sum Equals K |
| **Recursion / Backtracking** | Try all possibilities with pruning | Subsets, Permutations, N-Queens |
| **Dynamic Programming (DP)** | Store previous results to optimize | House Robber, LCS, Knapsack |

---

### 💡 Example Thought Process

#### Problem: Find maximum sum of a subarray of size K

| Step | Thought |
|------|----------|
| 1️⃣ | Array → sequential data → maybe **Sliding Window** pattern |
| 2️⃣ | Fixed-size subarray (size K) → classic window problem |
| 3️⃣ | Compute first window sum, then slide by removing one and adding next |
| ✅ | Complexity: O(n), Space: O(1) — clean and optimal |

```java
// Sliding Window Approach
public int maxSumSubarray(int[] arr, int k) {
    int sum = 0, maxSum = 0;
    for (int i = 0; i < k; i++) sum += arr[i];
    maxSum = sum;
    for (int i = k; i < arr.length; i++) {
        sum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
}
```
---

## 🏆 Highlights & Achievements

> 🚀 A quick overview of what makes this repository valuable and impactful for technical recruiters and peers.

| Category | Details |
|-----------|----------|
| 💻 **Problems Solved** | 50+ DSA problems in Java — structured and pattern-oriented |
| 🧩 **Core Patterns Covered** | Arrays, Two Pointers, Sliding Window, Strings, Recursion |
| ⚙️ **Optimization Mindset** | Focused on clean O(n) or O(log n) solutions instead of brute force |
| 🧠 **Interview Preparedness** | Designed to align with FAANG + Tier-1 coding interview patterns |
| 📚 **Documentation** | Each problem includes logic breakdown, edge cases, and complexity analysis |
| 🌱 **Learning Style** | Progressive approach — mastering one pattern before moving to the next |
| 🧭 **Goal** | Build deep pattern intuition rather than memorize solutions |

---

### ✨ Problem Solving Journey

I started by solving random problems — but soon realized:
> Patterns repeat. Logic connects them all.

That’s when I began structuring my DSA learning path around **problem-solving frameworks** —  
not just individual questions.  

Now, each topic I learn (like Two Pointers or Sliding Window) is connected to:
- 🔁 Reusable logic templates  
- ⚙️ Scalable thinking approach  
- 💬 Well-documented reasoning  

---

### 🎯 Skill Focus Areas

| Area | Skills |
|------|--------|
| 💻 Languages | Java (Core + OOP), Python (basic scripting) |
| 🧮 Algorithms | Two Pointer, Sliding Window, Prefix Sum, Recursion, DP |
| 🧠 Problem Solving | Pattern recognition, edge case analysis, optimization |
| 🔧 Tools | VS Code, GitHub, LeetCode, GeeksforGeeks |
| ☁️ Current Focus | Improving time complexity & readability across all solutions |

---

### 🪶 Code Style Philosophy

> “Readable code is powerful code.”

I follow a **Clean Code + Comment-first** approach:
- ✅ Each function begins with a short problem summary  
- 💬 Inline comments explain reasoning, not just syntax  
- 🧩 Code follows modular design (helper functions where needed)  
- ⚡ Prefer O(n) optimizations and intuitive logic flow  

```java
// Example style snippet
// Problem: Move all zeros to the end while maintaining order
public void moveZeroes(int[] nums) {
    int pos = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) nums[pos++] = nums[i];
    }
    while (pos < nums.length) nums[pos++] = 0;
}
```
---

## 📊 GitHub Stats & Visual Analytics

> 📈 Consistency beats intensity — this section tracks my growth, contributions, and activity in real time.

<p align="center">
  <img src="https://github-readme-streak-stats.herokuapp.com?user=vaibhavx002&theme=radical&hide_border=true&border_radius=8" height="160" alt="GitHub Streak"/>
  <img src="https://github-readme-stats.vercel.app/api?username=vaibhavx002&show_icons=true&theme=radical&hide_border=true&border_radius=8" height="160" alt="GitHub Stats"/>
</p>

<p align="center">
  <img src="https://github-readme-stats.vercel.app/api/top-langs/?username=vaibhavx002&layout=compact&theme=radical&hide_border=true&border_radius=8" height="160" alt="Top Languages"/>
</p>

---

### 🐍 Contribution Graph (Snake Animation)

> Watch my GitHub contributions come alive 🐍

<p align="center">
  <img src="https://github.com/vaibhavx002/vaibhavx002/blob/output/github-contribution-grid-snake.svg" alt="snake animation" />
</p>

---

### 🧠 Progress Tracking (Weekly Updates)

| Week | Focus Area | Key Problems Solved |
|------|-------------|----------------------|
| Week 1 | Arrays + Two Pointers | ReverseArray, MoveZeroes, PairSum |
| Week 2 | Sliding Window | MaxSumSubarray, LongestUniqueSubstring |
| Week 3 | Strings | AnagramCheck, CompressString |
| Week 4 | Recursion | SubsequenceGenerator, PowerSet |

> 💡 *I update this roadmap weekly to track my mastery across patterns.*

---

### 🎯 Visual Snapshot

<p align="center">
  <img src="https://github-profile-summary-cards.vercel.app/api/cards/profile-details?username=vaibhavx002&theme=radical" width="90%"/>
</p>

---

## 🌱 Currently Exploring

> Staying curious and constantly learning new problem-solving patterns.

- 🤖 **Generative AI & LLM Integrations** — connecting DSA logic to AI workflows  
- ☕ **Backend Architecture with DSA Principles** — efficient data flow + API optimization  
- ⚙️ **Dynamic Programming & Graph Theory** — next phase after recursion mastery  
- 💬 **System Design Basics** — scalability and high-level architecture  
- 📊 **Optimized Java Patterns** — applying DSA logic to real-world use cases  

> 🎯 Goal: Blend algorithmic thinking with practical, scalable software engineering.

---
## 💡 How I Approach DSA Learning

> DSA is not about solving random problems — it’s about building reusable mental models.

My personal formula for consistent learning:
1. **Understand the pattern**, not just the solution  
2. **Implement from scratch**, no copy-paste  
3. **Dry-run logic manually** on test cases  
4. **Analyze complexity** — Time ⏱️ + Space 💾  
5. **Document learnings** for future reference  

> 🧠 Over time, this builds “pattern memory” — so every new problem feels familiar.
---

## 🤝 Connect With Me

<p align="center">
  <a href="https://www.linkedin.com/in/vaibhavx002/" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white" />
  </a>
  <a href="mailto:vaibhavy002@gmail.com">
    <img src="https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white" />
  </a>
  <a href="https://github.com/vaibhavx002">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" />
  </a>
</p>

> 💬 Open to collaboration on **DSA**, **AI + Backend**, and **Open Source** projects.
---
<p align="center">
  ⭐ <b>"Patterns speak louder than problems."</b>  
  <br>— <i>Vaibhav Yadav</i>
</p>

