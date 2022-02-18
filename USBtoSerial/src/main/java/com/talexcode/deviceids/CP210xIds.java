package com.talexcode.deviceids;

import static com.talexcode.deviceids.Helpers.createDevice;
import static com.talexcode.deviceids.Helpers.createTable;

public class CP210xIds
{
    /* Different products and vendors of CP210x family
    // From current cp210x linux driver:
    https://github.com/torvalds/linux/blob/164c09978cebebd8b5fc198e9243777dbaecdfa0/drivers/usb/serial/cp210x.c
    */
    private static final long[] cp210xDevices = createTable(
            createDevice(0x045B, 0x0053),
            createDevice(0x0471, 0x066A),
            createDevice(0x0489, 0xE000),
            createDevice(0x0489, 0xE003),
            createDevice(0x0745, 0x1000),
            createDevice(0x0846, 0x1100),
            createDevice(0x08e6, 0x5501),
            createDevice(0x08FD, 0x000A),
            createDevice(0x0BED, 0x1100),
            createDevice(0x0BED, 0x1101),
            createDevice(0x0FCF, 0x1003),
            createDevice(0x0FCF, 0x1004),
            createDevice(0x0FCF, 0x1006),
            createDevice(0x0FDE, 0xCA05),
            createDevice(0x10A6, 0xAA26),
            createDevice(0x10AB, 0x10C5),
            createDevice(0x10B5, 0xAC70),
            createDevice(0x10C4, 0x0F91),
            createDevice(0x10C4, 0x1101),
            createDevice(0x10C4, 0x1601),
            createDevice(0x10C4, 0x800A),
            createDevice(0x10C4, 0x803B),
            createDevice(0x10C4, 0x8044),
            createDevice(0x10C4, 0x804E),
            createDevice(0x10C4, 0x8053),
            createDevice(0x10C4, 0x8054),
            createDevice(0x10C4, 0x8066),
            createDevice(0x10C4, 0x806F),
            createDevice(0x10C4, 0x807A),
            createDevice(0x10C4, 0x80C4),
            createDevice(0x10C4, 0x80CA),
            createDevice(0x10C4, 0x80DD),
            createDevice(0x10C4, 0x80F6),
            createDevice(0x10C4, 0x8115),
            createDevice(0x10C4, 0x813D),
            createDevice(0x10C4, 0x813F),
            createDevice(0x10C4, 0x814A),
            createDevice(0x10C4, 0x814B),
            createDevice(0x2405, 0x0003),
            createDevice(0x10C4, 0x8156),
            createDevice(0x10C4, 0x815E),
            createDevice(0x10C4, 0x815F),
            createDevice(0x10C4, 0x818B),
            createDevice(0x10C4, 0x819F),
            createDevice(0x10C4, 0x81A6),
            createDevice(0x10C4, 0x81A9),
            createDevice(0x10C4, 0x81AC),
            createDevice(0x10C4, 0x81AD),
            createDevice(0x10C4, 0x81C8),
            createDevice(0x10C4, 0x81E2),
            createDevice(0x10C4, 0x81E7),
            createDevice(0x10C4, 0x81E8),
            createDevice(0x10C4, 0x81F2),
            createDevice(0x10C4, 0x8218),
            createDevice(0x10C4, 0x822B),
            createDevice(0x10C4, 0x826B),
            createDevice(0x10C4, 0x8281),
            createDevice(0x10C4, 0x8293),
            createDevice(0x10C4, 0x82F9),
            createDevice(0x10C4, 0x8341),
            createDevice(0x10C4, 0x8382),
            createDevice(0x10C4, 0x83A8),
            createDevice(0x10C4, 0x83D8),
            createDevice(0x10C4, 0x8411),
            createDevice(0x10C4, 0x8418),
            createDevice(0x10C4, 0x846E),
            createDevice(0x10C4, 0x8477),
            createDevice(0x10C4, 0x85EA),
            createDevice(0x10C4, 0x85EB),
            createDevice(0x10C4, 0x85F8),
            createDevice(0x10C4, 0x8664),
            createDevice(0x10C4, 0x8665),
            createDevice(0x10C4, 0x875C),
            createDevice(0x10C4, 0x88A4),
            createDevice(0x10C4, 0x88A5),
            createDevice(0x10C4, 0xEA60),
            createDevice(0x10C4, 0xEA61),
            createDevice(0x10C4, 0xEA63),
            createDevice(0x10C4, 0xEA70),
            createDevice(0x10C4, 0xEA71),
            createDevice(0x10C4, 0xEA7A),
            createDevice(0x10C4, 0xEA7B),
            createDevice(0x10C4, 0xEA80),
            createDevice(0x10C4, 0xF001),
            createDevice(0x10C4, 0xF002),
            createDevice(0x10C4, 0xF003),
            createDevice(0x10C4, 0xF004),
            createDevice(0x10C5, 0xEA61),
            createDevice(0x10CE, 0xEA6A),
            createDevice(0x13AD, 0x9999),
            createDevice(0x1555, 0x0004),
            createDevice(0x166A, 0x0201),
            createDevice(0x166A, 0x0301),
            createDevice(0x166A, 0x0303),
            createDevice(0x166A, 0x0304),
            createDevice(0x166A, 0x0305),
            createDevice(0x166A, 0x0401),
            createDevice(0x166A, 0x0101),
            createDevice(0x16D6, 0x0001),
            createDevice(0x16DC, 0x0010),
            createDevice(0x16DC, 0x0011),
            createDevice(0x16DC, 0x0012),
            createDevice(0x16DC, 0x0015),
            createDevice(0x17A8, 0x0001),
            createDevice(0x17A8, 0x0005),
            createDevice(0x17F4, 0xAAAA),
            createDevice(0x1843, 0x0200),
            createDevice(0x18EF, 0xE00F),
            createDevice(0x1ADB, 0x0001),
            createDevice(0x1BE3, 0x07A6),
            createDevice(0x1E29, 0x0102),
            createDevice(0x1E29, 0x0501),
            createDevice(0x1FB9, 0x0100),
            createDevice(0x1FB9, 0x0200),
            createDevice(0x1FB9, 0x0201),
            createDevice(0x1FB9, 0x0202),
            createDevice(0x1FB9, 0x0203),
            createDevice(0x1FB9, 0x0300),
            createDevice(0x1FB9, 0x0301),
            createDevice(0x1FB9, 0x0302),
            createDevice(0x1FB9, 0x0303),
            createDevice(0x1FB9, 0x0400),
            createDevice(0x1FB9, 0x0401),
            createDevice(0x1FB9, 0x0402),
            createDevice(0x1FB9, 0x0403),
            createDevice(0x1FB9, 0x0404),
            createDevice(0x1FB9, 0x0600),
            createDevice(0x1FB9, 0x0601),
            createDevice(0x1FB9, 0x0602),
            createDevice(0x1FB9, 0x0700),
            createDevice(0x1FB9, 0x0701),
            createDevice(0x3195, 0xF190),
            createDevice(0x3195, 0xF280),
            createDevice(0x3195, 0xF281),
            createDevice(0x413C, 0x9500),
            createDevice(0x1908, 0x2311)    //serial of CMOS camera
    );

    public static boolean isDeviceSupported(int vendorId, int productId)
    {
        return com.talexcode.deviceids.Helpers.exists(cp210xDevices, vendorId, productId);
    }
}
