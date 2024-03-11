# exercises

Design a Turing Machine that recognizes the words of the language:

$$
L=\{0^n1^n|n>=1\}
$$

| State | 0 | 1 | b | r | desc |
|---|---| --- | --- | --- | --- |
| $s_0$ | $s_0, R$ | $s1, R$ | $s_{halt}$ | $s_{halt}$ | Find the whole string of continuous 0's |
| $s_1$ | $s_{halt}$ | $s1, R$ | $s_2, L$ | $s_{halt}$ | Find the whole string of continuous 1's |
| $s_2$ | $s_3, write \space r, R$ | $s_2, L$ | $s_{halt}$| $s_2, L$ | Backtrack to first 0 |
| $s_3$ | $s_{halt}$ | $s_2, write \space r, L$ | $s_4, L$ | $s_3, R$ | Forward to first 1 |
| $s_4$ | $s_{halt}$ | $s_{halt}$ | $s_{accept}$ | $s_4, L$ | Backtrack to ensure all 'r' before blank |
