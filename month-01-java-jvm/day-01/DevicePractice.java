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
            String status = switch (device.status()) {
                case 1 -> "在线";
                case 0 -> "离线";
                default -> "未知";
            };
            System.out.println(device.devNo() + "：" + status);
        }

        // TODO 1: 使用 Stream 统计在线设备数量
        // TODO 2: 统计离线设备数量
        // TODO 3: 计算在线率，注意除数为 0 的情况
        // TODO 4: 输出设备总数、在线数、离线数和在线率
    }
}
