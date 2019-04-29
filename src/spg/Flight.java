package spg;

import lyh.*;
import yqh.*;

import java.util.*;

public class Flight implements spg.Tool {
    private String flightNum;//航班号
    private String airways;//航空公司
    private String[] place = new String[3];//起飞、经停、降落地点
    private MyTime[] time = new MyTime[4];//起飞、经停、再飞、到达时间
    private int[] resTicket = new int[2];//余票
    private int[] status = new int[3];//航班状态，枚举，正常，延误，取消
    private int[] price = new int[2];//票价
    private int[] waybill = new int[MAXCAPACITY];//乘客名单
    private Queue[] appointList = new Queue[MAXCAPACITY];//预约名单

    //增加航班
    public void addFlight() {

    }

    //删除航班
    public void deleteFlight() {

    }

    //修改航班信息
    public void modifyInfo() {

    }

    //查找航班
    public void seekFlight() {
        
    }
}
