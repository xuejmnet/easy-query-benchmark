# Easy-Query、Mybatis-Flex 和 Mybatis-Plus 性能对比

## 测试方法

使用 h2 数据库，在初始化的时候分别为 flex 和 plus 创建两个不同的数据库，
但是完全一样的数据结构、数据内容和数据量（每个库 2w 条数据）。

直接进行预热，之后通过打印时间戳进行对比，消耗的时间越少，性能越高（每次测试 10 轮）。

**测试步骤：**

- 1、clone 代码。
- 2、执行 `mvn clean package` 编译。
- 2、运行 `TestStarter` 的 `main` 方法。
