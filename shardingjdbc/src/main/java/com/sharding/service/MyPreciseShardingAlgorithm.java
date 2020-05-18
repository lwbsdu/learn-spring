package com.sharding.service;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * 一些声明信息
 * Description:
 *
 * @author liuwenbin
 * @date 2020-05-14 15:13
 * @since JDK 1.8
 **/
public class MyPreciseShardingAlgorithm implements PreciseShardingAlgorithm {

    @Override
    public String doSharding(Collection availableTargetNames, PreciseShardingValue shardingValue) {

        System.out.println("enter doSharding");
        System.out.println("targetNames is " + availableTargetNames.toString());
        System.out.println("getColumnName is " + shardingValue.getColumnName());
        System.out.println("getLogicTableName is " + shardingValue.getLogicTableName());
        long value = Long.parseLong(shardingValue.getValue().toString());
        long finalValue = value / 100;
        String routeTableName = shardingValue.getLogicTableName() + "_" + finalValue;

        if (availableTargetNames.contains(routeTableName)) {
            return routeTableName;
        }
        return shardingValue.getLogicTableName();
    }
}
