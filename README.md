# Mybatis-Flex 和 Mybatis-Plus 性能对比

## 测试方法

使用 h2 数据库，在初始化的时候分别为 flex 和 plus 创建两个不同的数据库，
但是完全一样的数据结构、数据内容和数据量（每个库 2w 条数据）。

直接进行预热，之后通过打印时间戳进行对比，消耗的时间越少，性能越高（每次测试 10 轮）。

**测试步骤：**

- 1、clone 代码。
- 2、执行 `mvn clean package` 编译。
- 2、运行 `TestStarter` 的 `main` 方法。

## 查询单条数据

> Mybatis-Flex 的性能大概是 Mybatis-Plus 的 5 ~ 10+ 倍。

以下是日志，需要注意的是：每台机器的每次测试的数值肯定有所不同，但是应该会维持一个大概的比例。

```
---------------
>>>>>>>testFlexSelectOne:134
>>>>>>>testPlusSelectOneWithLambda:989
>>>>>>>testPlusSelectOne:830
---------------
>>>>>>>testFlexSelectOne:75
>>>>>>>testPlusSelectOneWithLambda:732
>>>>>>>testPlusSelectOne:795
---------------
>>>>>>>testFlexSelectOne:65
>>>>>>>testPlusSelectOneWithLambda:938
>>>>>>>testPlusSelectOne:714
---------------
>>>>>>>testFlexSelectOne:105
>>>>>>>testPlusSelectOneWithLambda:740
>>>>>>>testPlusSelectOne:669
---------------
>>>>>>>testFlexSelectOne:57
>>>>>>>testPlusSelectOneWithLambda:691
>>>>>>>testPlusSelectOne:773
---------------
>>>>>>>testFlexSelectOne:65
>>>>>>>testPlusSelectOneWithLambda:693
>>>>>>>testPlusSelectOne:695
---------------
>>>>>>>testFlexSelectOne:56
>>>>>>>testPlusSelectOneWithLambda:754
>>>>>>>testPlusSelectOne:665
---------------
>>>>>>>testFlexSelectOne:56
>>>>>>>testPlusSelectOneWithLambda:714
>>>>>>>testPlusSelectOne:717
---------------
>>>>>>>testFlexSelectOne:57
>>>>>>>testPlusSelectOneWithLambda:696
>>>>>>>testPlusSelectOne:671
---------------
>>>>>>>testFlexSelectOne:59
>>>>>>>testPlusSelectOneWithLambda:739
>>>>>>>testPlusSelectOne:659
```

## 查询 List 数据，限制 10 条

> Mybatis-Flex 的性能大概是 Mybatis-Plus 的 5~10 倍左右

```
---------------
>>>>>>>testFlexSelectTop10:90
>>>>>>>testPlusSelectTop10WithLambda:743
>>>>>>>testPlusSelectTop10:678
---------------
>>>>>>>testFlexSelectTop10:85
>>>>>>>testPlusSelectTop10WithLambda:692
>>>>>>>testPlusSelectTop10:684
---------------
>>>>>>>testFlexSelectTop10:84
>>>>>>>testPlusSelectTop10WithLambda:692
>>>>>>>testPlusSelectTop10:670
---------------
>>>>>>>testFlexSelectTop10:85
>>>>>>>testPlusSelectTop10WithLambda:737
>>>>>>>testPlusSelectTop10:667
---------------
>>>>>>>testFlexSelectTop10:85
>>>>>>>testPlusSelectTop10WithLambda:691
>>>>>>>testPlusSelectTop10:684
---------------
>>>>>>>testFlexSelectTop10:97
>>>>>>>testPlusSelectTop10WithLambda:760
>>>>>>>testPlusSelectTop10:666
---------------
>>>>>>>testFlexSelectTop10:80
>>>>>>>testPlusSelectTop10WithLambda:673
>>>>>>>testPlusSelectTop10:637
---------------
>>>>>>>testFlexSelectTop10:81
>>>>>>>testPlusSelectTop10WithLambda:653
>>>>>>>testPlusSelectTop10:639
---------------
>>>>>>>testFlexSelectTop10:82
>>>>>>>testPlusSelectTop10WithLambda:659
>>>>>>>testPlusSelectTop10:636
---------------
>>>>>>>testFlexSelectTop10:81
>>>>>>>testPlusSelectTop10WithLambda:654
>>>>>>>testPlusSelectTop10:656
```

## 分页查询

> Mybatis-Flex 的性能大概是 Mybatis-Plus 的 5~10 倍左右

```
---------------
>>>>>>>testFlexPaginate:90
>>>>>>>testPlusPaginate:671
---------------
>>>>>>>testFlexPaginate:78
>>>>>>>testPlusPaginate:643
---------------
>>>>>>>testFlexPaginate:80
>>>>>>>testPlusPaginate:638
---------------
>>>>>>>testFlexPaginate:79
>>>>>>>testPlusPaginate:613
---------------
>>>>>>>testFlexPaginate:75
>>>>>>>testPlusPaginate:627
---------------
>>>>>>>testFlexPaginate:72
>>>>>>>testPlusPaginate:606
---------------
>>>>>>>testFlexPaginate:69
>>>>>>>testPlusPaginate:585
---------------
>>>>>>>testFlexPaginate:70
>>>>>>>testPlusPaginate:589
---------------
>>>>>>>testFlexPaginate:69
>>>>>>>testPlusPaginate:586
---------------
>>>>>>>testFlexPaginate:68
>>>>>>>testPlusPaginate:585
```

## 数据更新

> Mybatis-Flex 的性能大概是 Mybatis-Plus 的 5~10+ 倍左右。

```
---------------
>>>>>>>testFlexUpdate:58
>>>>>>>testPlusUpdate:524
---------------
>>>>>>>testFlexUpdate:51
>>>>>>>testPlusUpdate:503
---------------
>>>>>>>testFlexUpdate:49
>>>>>>>testPlusUpdate:490
---------------
>>>>>>>testFlexUpdate:45
>>>>>>>testPlusUpdate:472
---------------
>>>>>>>testFlexUpdate:48
>>>>>>>testPlusUpdate:470
---------------
>>>>>>>testFlexUpdate:44
>>>>>>>testPlusUpdate:460
---------------
>>>>>>>testFlexUpdate:43
>>>>>>>testPlusUpdate:459
---------------
>>>>>>>testFlexUpdate:44
>>>>>>>testPlusUpdate:461
---------------
>>>>>>>testFlexUpdate:40
>>>>>>>testPlusUpdate:444
---------------
>>>>>>>testFlexUpdate:41
>>>>>>>testPlusUpdate:444
```

