# Performance Comparison Report

 - **Current**: main (631950d8d4339441973745ce4bfa0be14d95d968) - 2024-05-22 10:01:47Z
 - **Baseline**: main (2ca21b8f425b12f574d08c5eaeb48a119659d781) - 2024-05-22 09:42:04Z

### Significant Changes To Duration

| Name                    | Type   | Duration                               | Count  |
| ----------------------- | ------ | -------------------------------------- | ------ |
| Flatlist 렌더링 최적화 전,후 비교 | render | 23.8 ms → 29.4 ms (+5.6 ms, +23.5%) 🔴 | 2 → 2  |
<details>
<summary>Show details</summary>

| Name                    | Type   | Duration                                                                                                                                                                                                                                | Count                                                                                                                                                                             |
| ----------------------- | ------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Flatlist 렌더링 최적화 전,후 비교 | render | **Baseline**<br/>Mean: 23.8 ms<br/>Stdev: 9.0 ms (37.7%)<br/>Runs: 16 21 20 23 16 19 17 43 35 28<br/><br/>**Current**<br/>Mean: 29.4 ms<br/>Stdev: 7.4 ms (25.3%)<br/>Runs: 27 23 26 31 39 30 24 24 29 21 31 29 25 23 33 27 26 32 33 55 | **Baseline**<br/>Mean: 2<br/>Stdev: 0 (0.0%)<br/>Runs: 2 2 2 2 2 2 2 2 2 2<br/><br/>**Current**<br/>Mean: 2<br/>Stdev: 0 (0.0%)<br/>Runs: 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 |
</details>



### Meaningless Changes To Duration

*There are no entries*


### Changes To Count

*There are no entries*


### Added Scenarios

*There are no entries*


### Removed Scenarios

*There are no entries*

