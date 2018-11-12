/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hal.tokyo.i2c;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import java.io.IOException;

/**
 *
 * @author gn5r
 */
public class ArduinoMega {

    /*    ArduinoMegaのI2Cアドレス    */
    public final static int ArduinoMega_ADDRESS = 0x40;

    /*    I2C通信用のグローバル変数    */
    private I2CBus bus;
    private I2CDevice device;

    /*    コンストラクタ    */
    public ArduinoMega() throws I2CFactory.UnsupportedBusNumberException, IOException {
        this(ArduinoMega_ADDRESS);
    }

    /*    privateコンストラクタ    */
    private ArduinoMega(int addr) throws I2CFactory.UnsupportedBusNumberException, IOException {
        /*     ラズパイのI2C_BUS1に接続したと仮定    */
        this.bus = I2CFactory.getInstance(I2CBus.BUS_1);

        /*    ArduinoMegaのアドレスはターミナルから検索可能    */
        this.device = bus.getDevice(addr);
    }
    
    /*    Address表示用メソッド    */
    public void getAddress(){
        System.out.println(String.valueOf(this.device.getAddress()));
    }

    /*    データ読み取りメソッド    */
    public int read() throws IOException {
        return this.device.read();
    }
}
