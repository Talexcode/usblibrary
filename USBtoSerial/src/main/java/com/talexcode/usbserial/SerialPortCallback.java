package com.talexcode.usbserial;

import java.util.List;


public interface SerialPortCallback {
    void onSerialPortsDetected(List<com.talexcode.usbserial.UsbSerialDevice> serialPorts);
}
