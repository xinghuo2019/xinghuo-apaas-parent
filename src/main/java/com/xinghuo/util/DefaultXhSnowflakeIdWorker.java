package com.xinghuo.util;

/**
 * 生产唯一ID的方法
 * @author hfz
 *
 */
public class DefaultXhSnowflakeIdWorker extends XhSnowflakeIdWorker{

	private static final class IdWorker{
		private static final DefaultXhSnowflakeIdWorker defaultXhSnowflakeIdWorker = new DefaultXhSnowflakeIdWorker();
	}
	
	private DefaultXhSnowflakeIdWorker(){
		super();
	}
	
	private long getNextId(){
		return nextId();
	}
	/**
	 * 调用入口
	 * @return 唯一ID
	 */
	public static final String GET_STRING_ID(){
		DefaultXhSnowflakeIdWorker idWorker = IdWorker.defaultXhSnowflakeIdWorker;
		return String.valueOf(idWorker.getNextId());
	}
	
	public static final long GET_LONG_ID(){
		DefaultXhSnowflakeIdWorker idWorker = IdWorker.defaultXhSnowflakeIdWorker;
		return idWorker.getNextId();
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(GET_STRING_ID());
		}
	}
	
}
