# Day 1：Java 17 新语法 — 学习记录

日期：2026-10-15

## 学习目标
1. 了解 Java 8 到 Java 17 的变化。
2. 练习 `var`、Switch 表达式、Record。
3. 使用 Stream API 统计设备在线率，格式化为两位小数。

## 已提交代码
[DevicePractice.java](DevicePractice.java) — 本人提交的练习版本（保留原有逻辑）。

包含 5 台模拟设备（在线 3、离线 2），通过 Stream `filter().count()` 统计在线数量，以 `(double) onlineCount / total * 100` 计算在线率，并用 `String.format("%.2f", onlineRate)` 输出两位小数。空集合情况下避免除零。

**预期统计输出**：
```text
统计在线设备数量:3
统计离线设备数量:2
在线率：60.00%
```

> 这是静态检查的预期输出；未核实本机运行日志。

## 代码评审
- 练习评分：90/100（基于静态检查）。
- 已完成在线数量与在线率计算、两位小数格式化，练习判定通过。
- 待改善 1：Switch 得到的 `result` 尚未输出，建议打印每台设备状态。
- 待改善 2：`total - onlineCount` 将未知状态也计为离线。存在未知状态时，应该另外统计 `status == 0`。
- 后续练习：在数据中加入状态码 2，正确统计在线/离线/未知数量。

## 今日打卡
- [x] 已完成代码练习并提交 GitHub
- [x] 已获得代码评审反馈
- [ ] 在 IDEA 中实际运行并记录输出（未提供运行截图/日志）
- [ ] 完成 3 道小测验（尚未提供答案）

## 下一课
Day 2：Stream API 的 `filter`、`map`、`collect`、`groupingBy`，结合设备管理统计练习。
