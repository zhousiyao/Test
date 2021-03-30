import 'package:flutter/cupertino.dart';

class CommonUtils{

  static DateTime _lastPopTime = DateTime.now();
  static banMultiClick({@required Function funFuture , int duration = 1}){
    print("_lastPopTime = ${_lastPopTime} DateTime.now() = ${DateTime.now()} ");
    if(_lastPopTime == null || DateTime.now().difference(_lastPopTime) > Duration(seconds: duration)){
      _lastPopTime = DateTime.now();
      // ignore: unnecessary_statements
      funFuture();
    }else{
      // lastPopTime = DateTime.now(); //如果不注释这行,则强制用户一定要间隔2s后才能成功点击. 而不是以上一次点击成功的时间开始计算.
      print("_lastPopTime 请勿重复点击！");
      return;
    }
  }

  static DateTime getLastDateTime(){
    return _lastPopTime;
  }

}