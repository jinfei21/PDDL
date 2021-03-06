package io.pddl.datasource.support.strategy;

import javax.sql.DataSource;

import io.pddl.datasource.PartitionDataSource;

public class CycleReadStrategyWithWriteSupport extends CycleReadStrategySupport{
	
	@Override
	public DataSource getSlaveDataSource(PartitionDataSource pds) {
		return getDataSourceByCycle(pds,1);
	}
	
	@Override
	public String getStrategyName(){
		return "cycle-w";
	}

}
