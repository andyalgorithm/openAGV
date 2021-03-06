package com.robot.mvc.core.interfaces;


/**
 * 工站动作接口
 *
 * @author Laotang
 * @blame Android Team
 */
public interface IAction {

    /**
     * 动作名称，必须保证全局唯一
     * @return
     */
//    String actionKey(String actionKey);
    /**取动作名称*/
    String actionKey();

    /**
     * 车辆ID
     */
//    String vehicleId(String vehicleId);
    /** 取车辆ID */
    String vehicleId();

    /***
     * 工站设备ID
     * @return
     */
//    String deviceId(String deviceId);
    /** 取工站终端设备ID */
    String deviceId();

    /** 取工站名称 */
    String locationName();
    /**
     * 执行操作
     *
     * @param operation 主任务动作名称，由adapter传入
     * @param actionKey 动作名称
     * @param vehicleId 车辆ID
     * @param deviceId 设备模块(终端)ID
     * @param locationName 工站名称
     */
    void execute(String operation, String actionKey, String vehicleId, String deviceId, String locationName) throws Exception;

}
