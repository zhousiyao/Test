package com.zsy.superp.java.design_mode.factory;

public class EasyFactory {

    /**
     * 简单工厂
     * @param objName
     * @return
     */
    public static Object createObject(String objName){
        if(null == objName) return null;
        Object obj = null;
        if (objName.equals("String")){
            obj = new String("StringObject");
        }else if(objName.equals("Integer")){
            obj = new Integer(0);
        }
        return obj;
    }
}
