package com.eoe.se1.day01;

import com.eoe.oop.day03.usb.Keyboard;
import com.eoe.oop.day03.usb.Mouse;
import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;
import com.eoe.se1.day01.entity.Computer;

public class Test05 {
	public static void main(String[] args) {
		Computer pc=new Computer();
		pc.start();
		//插个U盘
		pc.usbs[0]=new Udisk();
		//插个外界键盘
		pc.usbs[1]=new Keyboard();
		pc.usbs[2]=new Mouse();
		pc.usbs[3]=new USB() {
			
			@Override
			public void write(){
				System.out.println("扫描仪将扫描的数据发送至主机");
			}
			
			@Override
			public void read() {
				System.out.println("扫描仪扫描纸质文件");
			}
		};
		pc.run();
	}
}
