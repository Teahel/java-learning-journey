import java.util.List;

public class DevicePractice {

    record Device(String devNo, int status) {}

    public static void main(String[] args) {

        var devices = List.of(
            new Device("D001", 1),
            new Device("D002", 0),
            new Device("D003", 1),
            new Device("D004", 1),
            new Device("D005", 0)
        );

        for (var device : devices) {
            String result = switch (device.status()) {
                case 1 -> "在线";
                case 0 -> "离线";
                default -> "未知";
            };
        }

        long onlineCount = devices.stream()
                .filter(device -> device.status() == 1)
                .count();

        long total = devices.size();

        double onlineRate = total == 0
                ? 0.0
                : (double) onlineCount / total * 100;

        System.out.println("统计在线设备数量:" + onlineCount);
        System.out.println("统计离线设备数量:" + (total - onlineCount));
        System.out.println("在线率：" + String.format("%.2f", onlineRate) + "%");
    }
}
