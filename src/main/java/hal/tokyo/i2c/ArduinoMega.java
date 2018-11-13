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


    /*    I2C通信用のグローバル変数    */
    private I2CBus bus;
    private I2CDevice device;

    /*    スレーブレジスタアドレス    */
    private int addr;

    /*    コンストラクタ    */
    public ArduinoMega() throws I2CFactory.UnsupportedBusNumberException, IOException {
        this(0x20);
    }

    /*    privateコンストラクタ    */
    private ArduinoMega(int addr) throws I2CFactory.UnsupportedBusNumberException, IOException {
        /*     ラズパイのI2C_BUS1に接続したと仮定    */
        this.bus = I2CFactory.getInstance(I2CBus.BUS_1);

        /*    ArduinoMegaのアドレスはターミナルから検索可能    */
        this.device = bus.getDevice(addr);
    }

    /*    データ読み取りメソッド    */
    public int read() throws IOException {
        return this.device.read();
    }

    /*    write to slave    */
    public void write(int data) throws IOException {
        this.device.write((byte) data);
    }

}
