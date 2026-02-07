[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/xv5QGBUN)
# Experiment 37: Longest Common Prefix

## Problem Statement

Write a program to find the longest common prefix string amongst an array of strings.
If there is no common prefix, print "-1".

## Input Format

* First line: An integer $N$ (number of strings).
* Next $N$ lines: The strings.

## Output Format

* Print the longest common prefix.
* If no common prefix exists, print `-1`.

### Example 1

**Input:**

```text
3
flower
flow
flight
```

**Output:**

```text
fl
```

### Explanation
* "flower" vs "flow" -> common prefix "flow"
* "flow" vs "flight" -> common prefix "fl"
