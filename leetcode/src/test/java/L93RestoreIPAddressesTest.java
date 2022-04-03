import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class L93RestoreIPAddressesTest {

    @Test
    public void restoreIpAddresses1() {
        List<String> list = L93RestoreIPAddresses.restoreIpAddresses("25525511135");
        assertEquals(Arrays.asList("255.255.11.135", "255.255.111.35"), list);
    }

    @Test
    public void restoreIpAddresses2() {
        List<String> list = L93RestoreIPAddresses.restoreIpAddresses("0000");
        assertEquals(Arrays.asList("0.0.0.0"), list);
    }

    @Test
    public void restoreIpAddresses3() {
        List<String> list = L93RestoreIPAddresses.restoreIpAddresses("1111");
        assertEquals(Arrays.asList("1.1.1.1"), list);
    }

    @Test
    public void restoreIpAddresses4() {
        List<String> list = L93RestoreIPAddresses.restoreIpAddresses("010010");
        assertEquals(Arrays.asList("0.10.0.10", "0.100.1.0"), list);
    }

    @Test
    public void restoreIpAddresses5() {
        List<String> list = L93RestoreIPAddresses.restoreIpAddresses("101023");
        assertEquals(Arrays.asList("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"), list);
    }

    @Test
    public void restoreIpAddresses6() {
        List<String> list = L93RestoreIPAddresses.restoreIpAddresses("172162541");
        assertEquals(Arrays.asList("17.216.25.41","17.216.254.1",
                "172.16.25.41","172.16.254.1",
                "172.162.5.41","172.162.54.1"), list);
    }

}