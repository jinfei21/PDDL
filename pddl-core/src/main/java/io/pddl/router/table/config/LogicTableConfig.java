package io.pddl.router.table.config;

import java.util.List;

import io.pddl.router.strategy.config.ShardingStrategyConfig;

public class LogicTableConfig extends AbstractLogicTableConfig{

	private List<String> tablePostfixies;
	
	private ShardingStrategyConfig tableStrategyConfig;
	
	private ShardingStrategyConfig dataSourceStrategyConfig;
	
	public void setTablePostfixes(List<String> tablePostfixies){
		this.tablePostfixies= tablePostfixies;
	}
	
	@Override
	public List<String> getTablePostfixes(){
		return tablePostfixies;
	}
	
	public void setTableStrategyConfig(ShardingStrategyConfig tableStrategyConfig){
		this.tableStrategyConfig= tableStrategyConfig;
	}
	
	@Override
	public ShardingStrategyConfig getTableStrategyConfig(){
		return tableStrategyConfig;
	}
	
	public void setDatabaseStrategyConfig(ShardingStrategyConfig databaseStrategyConfig){
		this.dataSourceStrategyConfig= databaseStrategyConfig;
	}
	
	@Override
	public ShardingStrategyConfig getDataSourceStrategyConfig(){
		return dataSourceStrategyConfig;
	}
}
