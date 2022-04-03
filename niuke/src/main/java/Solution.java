public class Solution {
    /**
     * 验证IP地址
     * @param IP string字符串 一个IP地址字符串
     * @return string字符串
     */
    public String solve (String IP) {
        // write code here
        if (IP.contains(".") && isV4(IP)) return "IPv4";
        if (IP.contains(":") && isV6(IP)) return "IPv6";
        else return "Neither";
    }

    private boolean isV4(String ip) {
        String[] split = ip.split("\\.");
        return true;
    }

    private boolean isV6(String ip) {
        return true;
    }
}