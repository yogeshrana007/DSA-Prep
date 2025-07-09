


```markdown
# 🧠 Java-Prep

Welcome to my Java Preparation repository!  
This repo contains clean, topic-wise Java solutions to help understand data structures, algorithms, and core Java concepts — all in one place.

---



Each folder may contain:
- 🧠 Concept practice
- 📄 Interview questions
- ✅ LeetCode/GFG solutions
- 🧪 Custom logic with main method

---

## 🚀 How to Compile and Run Java Files

### ✅ If there's **no `package` declaration**:
Just go into the folder and run:
```bash
javac FileName.java
java FileName
````

Example:

```bash
cd StackP
javac ValidParanthesis.java
java ValidParanthesis
```

---

### 🏷 If there's a `package` declaration (e.g. `package StackP.PracticeQ;`):

#### ✅ Folder structure must match the package:

For this line:

```java
package StackP.PracticeQ;
```

The file should be placed like:

```
Java-Prep/StackP/PracticeQ/FileName.java
```

Then from root (`Java-Prep`), compile and run:

```bash
javac StackP/PracticeQ/FileName.java
java StackP.PracticeQ.FileName
```

### ⚠️ Important Notes on Packages:

* Don’t run `java FileName` if package is declared.
* Only one `public class` per file.
* Use package structure to avoid name clashes and for better project organization.

---

## 📘 Topics Covered (as of now)

| Topic         | Description                                    |
| ------------- | ---------------------------------------------- |
| ✅ Patterns    | Star and number pattern problems               |
| ✅ Stack       | Stack problems with custom LL & built-in Stack |
| ✅ Recursion   | Base case & recursive case practice            |
| ✅ Sorting     | Bubble, Selection, Insertion, etc.             |
| ✅ Searching   | Linear and Binary search                       |
| 🔜 Trees      | Tree traversal, height, leaf count             |
| 🔜 BST        | Binary Search Tree problems                    |
| 🔜 Hashing    | Frequency maps, sets, hash tables              |
| 🔜 DP         | Tabulation, Memoization, 1D/2D DP              |
| 🔜 Queues     | Queue, Circular Queue, Deque                   |
| 🔜 LinkedList | Single/Double LL, reverse, mid-node            |

---

## 🎯 Why This Repo?

* 🎓 Perfect for college students and freshers
* 🧪 Helps practice for interviews and coding rounds
* 📦 Organized with optional `package` support
* 🧠 Clean logic and beginner-friendly style

---

## 🛠️ How You Can Use This

* Clone this repo:

```bash
git clone https://github.com/yogeshrana007/Java-Prep.git
cd Java-Prep
```

* Pick a topic folder (e.g., `Recursion`, `StackP`, `DP`)
* Open the `.java` file
* Compile & run using instructions above

---

## 🤝 Contribute

Found an error or have a better solution?

* Fork the repo
* Add or fix problems
* Create a Pull Request 🙌

---

## 🙋‍♂️ Author

**👤 Yogesh Rana**
Computer Science Student | DSA & Java Learner

---

**Star this repo** ⭐ if it helps you in your journey!

> Happy Coding 💻⚡

````

---

### ✅ Next Step:
1. Create a new `README.md` in your repo.
2. Paste the content above.
3. Commit and push:
```bash
git add README.md
git commit -m "📘 Added generalized README with run instructions and topic roadmap"
git push
````


